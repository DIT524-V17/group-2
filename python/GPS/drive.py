import threading
import time
import serial
from GpsAngle import calculateBearing, calculateDistance

# final variables
a = 'A'
s = 'S'
update_frequency = 2

# serials
serial_arduino = serial.Serial('/dev/ttyACM0', 9600)

# Phone Coordinates
phone_longitude = 0
phone_latitude = 0
phone_pdop = 0
phone_fix = 0

# SmartCar GPS
smartcar_longitude = 0
smartcar_latitude = 0
smartcar_pdop = 0
smartcar_fix = 0

old_angle = 0

class threading_GPS_following():
    def get_phone_coords(self):
        global phone_latitude
        global phone_longitude
        global phone_pdop
        global phone_fix
        try:
            coords = open('/home/pi/repo/group-2/python/GPS/coords_phone.txt', "r", -1 )
            phone_latitudes, phone_longitudes, phone_pdops, phone_fixs = coords.read().split()

            phone_latitude = float(phone_latitudes)
            phone_longitude = float(phone_longitudes)
            phone_pdop = float(phone_pdops)
            phone_fix = float(phone_fixs)
        except Exception as e:
            print("", e)
            #self.get_phone_coords()
        """
        print('phone_lat: ' + str(phone_latitude) + '\n')
        print('phone_long: '+ str(phone_longitude) + '\n')
        print('phone_pdop: ' + str(phone_pdop) + '\n')
        print('phone_fix: ' + str(phone_fix) + '\n')
        """

    def get_smartcar_coords(self):
        global smartcar_latitude
        global smartcar_longitude
        global smartcar_pdop
        global smartcar_fix
        try:
            coords = open('/home/pi/repo/group-2/python/GPS/coords_smartcar.txt', "r", -1 )
            smartcar_latitudes, smartcar_longitudes, smartcar_pdops, smartcar_fixs = coords.read().split()

            smartcar_latitude = float(smartcar_latitudes)
            smartcar_longitude = float(smartcar_longitudes)
            smartcar_pdop = float(smartcar_pdops)
            smartcar_fix = float(smartcar_fixs)

        except Exception as e:
            print("", e)
            #self.get_smartcar_coords()
        """
        print('smartcar_lat: ' + str(smartcar_latitude) + '\n')
        print('smartcar_long: '+ str(smartcar_longitude) + '\n')
        print('smartcar_pdop: ' + str(smartcar_pdop) + '\n')
        print('smartcar_fix: ' + str(smartcar_fix) + '\n')
        """

    def send_angle(self, angle):
        """
        Sends angle to the Arduino
        :param angle: in degrees how much the SmartCar should turn
        """
        byte_angle = str.encode(a + str(angle) + '\n')
        serial_arduino.write(byte_angle)
        print("Sent to arduino: " + byte_angle)

    def send_speed(self, speed):
        """
        Sends speed to the Arduino
        :param speed: the speed the SmartCar should be set to
        """
        byte_speed = str.encode(s + str(speed) + '\n')
        serial_arduino.write(byte_speed)
        print("Sent to arduino: " + byte_speed)

    def drive(self):
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
        global smartcar_latitude
        global smartcar_longitude
        global phone_latitude
        global phone_longitude

        distance = calculateDistance(smartcar_latitude, phone_latitude, smartcar_longitude, phone_longitude) * 1000  # Multiplied with 1000 to get m from km
        angle = calculateBearing(smartcar_latitude, smartcar_longitude, smartcar_latitude, smartcar_longitude)
        speed = 50

        """
        # disregard minor changes in angle
        if abs(angle - old_angle) < 5:
            return
        else:
            old_angle = angle

        # if precision too poor - stops SmartCar and returns
        if pdop > 6 and fix not in [1, 2, 3]:
            self.send_speed(0)
            return


        #sets speed depending on distance to traveler
        if distance > 15:
            speed = 70
        elif distance < 15 and distance > 3:
            speed = 40
        else:
            speed = 0
"""

        #sends angle
        self.send_angle(angle)

        #waits until the SmartCar has had enough time to turn
        if angle < 180:
            time.sleep(1)
        else:
            time.sleep(2)

        #sends speed
        self.send_speed(speed)

        #determines the update frequency
        time.sleep(update_frequency)

        time.sleep(10)
        self.send_speed(0)

    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        thread.start()  # Start the execution

    def run(self):
        """ Method that runs forever """

        while 1:
            try:
                self.get_phone_coords()
                self.get_smartcar_coords()
                self.drive()

            except Exception as e:
                print("", e)
            except (KeyboardInterrupt, SystemExit):
                self.send_speed(0)
                print("wefererferer")


threading_GPS_following()