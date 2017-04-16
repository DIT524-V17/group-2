package com.group02.guard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @version 1.0.0
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

        control.setOnClickListener(this);
        map.setOnClickListener(this);
        gps.setOnClickListener(this);
    }

//    private void logout() {
//        session.setLoggedin(false);
//        finish();
//        startActivity(new Intent(this, LoginActivity.class));
//    }

    /**
     * Starts new activities and saves booleans when buttons in the MainScreen are clicked.
     * The booleans are retrieved in other activities and are used to set the state of ToggleButton
     * @param v The current View
     */
    public void onClick(View v) {
        Intent controlIntent = new Intent(this, ControllerActivity.class);
        Intent mapIntent = new Intent(this, MapsActivity.class);
        Intent gpsIntent= new Intent(this, GpsActivity.class);

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
