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

serialGPS = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)

while 1:
    GPSdata = serialGPS.readline()
    if GPSdata.startswith('$GPGGA'):
        try:
            nmeaData = pynmea2.parse(GPSdata, check=False)
            fix = nmeaData.gps_qual
            if fix != 0:
                GUARDlatitude = nmeaData.latitude
                GUARDlongitude = nmeaData.longitude
                hdop = nmeaData.horizontal_dil
                print'Lat: ', GUARDlatitude
                print'Long: ', GUARDlongitude
                print'Fix quality: ', fix
                print'HDOP: ', hdop, '\n'
            else:
                print'waiting for fix..'
        except Exception as e:
            print("", e)
    elif GPSdata.startswith(' ') or GPSdata.startswith(None):
        print'No data from GPS device'