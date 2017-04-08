package com.group02.guard;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Creates an activity for the GPS screen
 * @author Justinas Stirbys on 04/04/2017.
 * @version 1.0.0
 */

public class GpsActivity extends AppCompatActivity {

    private TextView phoneLat;
    private TextView phoneLong;
    private TextView carLat;
    private TextView carLong;
    private ToggleButton startGps;
    private boolean gpsOn;
    BluetoothThread connectBluetooth;
    Handler writeHandler;
    String address = "20:15:10:20:11:37";
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        phoneLat = (TextView) findViewById(R.id.phoneLat);
        phoneLong = (TextView) findViewById(R.id.phoneLong);
        carLat = (TextView) findViewById(R.id.guardLat);
        carLong = (TextView) findViewById(R.id.guardLong);
        startGps = (ToggleButton) findViewById(R.id.startGps);

        preferences = getPreferences(MODE_PRIVATE);
        gpsOn = preferences.getBoolean("gpsOn", false);

        // Initialize the Bluetooth thread, passing in a MAC address
        connectBluetooth = new BluetoothThread(address, new Handler() {
            @Override
            public void handleMessage(Message message) {
                write(gpsOn);
            }
        });
        writeHandler = connectBluetooth.getWriteHandler();
        connectBluetooth.start();
//        bottom = new ToolbarBottomFragment();

        startGps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor = preferences.edit();

                if(startGps.isChecked()){
                    gpsOn = true;
                    editor.putBoolean("gpsOn", true);
                    editor.apply();
                }else{
                    gpsOn = false;
                    editor.putBoolean("gpsOn", false);
                    editor.apply();
                }
            }
        });
    }

    /**
     *   Sends message to Arduino to specify if gps is on.
     *   @param gpsMode Boolean tracking GPS active state
     */
    public void write(boolean gpsMode){
        Message gps = Message.obtain();
        if(gpsMode){
            gps.obj = "G";
            writeHandler.sendMessage(gps);
        }else{
            gps.obj = "M";
            writeHandler.sendMessage(gps);
        }
    }

    public void setPhoneLat(String phoneLatitude){
        phoneLat.setText(" Lat " + phoneLatitude);
    }

    public void setPhoneLong(String phoneLongitude){
        phoneLong.setText(" Long " + phoneLongitude);
    }
    public void setCarLat(String carLatitude){
        carLat.setText(" Lat " + carLatitude);
    }
    public void setCarLong(String carLongitude){
        carLong.setText(" Long " + carLongitude);
    }
}
