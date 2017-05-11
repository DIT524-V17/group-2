package com.group02.guard;

import java.util.UUID;

/**
 * Created by jeberlen on 2017-05-05.
 */

public class SmartCar {

    // MAC address for the SmartCar
    private String address = "20:15:10:20:11:37";

    // UUID that specifies a protocol for generic bluetooth serial communication
    private final UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private String ip = "192.168.0.1";
    private String ssid = "GUARD";
    //TODO: REMOVE HARDCODED NETWORK PASS WHEN DB IS DONE.
    private String networkPass = "shaunisbest";

    public SmartCar(){
    }

    public SmartCar(String address, String ip, String ssid, String networkPass){
        this.address = address;
        this.ip = ip;
        this.ssid = ssid;
        this.networkPass = networkPass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSsid() {
        return ssid;
    }

    public String getNetworkPass() {
        return networkPass;
    }

}
