import serial
import time

# check the connection by type "ls /dev/tty*" in Raspberry Pi terminal,
# the result should be content "/dev/ttyACM0" and you are good to go.

ser = serial.Serial('/dev/ttyACM0',9600) # '/dev/ttyUSB0'
time.sleep(2)
print(ser.name)  # check which port was really used
while True:
    ser.write(b'hello')  # write a string (prefix b is required for Python 3.x, converts it into bytes)
    time.sleep(2)

#ser.close()  # close port