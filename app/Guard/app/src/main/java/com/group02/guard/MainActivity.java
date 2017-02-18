package com.group02.guard;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;


public class MainActivity extends Activity {
    private Notification notification;
    public NotificationManager notificationManager;
    private static final String TAG = "CriticalBatteryNotification";
    private static final int NOTIFICATION_ID = 101;
    Button connect;
    Button control;
    Button camera;
    Button map;
    Button battery;

    Toolbar appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect = (Button) findViewById(R.id.connectButton);

        control = (Button) findViewById(R.id.controlButton);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(i);
            }
        });

        camera = (Button) findViewById(R.id.cameraButton);

        map = (Button) findViewById(R.id.mapsButton);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        battery = (Button) findViewById(R.id.batteryButton);
        setBatteryLevel(10);
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
