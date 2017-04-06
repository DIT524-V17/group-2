import serial
import pynmea2

"""
sudo systemctl stop gpsd.socket
sudo systemctl disable gpsd.socket

gpsctl -n -D 4 /dev/ttyUSB0

sudo killall gpsd
sudo gpsd /dev/ttyUSB0 -F /var/run/gpsd.sock


sudo apt-get install gpsd gpsd-clients python-gps
pip install pynmea2 --user

cgps -s
"""

ser = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)

while 1:
    line = ser.readline()
    if line.startswith('$GPGGA'):
        try:
            nmeaData = pynmea2.parse(line, check=False)
            fix = nmeaData.gps_qual
            if fix != 0:
                latitude = nmeaData.latitude
                longitude = nmeaData.longitude
                fixQuality = nmeaData.gps_qual
                print'Lat: ', latitude
                print'Long: ', longitude
                print'Fix quality: ', fixQuality
                print'\n'
            else:
                print 'waiting for fix..'
        except Exception as e:
            print("", e)