from math import *
/**
 * calculating the bearing and distance based on two gps coordinates and a filter to process the data
 * @author Boyan Dai
 * @version 1.1.0
 */


##method for calculating angle by having smartCar gps location and externalController gps location
##method is based on math theory
def calculateBearing(smartCarLa, smartCarLo, externalControllerLa, externalControllerLo) :

     longDiff= externalControllerLo-smartCarLo
     x = sin(longDiff) * cos(externalControllerLa)
     y = cos(smartCarLa) * sin(externalControllerLa) - (sin(smartCarLa)*cos(externalControllerLa)*cos(longDiff))
     initial_bearing = atan2(x, y)
     initial_bearing = degrees(initial_bearing)
     compass_bearing = (initial_bearing + 360) % 360
     return compass_bearing

##method for process raw gps data
##it will return only longtitude and latitude
def filterGPS(smartCarGPS, externalControllerGPS):

    smartCarLo=smartCarGPS.fix.longitude
    smartCarLa=smartCarGPS.fix.latitude
    externalControllerLo=externalControllerGPS.fix.longitude
    externalControllerLa=externalControllerGPS.fix.latitude

    return(smartCarLo, smartCarLa, externalControllerLo,externalControllerLa )

##method for calculating the distance between smartCar and externalController
##the return data will be kilometers
def distance(smartCarLa, externalControllerLa, smartCarLo, externalControllerLo):

    radius = 6371 # km

    dlat = radians(externalControllerLa-smartCarLa)
    dlon = radians(externalControllerLo-smartCarLo)
    a = sin(dlat/2) * sin(dlat/2) + cos(radians(smartCarLa)) \
        * cos(radians(externalControllerLa)) * sin(dlon/2) * sin(dlon/2)
    c = 2 * atan2(sqrt(a), sqrt(1-a))
    d = radius * c

    return d


if __name__ == '__main__':
    calculateAngle()
