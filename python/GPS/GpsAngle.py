from math import *




def calculateBearing(smartCarLa, smartCarLo, externalControllerLa, externalControllerLo) :

    longDiff= externalControllerLo-smartCarLo
    y = sin(longDiff)*cos(externalControllerLa)
    x = cos(smartCarLa)*sin(externalControllerLa)-sin(smartCarLa)*cos(externalControllerLa)*cos(longDiff)
    return degrees((atan2(y, x))+360)%360

def filterGPS(smartCarGPS, externalControllerGPS):

    smartCarLo=smartCarGPS.fix.longitude
    smartCarLa=smartCarGPS.fix.latitude
    externalControllerLo=externalControllerGPS.fix.longitude
    externalControllerLa=externalControllerGPS.fix.latitude

    return(smartCarLo, smartCarLa, externalControllerLo,externalControllerLa )

def calculateDistance(smartCarLa, externalControllerLa, smartCarLo, externalControllerLo):

    radius = 6371 # km

    dlat = radians(externalControllerLa-smartCarLa)
    dlon = radians(externalControllerLo-smartCarLo)
    a = sin(dlat/2) * sin(dlat/2) + cos(radians(smartCarLa)) \
        * cos(radians(externalControllerLa)) * sin(dlon/2) * sin(dlon/2)
    c = 2 * atan2(sqrt(a), sqrt(1-a))
    d = radius * c

    return d


if __name__ == '__main__':
    calculateBearing()
    calculateDistance()