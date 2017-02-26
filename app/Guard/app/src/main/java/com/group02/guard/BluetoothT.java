package com.group02.guard;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;


/**
 * Created by kien on 2017-02-26.
 */

public class BluetoothT {
    BluetoothAdapter mBluetoothAdapter;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    private final InputStream mmInStream;
    private final OutputStream mmOutStream;
    private static final UUID MY_UUID_INSECURE =
            UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    if(!mBluetoothAdapter.isEnabled()){
        Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableBluetooth, 0);
    }

    public BluetoothT(InputStream mmInStream, OutputStream mmOutStream) {
        this.mmInStream = mmInStream;
        this.mmOutStream = mmOutStream;
    }


    private void startActivityForResult(Intent enableBluetooth, int i) {

    }

    Set pairedDevices = mBluetoothAdapter.getBondedDevices();
    if(pairedDevices.size() > 0)
    {
        for(BluetoothDevice Device : pairedDevices)
        {
            if(device.getName().equals("Group2")) //Note, you will need to change this to match the name of your device
            {
                mmDevice = device;
                break;
            }
        }
    }
    UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"); //Standard SerialPortService ID
    mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
    mmSocket.connect();
    mmOutputStream = mmSocket.getOutputStream();
    mmInputStream = mmSocket.getInputStream();

}
