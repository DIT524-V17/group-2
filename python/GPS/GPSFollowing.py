import threading
import time
import serial
import pynmea2
import socket
import boltons.socketutils
from random import randrange, uniform
from GpsAngle import calculateBearing, calculateDistance

"""
Script that fetches the SmartCar's coordinates, compare them to the mobile device's coordinates,
and sends movement commands to the SmartCar to make it follow the mobile device in real time

Author Erik Laurin
"""

"""
sudo systemctl stop gpsd.socket
sudo systemctl disable gpsd.socket

gpsctl -n -D 4 /dev/ttyUSB0

sudo killall gpsd
sudo gpsd /dev/ttyUSB0 -F /var/run/gpsd.sock
"""

# final variables
a = 'A'
s = 'S'
update_frequency = 2

# serials
serial_GPS = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)
# serial_arduino = serial.Serial('/dev/ttyACM0', 9600)

# Variables for sending SmartCar GPS data
send_server_name = 'localhost'
send_server_port = 8000
send_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
send_socket.connect((send_server_name, send_server_port))

# Variables for retrieving phone GPS data
receive_server_name = 'localhost'
receive_server_port = 8001
receive_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
receive_socket.connect((receive_server_name, receive_server_port))
buffered_receive_socket = boltons.socketutils.BufferedSocket(receive_socket, 0, 1024, )

# Phone Coordinates
phone_longitude = ''
phone_latitude = ''

# SmartCar Coordinates
smartcar_longitude = ''
smartcar_latitude = ''
old_angle = 0

class threading_GPS_following():

    def send_smartcar_coordinates(self):
        """
        Sends a message to the Java server (used for SmartCar's coordinates)

        Author Gabriel
        """

        coordinates_smartcar = 'SC' + str(smartcar_latitude) + " " + str(smartcar_longitude) + "\n"
        send_socket.sendto(coordinates_smartcar.encode('utf-8'), (send_server_name, send_server_port))

    def get_phone_coordinates(self):
        """
        Receives the phone's coordinates through the specified socket and assign latitude and longitude their values
        """
        phone_coordinates = buffered_receive_socket.recv_until('\n')
        if phone_coordinates.startswith('P'):
            global phone_latitude
            global phone_longitude
            phone_coordinates_noprefix = phone_coordinates[1:]
            phone_latitude, phone_longitude = phone_coordinates_noprefix.split()
            print('phone_longitude: ' + phone_longitude)
            print('phone_latitude: ' + phone_latitude)

    def send_angle(self, angle):
        """
        Sends angle to the Arduino
        :param angle: in degrees how much the SmartCar should turn
        """
        byte_angle = str.encode(a + str(angle) + '\n')
        # serialArduino.write(byte_angle)
        print("Sent to arduino: " + byte_angle)

    def send_speed(self, speed):
        """
        Sends speed to the Arduino
        :param speed: the speed the SmartCar should be set to
        """
        byte_speed = str.encode(s + str(speed) + '\n')
        # serialArduino.write(byte_speed)
        print("Sent to arduino: " + byte_speed)

    def drive(self, pdop, fix):
        """
        Evaluates if the SmartCar should move, and if so, what speed it should have
        :param angle: the angle, in degrees, there is between the two different positions
        :param distance: the distance, in meters, there is between the positions
        :param pdop: the position (3D) dilution of precision (horizontal and vertical DOP combined)
        :param fix: type of fix.
            0 = no fix
            1 = SPS
            2 = DGPS
            3 = SPS
        """

        global old_angle

        distance = calculateDistance(smartcar_latitude, uniform(-90, 90), smartcar_longitude,
                                     uniform(-180, 180)) * 1000  # Multiplied with 1000 to get m from km
        angle = calculateBearing(smartcar_latitude, smartcar_longitude, uniform(-90, 90), uniform(-180, 180))

        """ disregard minor changes in angle """
        if abs(angle - old_angle) < 5:
            return
        else:
            old_angle = angle

        """ if precision too poor - stops SmartCar and returns """
        if pdop > 6 and fix not in [1, 2, 3]:
            self.send_speed(0)
            return

        """ sets speed depending on distance to traveler """
        if distance > 15:
            speed = 70
        elif distance < 15 and distance > 3:
            speed = 40
        else:
            speed = 0

        """ sends angle """
        self.send_angle(angle)

        """ waits until the SmartCar has had enough time to turn """
        if angle < 180:
            time.sleep(1)
        else:
            time.sleep(2)

        """ sends speed """
        self.send_speed(speed)

        """ determines the update frequency"""
        time.sleep(update_frequency)


    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        thread.start()  # Start the execution

    def run(self):
        """ Method that runs forever """

        pdop = 99
        global smartcar_latitude
        global smartcar_longitude

        while 1:
            try:
                """retrieve GPS coordinates from phone application"""
                self.get_phone_coordinates()
            except:
                pass

            try:
                nmea_raw_data = serial_GPS.readline()
                nmea_data = pynmea2.parse(nmea_raw_data)   # Parses into pynmea object ('nmea_raw_data, check=False' to disable checksum)

                if isinstance(nmea_data, pynmea2.types.talker.GGA):
                    fix = nmea_data.gps_qual

                    if fix != 0:    # If GPS has a fix
                        smartcar_latitude = nmea_data.latitude
                        smartcar_longitude = nmea_data.longitude

                        """ sends GPS coordinates to Java server (phone application)"""
                        self.send_smartcar_coordinates()

                        """ requests the SmartCar to start autonomous drive """
                        self.drive(pdop, fix)

                        print("guard_latitude: " + str(smartcar_latitude))
                        print("guard_longitude: " + str(smartcar_longitude))
                        print("PDOP: " + str(pdop))
                        print("Fix quality: " + str(fix) + "\n")

                    else:
                        print("Waiting for fix..")
                        print(nmea_raw_data)

                elif isinstance(nmea_data, pynmea2.types.talker.GSA):
                    pdop = nmea_data.pdop

                elif nmea_raw_data.startswith(' '):
                    print("No data from GPS device")

            except Exception as e:
                print("Error caught: ", e)

threading_GPS_following()