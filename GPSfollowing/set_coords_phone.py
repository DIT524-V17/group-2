import sys

def write_to_file(argv):
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