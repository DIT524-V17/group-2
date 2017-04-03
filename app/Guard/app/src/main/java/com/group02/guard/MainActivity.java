package com.group02.guard;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ToggleButton;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * @author Justinas Stirbys (JS), Gabriel Bulai(GB)
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 * @version 1.0.0
 */
public class MainActivity extends AppCompatActivity {

    ImageButton connectNav;
    ImageButton controlNav;
    ImageButton cameraNav;
    ImageButton mapNav;
    ImageButton homeNav;
    Button control;
    Button map;
    Button wifi;
    ImageButton optionMenu;
    private Button btnLogout;
    private Session session;
    SharedPreferences preferences;
    Toolbar top;
    Toolbar bottom;

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

        control = (Button) findViewById(R.id.controlButton);
        map = (Button) findViewById(R.id.mapsButton);
        wifi = (Button) findViewById(R.id.wifiDirectButton);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);

        connectNav = (ImageButton) findViewById(R.id.connectNavigation);
        controlNav = (ImageButton) findViewById(R.id.controlNavigation);
        cameraNav = (ImageButton) findViewById(R.id.cameraNavigation);
        mapNav = (ImageButton) findViewById(R.id.mapsNavigation);
        homeNav = (ImageButton) findViewById(R.id.homeNavigation);

        preferences = getPreferences(MODE_PRIVATE);
        top = (Toolbar) findViewById(R.id.top_toolbar);
        bottom = (Toolbar) findViewById(R.id.bottom_toolbar);
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
    public boolean onClick(View v) {
        SharedPreferences.Editor editor = preferences.edit();
        Intent wifi = new Intent(MainActivity.this, WifiActivity.class);
        Intent controlCar = new Intent(MainActivity.this, ControllerActivity.class);
        Intent openMap = new Intent(MainActivity.this, MapsActivity.class);
        Intent goHome = new Intent(MainActivity.this, MainActivity.class);

        switch (v.getId()) {
            case R.id.wifiDirectButton:
                editor.putBoolean("connectSelected", true);
                editor.apply();
                startActivity(wifi);
                return true;
            case R.id.connectNavigation:
                editor.putBoolean("connectSelected", true);
                editor.commit();
                startActivity(wifi);
                return true;
            case R.id.controlButton:
                editor.putBoolean("controlSelected", true);
                editor.commit();
                startActivity(controlCar);
                return true;
            case R.id.controlNavigation:
                editor.putBoolean("controlSelected", true);
                editor.commit();
                startActivity(controlCar);
                return true;
            case R.id.mapsButton:
                editor.putBoolean("mapsSelected", true);
                editor.commit();
                startActivity(openMap);
                return true;
            case R.id.mapsNavigation:
                editor.putBoolean("mapsSelected", true);
                editor.commit();
                startActivity(openMap);
                return true;
            case R.id.homeNavigation:
                startActivity(goHome);
                return true;
           default:
                return false;
        }
    }

    /**
     * Creates a popup option menu
     * @param v Current View
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_options, popup.getMenu());
        popup.show();
    }

    /**
     * Identifies selected option from the option menu by comparing their ids
     * @param item The clicked option in the pop up menu
     * @return true For the selected option
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_profile:
                Toast.makeText(MainActivity.this, "Profile Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_security:
                Toast.makeText(MainActivity.this, "Security Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_settings:
                Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_themes:
                Toast.makeText(MainActivity.this, "App Themes Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_feedback:
                Toast.makeText(MainActivity.this, "Help & Feedback Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
