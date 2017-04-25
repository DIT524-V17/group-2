import sys

def write_to_file(argv):
    try:
        coords = open('/home/pi/repo/group-2/GPSfollowing/coords_phone.txt', "w", -1 )
        phone_latitude = argv[1]
        phone_longitude = argv[2]

        message = str(phone_latitude) + ' ' + str(phone_longitude)
        coords.write(message)

        confirm_message = 'phone_latitude set to: ' + str(phone_latitude) + '\n' + 'phone_longitude set to: ' + str(phone_longitude)
        print(confirm_message)

    except:
        pass

if __name__ == "__main__":
    write_to_file(sys.argv)
