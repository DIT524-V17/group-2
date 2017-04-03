from math import *


def calculateAngle(smartCarLo, externalControllerLo, smartCarLa, externalControllerLa):

    angle = tan(abs(externalControllerLa-smartCarLa)/ abs(externalControllerLo-smartCarLo))

    return(angle)


def filterGPS(smartCarGPS, externalControllerGPS):

    smartCarLo=smartCarGPS.fix.longitude
    smartCarLa=smartCarGPS.fix.latitude
    externalControllerLo=externalControllerGPS.fix.longitude
    externalControllerLa=externalControllerGPS.fix.latitude

    return(smartCarLo, smartCarLa, externalControllerLo,externalControllerLa )
