package com.group02.guard;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The class parses a coordinate string from Degrees to Decimal format
 * @author Gabriel Bulai
 * @version 1.0
 */

public class Coordinates {
    public static void main(String[] args) {


        //    	String  coords = "N 45° 34' 59.843\"";
        //        String  coords2 = "E 11° 57' 11.25\"";

        String coords = "45° 34' 59.843\" S";
        String coords2 = "11° 57' 11.25\" W";
    }

    static BigDecimal parserino(String coords) {
        coords = coords.replaceAll("\"", "").replaceAll("\'", "");
        //spaces are removed and values inserted into an array
        String[] cArray = coords.split(" ");
        String latSign = "";
        String cordDegrees = "";
        String cordMinDegrees = "";
        String cordSecDegrees = "";
        if (cArray[0].indexOf('N') == 0 || cArray[0].indexOf('S') == 0 ||
                cArray[0].indexOf('E') == 0 || cArray[0].indexOf('W') == 0) {
            //save the sign of latitude for future calculation
            latSign = cArray[0];
            //coordonate degrees and subdegrees
            cordDegrees = cArray[1].substring(0, cArray[1].length() - 1);
            cordMinDegrees = cArray[2];
            cordSecDegrees = cArray[3];
        } else if (cArray[cArray.length - 1].indexOf('N') == 0 ||
                cArray[cArray.length - 1].indexOf('S') == 0 ||
                cArray[cArray.length - 1].indexOf('E') == 0 ||
                cArray[cArray.length - 1].indexOf('W') == 0) {
            cordDegrees = cArray[0].substring(0, cArray[0].length() - 1);
            cordMinDegrees = cArray[1];
            cordSecDegrees = cArray[2];
            //save the sign of latitude for future calculation
            latSign = cArray[cArray.length - 1];
        }
        BigDecimal lat = getSign(latSign)
                .multiply((new BigDecimal(cordDegrees)
                        .add(convertFromMinDegreesToDecimal(new BigDecimal(cordMinDegrees)))
                        .add(convertFromSecDegreesToDecimal2(new BigDecimal(cordSecDegrees)))));
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
        BigDecimal result = value.divide(new BigDecimal(60d), 7, RoundingMode.HALF_DOWN);
        return result;
    }
    //method to convert the seconds
    private static BigDecimal convertFromSecDegreesToDecimal2(BigDecimal value) {
        BigDecimal result = value.divide(new BigDecimal(3600d), 7, RoundingMode.HALF_DOWN);
        return result;
    }
}
