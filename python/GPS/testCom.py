import serial
import time
import random

# check the connection by type "ls /dev/tty*" in Raspberry Pi terminal,
# the result should be content "/dev/ttyACM0" and you are good to go.

ser = serial.Serial('/dev/ttyACM1', 9600)  # '/dev/ttyUSB0'
time.sleep(2)
print(ser.name)  # check which port was really used \n
while True:
    w = str.encode(str(random.randrange(41)))
    ser.write(w)
    time.sleep(2)

ser.close()  # close port
