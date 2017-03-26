package com.group02.guard;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * @author Justinas Stirbys (JS), Erik Laurin (EL), Gabriel Bulai(GB)
 * Creates the "MainScreen" of the G.U.A.R.D. app. Layout used is activity_main.xml
 */
public class MainActivity extends AppCompatActivity {

    ToggleButton connectNav;
    ToggleButton controlNav;
    ToggleButton cameraNav;
    ToggleButton mapNav;
    ToggleButton homeNav;
    Button control;
    Button map;
    Button wifi;
    ImageButton optionMenu;
    ImageButton battery;
    private Button btnLogout;
    private Session session;
    private double analogReadValue = 432;
    private double arduinoVoltage;
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

        control = (Button) findViewById(R.id.controlButton);
        map = (Button) findViewById(R.id.mapsButton);
        wifi = (Button) findViewById(R.id.wifiDirectButton);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);

        connectNav = (ToggleButton) findViewById(R.id.connectNavigation);
        controlNav = (ToggleButton) findViewById(R.id.controlNavigation);
        cameraNav = (ToggleButton) findViewById(R.id.cameraNavigation);
        mapNav = (ToggleButton) findViewById(R.id.mapsNavigation);
        homeNav = (ToggleButton) findViewById(R.id.homeNavigation);

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
     * Version 1.0.0 by JS
     * @param v, the current View
     * @return true if a new activity is initiated, false by default
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
     * Version 1.0.0 by JS
     * @param v, current View
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_options, popup.getMenu());
        popup.show();
    }

    /**
     * Identifies selected option from the option menu by comparing their ids
     * Version 1.0.0 by JS
     * @param item, the clicked option in the pop up menu
     * @return true, for the selected option
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
    private void setBatteryLevel(double analogReadValue) {
        double voltage = getVoltage(analogReadValue);   //Converts from an analog value to voltage
        voltage /=8; //To get average voltage for each battery

        if(voltage >= 1.40) {   //Sets image depending on battery voltage = approx level based on alkaline AA discharge curve
            battery.setImageResource(R.drawable.full_battery);
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            battery.setImageResource(R.drawable.charged_battery);
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            battery.setImageResource(R.drawable.half_charged_battery);
        }
        else if(voltage >= 1.05 && voltage < 1.20) {
            battery.setImageResource(R.drawable.low_battery);
        }
        if(voltage < 1.05){
            battery.setImageResource(R.drawable.empty_battery);
            battery.setBackgroundColor(Color.RED);  //For effect
            setCriticalBatteryLevelToast(); //Calls for toast
            setCriticalBatteryLevelNotification();  //Calls for notification
        }
    }
    /**
     * @author Erik Laurin
     * @purpose is to create a toast to notify the user of the SmartCar's critical battery level
     */
    private void setCriticalBatteryLevelToast(){
        CharSequence text = "Critical battery level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    /**
     * @author Erik Laurin
     * @purpose is to create a notification to notify the user of the SmartCar's critical battery level
     */
    private void setCriticalBatteryLevelNotification(){
        NotificationCompat.Builder mBuilder= new NotificationCompat.Builder(this);
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        mBuilder.setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.guard))
                .setContentTitle("SmartCar Critical Battery Level")
                .setAutoCancel(true)
                .setContentText("content")
                .setContentIntent(pendingIntent); //Sets the app to open MainActivity on press on notificaton
        NotificationManager notificationManager= (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());
    }

    /**
     * @author Erik Laurin
     * @purpose is to calculate the SmartCar's battery voltage
     * @param analogReadValue analogRead value from Arduino between 0-1024
     * @return returns the SmartCar's battery voltage
     */
    private double getVoltage(double analogReadValue){
        arduinoVoltage = analogReadValue* (5.0 / 1023.0); // Converts the analog reading to voltage
        double voltage = arduinoVoltage * 5.0; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino
        return voltage;
    }

    /**
     * @author Erik Laurin
     * @purpose is to open a new View with battery stats when pressing the battery level indicator
     */
    public void displayBatteryStats(View view) {
        Intent batteryStats = new Intent(MainActivity.this, BatteryActivity.class);
        Bundle b = new Bundle();    //Sends intent extras in bundle
        b.putDouble("EXTRA_ANALOG", analogReadValue);
        b.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(b);
        startActivity(batteryStats);
    }
}
