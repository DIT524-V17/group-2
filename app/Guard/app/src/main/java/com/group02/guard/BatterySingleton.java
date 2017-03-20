package com.group02.guard;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by jeberlen on 2017-03-20.
 */

class BatterySingleton extends MainActivity{

    // Following variables is used by the battery function
    private Intent batteryStats;
    private Bundle batteryBundle;
    private Handler batteryHandler;
    private ImageButton battery;
    private double analogReadValue;
    private double arduinoVoltage;
    private Boolean criticalLevel = false;

    private static final BatterySingleton ourInstance = new BatterySingleton();

    public static synchronized BatterySingleton getInstance() {
        return ourInstance;
    }

    private BatterySingleton() {

    }

    /**
     * @author jeberlen
     * @purpose Makes the image button visible and initializes the view.
     */
    protected void initBattery(){
        batteryStats = new Intent();
        batteryBundle = new Bundle();
        batteryHandler = new Handler();
    }

    protected void showBattery(ImageButton newBattery){
        battery = newBattery;
        battery.setVisibility(View.VISIBLE);
    }

    /**
     * @author Erik Laurin
     * @purpose sets battery icon depending on remaining battery level
     */
    protected void setBatteryLevel() {
        double voltage = getVoltage(analogReadValue);   //Converts from an analog value to voltage
        voltage /= 8; //To get average voltage for each battery

        if (voltage >= 1.40) {   //Sets image depending on battery voltage = approx level based on alkaline AA discharge curve
            battery.clearColorFilter();
            battery.setImageResource(R.drawable.full_battery);
            criticalLevel = false;
        } else if (voltage >= 1.30 && voltage < 1.40) {
            battery.clearColorFilter();
            battery.setImageResource(R.drawable.charged_battery);
            criticalLevel = false;
        } else if (voltage >= 1.20 && voltage < 1.30) {
            battery.clearColorFilter();
            battery.setImageResource(R.drawable.half_charged_battery);
            criticalLevel = false;
        } else if (voltage >= 1.05 && voltage < 1.20) {
            battery.clearColorFilter();
            battery.setImageResource(R.drawable.low_battery);
            criticalLevel = false;
        }
        if (voltage < 1.05) {
            battery.setImageResource(R.drawable.empty_battery);
            battery.setColorFilter(Color.RED);  //For effect
            if (!criticalLevel) {   //Makes the toast and notification only appear ones
                setCriticalBatteryLevelToast(); //Calls for toast
                setCriticalBatteryLevelNotification();  //Calls for notification
            }
            criticalLevel = true;
        }
    }

    /**
     * @author Erik Laurin
     * @purpose is to create a toast to notify the user of the SmartCar's critical battery level
     */
    protected void setCriticalBatteryLevelToast() {
        CharSequence text = "Critical battery level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    /**
     * @author Erik Laurin
     * @purpose Creates a notification notifying critical battery level
     */
    protected void setCriticalBatteryLevelNotification() {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.guard))
                .setContentTitle("SmartCar")
                .setAutoCancel(true)
                .setContentText("Critical battery level")
                .setContentIntent(pendingIntent); //Sets BatteryActivity on press on notificaton
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());
    }

    /**
     * @param analogReadValue analogRead value from Arduino between 0-1024
     * @return returns the SmartCar's battery voltage
     * @author Erik Laurin
     * @purpose calculates the SmartCar's battery voltage
     */
    protected double getVoltage(double analogReadValue) {
        arduinoVoltage = analogReadValue * (5.0 / 1024.0); // Converts the analog reading to voltage
        double voltage = arduinoVoltage * 5.0; //Restores the actual voltage measured (divided by 5 from the voltage divider before entiring the Arduino
        return voltage;
    }

    /**
     * @author Erik Laurin
     * @purpose opens BatteryActivity when pressing the battery level indicator
     */
    protected void displayBatteryStats(View view) {
        batteryStats = new Intent(this, BatteryActivity.class);
        batteryBundle = new Bundle();    //Sends intent extras in bundle
        batteryBundle.putDouble("EXTRA_ANALOG", analogReadValue);
        batteryBundle.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(batteryBundle);
        startActivity(batteryStats);
    }

    /**
     * @param BTString String received via Bluetooth
     * @author Erik Laurin
     * @purpose executes actions based on BT input
     */
    protected void readInput(String BTString) {
        if (BTString.startsWith("B")) { //refreshes the battery value and level indicator
            try {
                analogReadValue = Integer.parseInt(BTString.substring(1).trim());
                setBatteryLevel();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse " + "'" + BTString.substring(1) + "'");
            }
        } else if (BTString.startsWith("SENSORMID")) {
            //placeholder
        }
    }

}
