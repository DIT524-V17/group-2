import threading
import serial
import pynmea2
import time

serial_bol = False

# SmartCar GPS variables
smartcar_latitude, smartcar_longitude, pdop, fix = 0, 0, 0, 0


# serials
while not serial_bol:
    try:
        serial_GPS = serial.Serial(port='/dev/ttyUSB0', baudrate=4800, timeout=None)
    except Exception:
        try:
            serial_GPS = serial.Serial(port='/dev/ttyUSB1', baudrate=4800, timeout=None)
        except:
            time.sleep(1)
        else:
            serial_bol = True
    else:
        serial_bol = True


class smartcar_GPS():

    def write_to_file(self):
        try:
            coords = open('/home/pi/repo/group-2/GPSfollowing/coords_smartcar.txt', "w", -1 )
            message = str(smartcar_latitude) + ' ' + str(smartcar_longitude) + ' ' + str(pdop) + ' ' + str(fix)
            coords.write(message)
            coords.close()
        except:
            pass
    def __init__(self):
        """ Constructor """

        thread = threading.Thread(target=self.run, args=())
        thread.start()  # Start the execution

    def run(self):
        """ Method that runs forever """

        global pdop
        global fix
        global smartcar_latitude
        global smartcar_longitude

        while 1:

            try:
                nmea_raw_data = serial_GPS.readline()
                nmea_data = pynmea2.parse(nmea_raw_data)   # Parses into pynmea object ('nmea_raw_data, check=False' to disable checksum)

                if isinstance(nmea_data, pynmea2.types.talker.GGA):
                    fix = nmea_data.gps_qual

                    if fix != 0:    # If GPS has a fix
                        smartcar_latitude = nmea_data.latitude
                        smartcar_longitude = nmea_data.longitude

                        print("guard_latitude: " + str(smartcar_latitude))
                        print("guard_longitude: " + str(smartcar_longitude))
                        print("PDOP: " + str(pdop))
                        print("Fix quality: " + str(fix) + "\n")

                        self.write_to_file()

                    else:
                        print("Waiting for fix..")
                        print(nmea_raw_data)
                        time.sleep(1)

                elif isinstance(nmea_data, pynmea2.types.talker.GSA):
                    pdop = nmea_data.pdop

                elif nmea_raw_data.startswith(' '):
                    print("No data from GPS device")

            except Exception as e:
                print("Error caught: ", e)

smartcar_GPS()
