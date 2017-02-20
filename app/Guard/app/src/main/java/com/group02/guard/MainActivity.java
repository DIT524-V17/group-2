package com.group02.guard;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Notification notification;
    public NotificationManager notificationManager;
    private static final String TAG = "CriticalBatteryNotification";
    private static final int NOTIFICATION_ID = 101;
    Button connect;
    Button control;
    Button camera;
    Button map;
    Button battery;
    ImageButton optionMenu;

    Toolbar appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(appBar);

        connect = (Button) findViewById(R.id.connectButton);
        control = (Button) findViewById(R.id.controlButton);
        camera = (Button) findViewById(R.id.cameraButton);
        map = (Button) findViewById(R.id.mapsButton);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);
        battery = (Button) findViewById(R.id.batteryButton);
        setBatteryLevel(10);
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
                Toast.makeText(MainActivity.this, "Connect not yet implemented", Toast.LENGTH_LONG).show();
                return true;

            case R.id.controlButton:
                Intent controlCar = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(controlCar);
                return true;

            case R.id.cameraButton:
                Toast.makeText(MainActivity.this, "Camera not yet implemented", Toast.LENGTH_LONG).show();
                return true;

            case R.id.mapsButton:
                Intent openMap = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(openMap);
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

    public Button setBatteryLevel(double analogReadVoltage) {
        double voltage = getVoltage(analogReadVoltage);
        battery.setText(String.format("%.2f", voltage)+ " V");
        battery.setTextColor(Color.WHITE);
        voltage /=8;

        if(voltage >= 1.40) {
            battery.setBackgroundResource(R.drawable.full_battery);
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            battery.setBackgroundResource(R.drawable.charged_battery);
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            battery.setBackgroundResource(R.drawable.half_charged_battery);
        }
        else if(voltage >= 1.10 && voltage < 1.20) {
            battery.setBackgroundResource(R.drawable.low_battery);
        }
        if(voltage < 1){
            battery.setBackgroundResource(R.drawable.empty_battery);
            criticalBatteryLevelToast();
            criticalBatteryLevelNotification();
        }
        return battery;
    }

    public Toast criticalBatteryLevelToast(){
        Context context = getApplicationContext();
        CharSequence text = "Critical battery level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return toast;
    }

    public void criticalBatteryLevelNotification(){
        notification = new Notification.Builder(this)
                .setContentTitle("SmartCar Critical Battery Level")
                .setContentText("placeholder")
                .setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                        R.mipmap.guard))
                .setAutoCancel(true)
                .build();
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(TAG, NOTIFICATION_ID, notification);
    }

    public double getVoltage(double analogReadVoltage){
        double voltage = analogReadVoltage * (5.0 / 1023.0); // Converts the analog reading to voltage
        voltage *= 5; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino
        return voltage;
    }
}
