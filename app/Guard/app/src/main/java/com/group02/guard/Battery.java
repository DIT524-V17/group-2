package com.group02.guard;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Erik on 2017-02-20.
 */

public class Battery extends Activity{
    private Notification notification;
    public NotificationManager notificationManager;
    private static final String TAG = "CriticalBatteryNotification";
    private static final int NOTIFICATION_ID = 101;
    static Button batteryButton;
    Context context;

    public Battery (Context ReceivedContext, double analogReadVoltage){
        batteryButton = new Button(context);
        context = ReceivedContext;
        setBatteryLevel(analogReadVoltage);
    }

    public Button setBatteryLevel(double analogReadVoltage) {
        double voltage = getVoltage(analogReadVoltage);
        batteryButton.setText(String.format("%.2f", voltage)+ " V");
        batteryButton.setTextColor(Color.WHITE);
        voltage /=8;

        if(voltage >= 1.40) {
            batteryButton.setBackgroundResource(R.drawable.full_battery);
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            batteryButton.setBackgroundResource(R.drawable.charged_battery);
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            batteryButton.setBackgroundResource(R.drawable.half_charged_battery);
        }
        else if(voltage >= 1.10 && voltage < 1.20) {
            batteryButton.setBackgroundResource(R.drawable.low_battery);
        }
        if(voltage < 1){
            batteryButton.setBackgroundResource(R.drawable.empty_battery);
            setBatteryLevel(getVoltage(analogReadVoltage));
            setCriticalBatteryLevelToast();
            setCriticalBatteryLevelNotification();
        }
        return batteryButton;
    }

    private void setCriticalBatteryLevelToast(){
        CharSequence text = "Critical battery level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void setCriticalBatteryLevelNotification(){
        notification = new Notification.Builder(context)
                .setContentTitle("SmartCar Critical Battery Level")
                .setContentText("placeholder")
                .setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(),
                        R.mipmap.guard))
                .setAutoCancel(true)
                .build();
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(TAG, NOTIFICATION_ID, notification);
    }

    private double getVoltage(double analogReadVoltage){
        double voltage = analogReadVoltage * (5.0 / 1023.0); // Converts the analog reading to voltage
        voltage *= 5; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino
        return voltage;
    }

    public static Button getBatteryButton(){
        return batteryButton;
    }
}
