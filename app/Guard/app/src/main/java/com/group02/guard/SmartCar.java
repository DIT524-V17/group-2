package com.group02.guard;

import java.util.UUID;

/**
 * Creates a SmartCar object representing SmartCar's connection data
 * @author Joacim Eberlen (JE)
 * @version 1.0.0
 */

public class SmartCar {

    // MAC address for the SmartCar
    private String address = "20:15:10:20:11:37";

    // UUID that specifies a protocol for generic bluetooth serial communication
    private final UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private String ip = "192.168.42.1";
    private String ssid = "GUARD";
    private String networkPass = "group2group2";

    /**
     * Default empty constructor
     */
    public SmartCar(){}

    /**
     * Constructor with values
     * @param address, MAC address
     * @param ip, WiFi ip
     * @param ssid, Name of WiFi network
     * @param networkPass, Network's passowrd
     */
    public SmartCar(String address, String ip, String ssid, String networkPass){
        this.address = address;
        this.ip = ip;
        this.ssid = ssid;
        this.networkPass = networkPass;
    }

    /**
     * @return MAC address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets new MAC address
     * @param address, New address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return Protocol for bluetooth serial communication
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @return Network IP address
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets new network ip address
     * @param ip, new IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return Network name
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * @return Network password
     */
    public String getNetworkPass() {
        return networkPass;
    }

}
