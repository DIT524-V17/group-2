package com.group02.guard;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by doctorgaby on 15/03/2017.
 */

public class Coordinates {
    public static BigDecimal parserino(String coords) {
        coords = coords.replaceAll("\"", "").replaceAll("\'", "");
        //spaces are removed and values inserted into an array
        String[] cArray = coords.split(" ");
        //save the sign of latitude for future calculation
        String latSign = cArray[0];
        //coordonate degrees and subdegrees
        String cordDegrees = cArray[1].substring(0, cArray[1].length() - 1);
        String cordMinDegrees = cArray[2];
        String cordSecDegrees = cArray[3];
        BigDecimal lat = getSign(latSign).multiply((new BigDecimal(cordDegrees).add(convertFromMinDegreesToDecimal(new BigDecimal(cordMinDegrees))).add(convertFromSecDegreesToDecimal2(new BigDecimal(cordSecDegrees)))));
        return lat;
    }

    //according to the sign, return -1 or +1 for the direction of the coordinates
    private static BigDecimal getSign(String c) {
        if (c.equals("N") || c.equals("E")) {
            return new BigDecimal(1);
        }
        return new BigDecimal(-1);
    }

    //method to convert minutes
    private static BigDecimal convertFromMinDegreesToDecimal(BigDecimal value) {
        BigDecimal result = value.divide(new BigDecimal(60d), 6, RoundingMode.HALF_DOWN);
        return result;
    }

    //method to convert the seconds
    private static BigDecimal convertFromSecDegreesToDecimal2(BigDecimal value) {
        BigDecimal result = value.divide(new BigDecimal(3600d), 6, RoundingMode.HALF_DOWN);
        return result;
    }
}
