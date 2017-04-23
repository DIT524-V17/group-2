import sys

def write_to_file(argv):
    try:
        coords = open('/home/pi/repo/group-2/python/GPS/coords_phone.txt', "w", -1 )
        smartcar_latitude = argv[1]
        smartcar_longitude = argv[2]
        pdop = argv[3]
        fix = argv[4]
        message = str(smartcar_latitude) + ' ' + str(smartcar_longitude) + ' ' + str(pdop) + ' ' + str(fix)
        print(message)
        coords.write(message)
    except:
        pass

if __name__ == "__main__":
    write_to_file(sys.argv)