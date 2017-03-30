import threading
import time
import serial
import random

# from Boyan: angle and the distance to the mobile device
# script that continuously send commands to the Arduino to follow the phone (setAngle, setSpeed)

# check the connection by type "ls /dev/tty*" in Raspberry Pi terminal,
# the result should be content "/dev/ttyACM0" and you are good to go.

a = 'A'
s = 'S'
delay = 1

#ser = serial.Serial('/dev/ttyACM0', 9600)  # '/dev/ttyUSB0'

class ThreadingGPSFollow():
    """ Threading class
    The run() method will be started and it will run in the background.
    """

    def drive(self, angle, speed):

        print(a + str(angle))
        time.sleep(2)
        print(s + str(speed))

        # ser.write(a + str(angle))
        # ser.write(s + str(speed))

        time.sleep(delay)

    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        #thread.daemon = True                            # Daemonize thread
        thread.start()                                   # Start the execution

    def run(self):
        """ Method that runs forever """
        oldAngle = 0
        while True:
            distance = random.randrange(41)
            angle = random.randrange(360)
            if angle != oldAngle and distance > 20:
                oldAngle = angle
                self.drive(angle,70 , oldAngle)
            elif angle != oldAngle and distance < 20:
                oldAngle = angle
                self.drive(angle,40, oldAngle)

ThreadingGPSFollow()
