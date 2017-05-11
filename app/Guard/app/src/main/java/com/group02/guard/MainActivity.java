package com.group02.guard;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * @version 1.1.0 JE
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button control;
    Button gps;
    Button map;
    Button reconnnect;

    SmartCar smartCar;

    // final check number for bluetooth prompt
    private final static int REQUEST_ENABLE_BT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        if (!adapter.isEnabled()) {
            //Set a filter to only receive bluetooth state changed events.
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent , REQUEST_ENABLE_BT);
        }

        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        if (!wifi.isWifiEnabled()){
            turnOnWifi(wifi);
        } else {
            connectToGuard(wifi);
        }

        // TODO: ADD PARAMS FROM JUSTINAS DB METHODS
        //smartCar = new SmartCar(address, ip, ssid, networkPass);

        smartCar = new SmartCar();

        control = (Button) findViewById(R.id.controlButton);
        map = (Button) findViewById(R.id.mapsButton);
        gps = (Button) findViewById(R.id.gpsButton);
        reconnnect = (Button) findViewById(R.id.reconnect);

        control.setOnClickListener(this);
        map.setOnClickListener(this);
        gps.setOnClickListener(this);
        reconnnect.setOnClickListener(this);

    }
    /**
     * Starts new activities and saves booleans when buttons in the MainScreen are clicked.
     * The booleans are retrieved in other activities and are used to set the state of ToggleButton
     * @param v The current View
     */
    @Override
    public void onClick(View v) {
        Intent wifi = new Intent(MainActivity.this, WifiActivity.class);
        wifi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        wifi.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent controlIntent = new Intent(MainActivity.this, ControllerActivity.class);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent gpsIntent = new Intent(MainActivity.this, GpsActivity.class);
        gpsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        gpsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);

        switch (v.getId()) {
            case R.id.controlButton:
                startActivity(controlIntent);
                return;
            case R.id.mapsButton:
                startActivity(mapIntent);
                return;
            case R.id.gpsButton:
                startActivity(gpsIntent);
                return;
            case R.id.reconnect:
                startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                return;
           default:

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            recreate();
        }
        if (resultCode == RESULT_CANCELED) {
            disableFunctions();
        }
    }

    private void turnOnWifi(final WifiManager wifi){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Wifi Settings");

        alertDialogBuilder
                .setMessage("Do you want to enable WIFI ?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @SuppressLint("ShowToast")
                    public void onClick(DialogInterface dialog, int id) {
                        //enable wifi
                        wifi.setWifiEnabled(true);
                        Toast.makeText(MainActivity.this, "WiFi turned on", Toast.LENGTH_LONG);
                        connectToGuard(wifi);
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //disable wifi
                        wifi.setWifiEnabled(false);

                        disableFunctions();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void disableFunctions(){
        control.setClickable(false);
        control.setAlpha(0.5f);
        map.setClickable(false);
        map.setAlpha(0.5f);
        gps.setClickable(false);
        gps.setAlpha(0.5f);

        reconnnect.setVisibility(View.VISIBLE);
    }

    @SuppressLint("ShowToast")
    public void connectToGuard(WifiManager wifi){

        String networkSSID = smartCar.getSsid();
        String networkPass = smartCar.getNetworkPass();

        wifi.disconnect();

        WifiConfiguration conf = new WifiConfiguration();
        conf.SSID = "\"" + networkSSID + "\"";   // Please note the quotes. String should contain ssid in quotes
        conf.preSharedKey = "\""+ networkPass +"\"";

        wifi.addNetwork(conf);
        List<WifiConfiguration> list = wifi.getConfiguredNetworks();
        for( WifiConfiguration i : list ) {
            if(i.SSID != null && i.SSID.equals("\"" + networkSSID + "\"")) {
                wifi.disconnect();
                wifi.enableNetwork(i.networkId, true);
                wifi.reconnect();
                break;
            }
        }

        WifiInfo wifiInfo = wifi.getConnectionInfo();

        if(WifiInfo.getDetailedStateOf(wifiInfo.getSupplicantState()) ==
            NetworkInfo.DetailedState.CONNECTED &&
            wifiInfo.getSSID().equals(smartCar.getSsid())){

            Toast.makeText(MainActivity.this, "Connected to GUARD", Toast.LENGTH_SHORT);

        }

    }


}
