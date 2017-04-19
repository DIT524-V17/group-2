import socket
import threading
import time
import threading
import time
import serial
import pynmea2
from random import randrange, uniform
from GpsAngle import calculateBearing, calculateDistance

"""
Script that fetches the SmartCar's coordinates, compare them to the mobile device's coordinates,
and sends movement commands to the SmartCar to make it follow the mobile device in real time
Author Erik Laurin
"""


# final variables
a = 'A'
s = 'S'
new_line = '\n'
update_frequency = 2

# serials
serialGPS = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)
# serialArduino = serial.Serial('/dev/ttyACM0', 9600)

# GPS send
serverName = 'localhost'
serverPort = 8000
clientSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
clientSocket.connect((serverName, serverPort))
# message = input('Input lowercase sentence:')
message = ""


class ThreadingGPSFollow():

    def send_angle(self, angle):
        """
        Sends angle to the Arduino
        :param angle: in degrees how much the SmartCar should turn
        """
        byte_angle = str.encode(a + str(angle) + new_line)
        print("Sends to arduino: " + byte_angle)
        # serialArduino.write(byte_angle)

    def send_speed(self, speed):
        """
        Sends speed to the Arduino
        :param speed: the speed the SmartCar should be set to
        """
        byte_speed = str.encode(s + str(speed) + new_line)
        print("Sends to arduino: " + byte_speed)
        # serialArduino.write(byte_speed)

    def drive(self, angle, distance, pdop, fix):
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

        """ waits until the arduino has had enough time to turn """
        if angle < 180:
            time.sleep(1)
        else:
            time.sleep(2)

        """ sends speed """
        self.send_speed(speed)

        """ determines the update frequency"""
        time.sleep(update_frequency)

    def send_gps():
        clientSocket.sendto(message.encode('utf-8'),(serverName, serverPort))

    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        thread.start()  # Start the execution

    def run(self):
        """ Method that runs forever """

        old_angle = 0
        pdop = 99

        while 1:
            try:
                nmea_raw_data = serialGPS.readline()
                nmea_data = pynmea2.parse(nmea_raw_data)   # Parses into pynmea object ('nmea_raw_data, check=False' to disable checksum)

                if isinstance(nmea_data, pynmea2.types.talker.GGA):
                    fix = nmea_data.gps_qual

                    if fix != 0:    # If GPS has a fix
                        guard_latitude = nmea_data.latitude
                        guard_longitude = nmea_data.longitude

                        distance = calculateDistance(guard_latitude, uniform(-90, 90), guard_longitude, uniform(-180, 180)) * 1000 # Multiplied with 1000 to get m from km
                        angle = calculateBearing(guard_latitude, guard_longitude, uniform(-90, 90), uniform(-180, 180))

                        print("Latitude: " + str(guard_latitude))
                        print("Longitude: " + str(guard_longitude))
                        print("PDOP: " + str(pdop))
                        print("Fix quality: " + str(fix) + "\n")

                        # get coordinates to send
                        message = str(guard_latitude)) + "-" + str(guard_longitude)

                        """ disregard minor changes in angle """
                        if abs(angle - old_angle) < 3:
                            continue
                        else:
                            old_angle = angle
                            self.drive(angle, distance, pdop, 3)
                    else:
                        print("Waiting for fix..")

                elif isinstance(nmea_data, pynmea2.types.talker.GSA):
                    pdop = nmea_data.pdop

                elif nmea_raw_data.startswith(' '):
                    print("No data from GPS device")

            except Exception as e:
                print("Error caught: ", e)

ThreadingGPSFollow()

