package com.group02.guard;

import java.util.UUID;

/**
 * Created by jeberlen on 2017-05-05.
 */

public class SmartCar {

    // MAC address for the SmartCar
    private static String address = "20:15:10:20:11:37";

    // UUID that specifies a protocol for generic bluetooth serial communication
    private static final UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    public SmartCar(){
    }

    public static UUID getUuid() {
        return uuid;
    }

    public static String getAddress() {
        return address;
    }

    // Method for modularity
    public void setAddress(String address) {
        this.address = address;
    }

}
