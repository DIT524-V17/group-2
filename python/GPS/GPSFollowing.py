import threading
import time
import serial
from random import randrange, uniform
from GpsAngle import calculateBearing, calculateDistance

# from Boyan: angle and the distance to the mobile device
# script that continuously send commands to the Arduino to follow the phone (setAngle, setSpeed)

# check the connection by type "ls /dev/tty*" in Raspberry Pi terminal,

a = 'A'
s = 'S'
newLine = '\n'
updateFrequency = 2

#ser = serial.Serial('/dev/ttyACM0', 9600)

class ThreadingGPSFollow():
    """ Threading class
    The run() method will be started and it will run in the background.
    """

    def drive(self, angle, speed):
        print(a + str(angle))
        byteAngle = str.encode(a + str(angle) + newLine)
#        ser.write(byteAngle)

        time.sleep(1)

        print(s + str(speed))
        byteSpeed = str.encode(s + str(speed) + newLine)
#        ser.write(byteSpeed)

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
            distance = calculateDistance(uniform(-180, 180), uniform(-180, 180), uniform(-90, 90), uniform(-90, 90))
            angle = calculateBearing(uniform(-180, 180), uniform(-180, 180), uniform(-90, 90), uniform(-90, 90))
            if angle != oldAngle and distance > 15:
                oldAngle = angle
                self.drive(angle, 70)
            elif angle != oldAngle and distance < 15 and distance > 3:
                oldAngle = angle
                self.drive(angle, 40)
            elif distance < 3:
                oldAngle = angle
                self.drive(angle, 0)
            else:
                oldAngle = angle
                self.drive(angle, 0)

ThreadingGPSFollow()