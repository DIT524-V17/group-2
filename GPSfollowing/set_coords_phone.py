import sys
import warnings

"""
* Script that takes arguments and set them as the phone's coordinates
 
* Takes two args (lat & long), and sets them as coordinates for the phone 
  (in case of invalid number of arguments, lat is set to '1' (no fix)).
	example: 1. ssh pi@192.168.1.105 (psw: raspberry)
	    	 2. python home/pi/repo/group-2/GPSfollowing/set_coords_phone 54.327 11.244		 
	
    	        when received lat = 0, terminate script (sends command to SmartCar to stop and exits)
                                    1, bad GPS signal (sends command to SmartCar to stop and await an actual coordinate 
			                                            before continuing)
			                        2, change to manual control mode (sends command to SmartCar)
			                        3, change to GPSfollowing mode (sends command to SmartCar)
* @author Erik Laurin
* @version 1.0.1
"""

def write_to_file(argv):
    """
    Writes the coordinates (arguments) of the phone to the coords_phone.txt file
    :param argv: the arguments (if any) provided when calling the script
    """
    try:

        coords = open('/home/pi/repo/group-2/GPSfollowing/coords_phone.txt', "w", -1 )

        if len(argv) == 3:
            phone_latitude = argv[1]
            phone_longitude = argv[2]

            message = str(phone_latitude) + ' ' + str(phone_longitude)
            coords.write(message)
            coords.close()

            confirm_message = 'phone_latitude set to: ' + str(phone_latitude) + '\n' + 'phone_longitude set to: ' + str(phone_longitude)
            print(confirm_message)

        elif len(argv) == 2:
            phone_latitude = argv[1]
            phone_longitude = '0'

            message = str(phone_latitude) + ' ' + str(phone_longitude)
            coords.write(message)
            coords.close()

            confirm_message = 'phone_latitude set to: ' + str(phone_latitude) + '\n' + 'phone_longitude set to: ' + str(phone_longitude)
            print(confirm_message)
        else:
            phone_latitude = '1'
            phone_longitude = '0'

            message = str(phone_latitude) + ' ' + str(phone_longitude)
            coords.write(message)

            coords.close()
            print('Wrong amount of arguments. 2 (lat long) or 1 (command code) required')
            print('\n' + 'Phone coordinates set to "no fix" (1 0)')
            return
    except:
        pass

if __name__ == "__main__":
    write_to_file(sys.argv)
    warnings.warn("deprecated", DeprecationWarning)
