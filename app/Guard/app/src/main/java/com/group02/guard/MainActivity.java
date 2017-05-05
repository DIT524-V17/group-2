package com.group02.guard;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * @version 1.1.0 JE
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String BTFRAGTAG = "BLUETOOTH_FRAGMENT";

    Button control;
    Button gps;
    Button map;
    Button reconnnect;

    private Session session;

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

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        ConnectionFragment connectionFragment = (ConnectionFragment) fm.findFragmentByTag(MainActivity.BTFRAGTAG);

        if (getSupportFragmentManager().findFragmentByTag(BTFRAGTAG) == null)
        {
            Log.d(TAG, this + ": Existing fragment not found.");
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(new ConnectionFragment(), BTFRAGTAG).commit();
        }
        else
        {
            Log.d(TAG, this + ": Existing fragment found.");
        }

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
                return;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            recreate();
        }
        if (resultCode == RESULT_CANCELED) {
            control.setClickable(false);
            control.setAlpha(0.5f);
            /*
            map.setClickable(false);
            map.setAlpha(0.5f);
            gps.setClickable(false);
            gps.setAlpha(0.5f);
            */
            reconnnect.setVisibility(View.VISIBLE);


        }
    }


}
