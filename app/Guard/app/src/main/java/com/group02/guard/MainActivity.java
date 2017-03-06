package com.group02.guard;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ToggleButton;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {
    Button connect;
    Button control;
    Button camera;
    Button map;
    ImageButton battery;
    ImageButton optionMenu;
    static ToggleButton connectNav;
    static ToggleButton controlNav;
    static ToggleButton cameraNav;
    static ToggleButton mapNav;
    static ToggleButton homeNav;

    private double analogReadValue = 432;
    private double arduinoVoltage;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect = (Button) findViewById(R.id.connectButton);
        control = (Button) findViewById(R.id.controlButton);
        camera = (Button) findViewById(R.id.cameraButton);
        map = (Button) findViewById(R.id.mapsButton);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);

        battery = (ImageButton) findViewById(R.id.batteryButton);
        setBatteryLevel(analogReadValue);

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
            case R.id.connectButton:
                Intent i = new Intent(MainActivity.this, WifiActivity.class);
                startActivity(i);
                //Toast.makeText(MainActivity.this, "Connect not yet implemented", Toast.LENGTH_LONG).show();
                return true;

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

            case R.id.cameraButton:
                //cameraNav.setChecked(true);
                Toast.makeText(MainActivity.this, "Camera not yet implemented", Toast.LENGTH_LONG).show();
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

    /**
     * @author Erik Laurin
     * @purpose is to set battery icon depending on remaining battery level
     * @param analogReadValue analogRead value from Arduino between 0-1024
     */
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