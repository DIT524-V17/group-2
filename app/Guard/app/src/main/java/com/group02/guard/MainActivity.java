package com.group02.guard;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @version 1.0.0
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogout;
    private Session session;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new Session(this);
        if (!session.loggedin()) {
            logout();
        }
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        ImageButton control = (ImageButton) findViewById(R.id.controlButton);
        ImageButton map = (ImageButton) findViewById(R.id.mapsButton);
        ImageButton wifi = (ImageButton) findViewById(R.id.wifiDirectButton);
        ImageButton gps = (ImageButton) findViewById(R.id.gpsButton);

        control.setOnClickListener(this);
        map.setOnClickListener(this);
        wifi.setOnClickListener(this);
        gps.setOnClickListener(this);

        preferences = getPreferences(MODE_PRIVATE);
    }

    private void logout() {
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    /**
     * Starts new activities and saves booleans when buttons in the MainScreen are clicked.
     * The booleans are retrieved in other activities and are used to set the state of ToggleButton
     * @param v The current View
     * @return true If a new activity is initiated, false by default
     */
    public void onClick(View v) {
        SharedPreferences.Editor editor = preferences.edit();
        Intent wifiIntent = new Intent(MainActivity.this, WifiActivity.class);
        Intent controlIntent = new Intent(MainActivity.this, ControllerActivity.class);
        Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
        Intent gpsIntent= new Intent(MainActivity.this, GpsActivity.class);

        switch (v.getId()) {
            case R.id.wifiDirectButton:
                editor.putBoolean("connectSelected", true);
                editor.apply();
                startActivity(wifiIntent);
                return;
            case R.id.controlButton:
                editor.putBoolean("controlSelected", true);
                editor.commit();
                startActivity(controlIntent);
                return;
            case R.id.mapsButton:
                editor.putBoolean("mapsSelected", true);
                editor.commit();
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
