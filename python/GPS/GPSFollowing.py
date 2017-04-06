import threading
import time
import serial
import pynmea2
from random import randrange, uniform
from GpsAngle import calculateBearing, calculateDistance

# from Boyan: angle and the distance to the mobile device
# script that continuously send commands to the Arduino to follow the phone (setAngle, setSpeed)

# check the connection by type "ls /dev/tty*" in Raspberry Pi terminal,

a = 'A'
s = 'S'
newLine = '\n'
updateFrequency = 2

#serialGPS = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)
#serialArduino = serial.Serial('/dev/ttyACM0', 9600)

class ThreadingGPSFollow():
    """ Threading class
    The run() method will be started and it will run in the background.
    """

    def drive(self, angle, distance, hdop, fix):

        """ returns if precision too poor """
        if hdop > 7 or fix != 2:
            return

        """ sets speed depending on distance to traveler """
        if distance > 15:
            speed = 70
        elif distance < 15 and distance > 3:
            speed = 40
        else:
            speed = 0

        """ sends angle to Arduino """
        print(a + str(angle))
        #byteAngle = str.encode(a + str(angle) + newLine)
        #serialArduino.write(byteAngle)

        """ waits until the arduino has gotten time to turn """
        if angle < 180:
            time.sleep(1)
        else:
            time.sleep(2)

        """ sends speed to Arduino """
        print(s + str(speed))
        #byteSpeed = str.encode(s + str(speed) + newLine)
        #serialArduino.write(byteSpeed)

        """ determines the update frequency"""
        time.sleep(updateFrequency)

    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        #thread.daemon = True                            # Daemonize thread
        thread.start()                                   # Start the execution

    def run(self):
        """ Method that runs forever """

        oldAngle = 0
        while True:

            GPSdata = serialGPS.readline()
            if GPSdata.startswith('$GPGGA'):
                try:
                    nmeaData = pynmea2.parse(GPSdata, check=False)
                    fix = nmeaData.gps_qual
                    if fix != 0:
                        GUARDlatitude = nmeaData.latitude
                        GUARDlongitude = nmeaData.longitude
                        hdop = nmeaData.horizontal_dil

                        distance = calculateDistance(GUARDlatitude, uniform(-90, 90), GUARDlongitude, uniform(-180, 180))
                        angle = calculateBearing(GUARDlatitude, GUARDlongitude, uniform(-90, 90), uniform(-180, 180))

                        print'Lat: ', GUARDlatitude
                        print'Long: ', GUARDlongitude
                        print'Fix quality: ', fix
                        print'HDOP: ', hdop, '\n'

                        """ disregard minor change in angle """
                        if abs(angle - oldAngle) < 3:
                            continue
                        else:
                            self.drive(angle, distance, hdop, fix)
                    else:
                        print'Waiting for fix..'
                except Exception as e:
                    print("Error caught: ", e)
            elif GPSdata.startswith(' ') or GPSdata.startswith(None):
                print'No data from GPS device'

ThreadingGPSFollow()