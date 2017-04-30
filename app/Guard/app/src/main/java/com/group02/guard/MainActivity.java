package com.group02.guard;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * @version 1.0.1 EL
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button control = (Button) findViewById(R.id.controlButton);
        Button map = (Button) findViewById(R.id.mapsButton);
        Button gps = (Button) findViewById(R.id.gpsButton);
        Button logout = (Button) findViewById(R.id.logoutDebug);

        control.setOnClickListener(this);
        map.setOnClickListener(this);
        gps.setOnClickListener(this);

        session = new Session(this);
        if (!session.loggedin()) {
            logout();
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    private void logout() {
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(this, LoginActivity.class));
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
           default:
                return;
        }
    }

}
