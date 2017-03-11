package com.group02.guard;

import android.widget.ToggleButton;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button control;
    Button map;
    ImageButton optionMenu;
    static ToggleButton connectNav;
    static ToggleButton controlNav;
    static ToggleButton cameraNav;
    static ToggleButton mapNav;
    static ToggleButton homeNav;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        control = (Button) findViewById(R.id.controlButton);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(i);
            }
        });

        control = (Button) findViewById(R.id.controlButton);
        map = (Button) findViewById(R.id.mapsButton);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);

        connectNav = (ToggleButton) findViewById(R.id.connectNavigation);
        controlNav = (ToggleButton) findViewById(R.id.controlNavigation);
        cameraNav = (ToggleButton) findViewById(R.id.cameraNavigation);
        mapNav = (ToggleButton) findViewById(R.id.mapsNavigation);
        homeNav = (ToggleButton) findViewById(R.id.homeNavigation);
    }

    /**
     * @author justinas
     * @purpose initiate new activities when a button is pressed in the MainScreen
     * TODO change from Toast for camera and connect to actual Intent that initiate new activities
     * @param v
     */
    public boolean onClick(View v) {

        switch (v.getId()) {
            case R.id.connectNavigation:
                //connectNav.setChecked(true);
                Toast.makeText(MainActivity.this, "Connect not yet implemented", Toast.LENGTH_LONG).show();
                return true;

            case R.id.controlButton:
                controlNav.setChecked(true);
                Intent controlCar1 = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(controlCar1);
                return true;

            case R.id.controlNavigation:
                controlNav.setChecked(true);
                Intent controlCar2 = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(controlCar2);
                return true;

            case R.id.cameraNavigation:
                //cameraNav.setChecked(true);
                Toast.makeText(MainActivity.this, "Camera not yet implemented", Toast.LENGTH_LONG).show();
                return true;

            case R.id.mapsButton:
                mapNav.setChecked(true);
                Intent openMap1 = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(openMap1);
                return true;

            case R.id.mapsNavigation:
                mapNav.setChecked(true);
                Intent openMap2 = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(openMap2);
                return true;

            case R.id.homeNavigation:
                homeNav.setChecked(true);
                Intent goHome = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(goHome);
                return true;

           default:
                return false;
        }
    }

    /**
     * @author justinas
     * @purpose creates a popup option menu
     * @linked in activity_main.xml with the ImageButton id/menuButton
     * @param v
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_options, popup.getMenu());
        popup.show();
    }

    /**
     * @author justinas
     * @purpose is to identify selected option from menu ny comparing their ids
     * TODO change from Toast to actual Intent that initiate new activities
     * @param item >>> one of the options in the menu
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_profile:
                Toast.makeText(MainActivity.this, "Profile Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_security:
                Toast.makeText(MainActivity.this, "Security Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_settings:
                Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_themes:
                Toast.makeText(MainActivity.this, "App Themes Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_feedback:
                Toast.makeText(MainActivity.this, "Help & Feedback Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}