package com.group02.guard;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.content.pm.ActivityInfo;

import java.nio.ByteBuffer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * An activity that includes the video stream, the controller, the batteryImageButton levels of the car.
 * @author Joacim Eberlen, Erik Laurin
 * @version 1.0.2 EL
 */
public class ControllerActivity extends AppCompatActivity {

    // Following variables is used by the batteryImageButton function
    private Intent batteryStats;
    private Bundle batteryBundle;
    private ImageButton batteryImageButton;
    private double analogReadValue;
    private double arduinoVoltage;
    private boolean criticalLevel = false;

    Control analogue;
    TextView showMoveEvent;

    String address = "20:15:10:20:11:37";

    // The thread that does all the work
    BluetoothThread btt;

    // Handler for writing messages to the Bluetooth connection
    Handler writeHandler;

    private int sfmReadValue;
    private TextView sfm;
    private ImageView sfmImage;

    private int sflReadValue = 20;
    private TextView sfl;
    private ImageView sflImage;

    private int sfrReadValue = 20;
    private TextView sfr;
    private ImageView sfrImage;

    private int srReadValue = 30;
    private TextView sr;
    private ImageView srImage;

    private int slReadValue = 50;
    private TextView sl;
    private ImageView slImage;

    private int sbReadValue = 9;
    private TextView sb;
    private ImageView sbImage;

    ToggleButton controlNav;
    SharedPreferences preferences;

    public static byte[] toByteArray(double value) {
        byte[] bytes = new byte[8];
        ByteBuffer.wrap(bytes).putDouble(value);
        return bytes;
    }

    public static double toDouble(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getDouble();
    }
    //Set MAX_SPEED for motors
    final int MAX_SPEED = 70;

    /**
     * Creates UI elements and initializes the BluetoothThread.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        showMoveEvent = (TextView) findViewById(R.id.coords);

        analogue = (Control) findViewById(R.id.controlView);

        sfm = (TextView) findViewById(R.id.sfm_value);
        sfmImage = (ImageView) findViewById(R.id.sfm_image);

        sfr = (TextView) findViewById(R.id.sfr_value);
        sfrImage = (ImageView) findViewById(R.id.sfr_image);

        sfl = (TextView) findViewById(R.id.sfl_value);
        sflImage = (ImageView) findViewById(R.id.sfl_image);

        sl = (TextView) findViewById(R.id.sl_value);
        slImage = (ImageView) findViewById(R.id.sl_image);

        sr = (TextView) findViewById(R.id.sr_value);
        srImage = (ImageView) findViewById(R.id.sr_image);

        sb = (TextView) findViewById(R.id.sb_value);
        sbImage = (ImageView) findViewById(R.id.sb_image);

        preferences = getPreferences(MODE_PRIVATE);
        controlNav = (ToggleButton) findViewById(R.id.controlNavigation);
        boolean controllerSelected = preferences.getBoolean("controlSelected", false);
        controlNav.setChecked(controllerSelected);

        // Initialize the Bluetooth thread, passing in a MAC address
        // and a Handler that will receive incoming messages
        btt = new BluetoothThread(address, new Handler() {

            @Override
            public void handleMessage(Message message) {

            String s = (String) message.obj;
            readInput(s);
            }
        });

        // Get the handler that is used to send messages
        writeHandler = btt.getWriteHandler();

        // Run the thread
        btt.start();

        analogue.setOnMoveListener(new Control.OnMoveListener() {
            public void onMoveInDirection(final double polarAngle) {
                double speed = analogue.getSpeed(MAX_SPEED);
                Log.e("", "" + speed);
                // [0] is left, [1] is right
                int[] motors = analogue.motorSpeed((int)speed, (int)analogue.nAngle());
                showMoveEvent.setText("Angle: " + analogue.nAngle() + "\nLEFT MOTOR: " + motors[0] + "\nRIGHT MOTOR: " + motors[1] + "." + "\nSpeed: " + speed);

                write(motors[0], motors[1]);
            }

            @Override
            public void onMoveStopped() {
                showMoveEvent.setText("Angle: " + analogue.nAngle() + "\nLEFT MOTOR: " + 0 + "\nRIGHT MOTOR: " + 0 + "." + "\nSpeed: " + 0);
                write(0, 0);
            }
        });

        batteryImageButton = (ImageButton) findViewById(R.id.batteryButton);
        batteryImageButton.setVisibility(View.VISIBLE);
        batteryBundle = new Bundle();
        batteryStats = new Intent();

        setSensorValues();
    }

    /**
     *   Writing to the Arduino for motor control.
     *   @param right Right motor.
     *   @param left Left motor,
     */
    public void write(int left, int right){
            Message l = Message.obtain();
            l.obj = "L" + left;
            writeHandler.sendMessage(l);

            Message r = Message.obtain();
            r.obj = "R" + right;
            writeHandler.sendMessage(r);
    }

    /**
     * The method sets batteryImageButton icon depending on the SmartCar's battery level
     * (@author Erik Laurin)
     */
    public void setBatteryLevel() {
        double voltage = getVoltage(analogReadValue);   //Converts from an analog value to voltage
        voltage /=8; //To get average voltage for each batteryImageButton

        if(voltage >= 1.40) {   //Sets image depending on batteryImageButton voltage = approx level based on alkaline AA discharge curve
            batteryImageButton.clearColorFilter();
            batteryImageButton.setImageResource(R.drawable.full_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            batteryImageButton.clearColorFilter();
            batteryImageButton.setImageResource(R.drawable.charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            batteryImageButton.clearColorFilter();
            batteryImageButton.setImageResource(R.drawable.half_charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.05 && voltage < 1.20) {
            batteryImageButton.clearColorFilter();
            batteryImageButton.setImageResource(R.drawable.low_battery);
            criticalLevel = false;
        }
        if(voltage < 1.05){
            batteryImageButton.setImageResource(R.drawable.empty_battery);
            batteryImageButton.setColorFilter(Color.RED);  //For effect
            if(!criticalLevel) {
                setCriticalBatteryLevelToast(); //Calls for toast
                setCriticalBatteryLevelNotification();  //Calls for notification
            }
            criticalLevel = true;
        }
    }

    /**
     * The method creates a toast to notify the user of the SmartCar's critical battery level
     * (@author Erik Laurin)
     */
    private void setCriticalBatteryLevelToast(){
        CharSequence text = "Critical batteryImageButton level!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    /**
     * The method creates a notification to notify the user of the SmartCar's critical battery level
     * (@author Erik Laurin)
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
     * The method calculates the SmartCar's battery voltage (@author Erik Laurin)
     * @param analogReadValue analogRead value from Arduino between 0-1024
     * @return returns the SmartCar's battery voltage as a double
     */
    private double getVoltage(double analogReadValue){
        arduinoVoltage = analogReadValue* (5.0 / 1024.0); // Converts the analog reading to voltage
        double voltage = arduinoVoltage * 5.0; //Restores the actual voltage (the voltage is divided by 5 since Arduino can handle max 5 V)
        return voltage;
    }

    /**
     * Method is called when pressing the batteryImageButton. Opens a new View with detailed battery data (@author Erik Laurin)
     * @param view current view is passed to the onClick method
     */
    public void displayBatteryStats(View view) {
        batteryStats = new Intent(this, BatteryActivity.class);
        batteryBundle = new Bundle();    //Sends intent extras in bundle
        batteryBundle.putDouble("EXTRA_ANALOG", analogReadValue);
        batteryBundle.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(batteryBundle);
        startActivity(batteryStats);
    }

    /**
     * The method takes and decodes the strings received via Bluetooth from the SmartCar.
     * Depending on type of string (its first letter decides its use), various actions executes (@author Erik Laurin)
     * @param inputString String received from the SmartCar containing data
     */
    private void readInput(String inputString){
        if(inputString.startsWith("B")){ //Updates the battery level
            try {
                analogReadValue = Integer.parseInt(inputString.substring(1).trim());
                setBatteryLevel();

            } catch(NumberFormatException e) {
                System.out.println("Could not parse " + "'" + inputString.substring(1) +"'");
            }
        } else if (inputString.startsWith("fr")) {
            try {
                sfrReadValue = Integer.parseInt(inputString.substring(2).trim());
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        } else if (inputString.startsWith("FM")) {
            try {
                sfmReadValue = Integer.parseInt(inputString.substring(2).trim());
                Log.e("", "" + sfmReadValue);
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        } else if (inputString.startsWith("fl")) {
            try {
                sflReadValue = Integer.parseInt(inputString.substring(2).trim());
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        } else if (inputString.startsWith("r")) {
            try {
                srReadValue = Integer.parseInt(inputString.substring(1).trim());
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        } else if (inputString.startsWith("l")) {
            try {
                slReadValue = Integer.parseInt(inputString.substring(1).trim());
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        } else if (inputString.startsWith("sb")) {
            try {
                sbReadValue = Integer.parseInt(inputString.substring(2).trim());
                setSensorValues();

            } catch (NumberFormatException e) {
                System.out.println("Could not parse");
            }
        }
    }
    private void setSensorValues() {
        sfm.setText(String.valueOf(sfmReadValue));
        sfl.setText(String.valueOf(sflReadValue));
        sfr.setText(String.valueOf(sfrReadValue));
        sr.setText(String.valueOf(srReadValue));
        sl.setText(String.valueOf(slReadValue));
        sb.setText(String.valueOf(sbReadValue));

        if(sfmReadValue < 10){
            sfmImage.setImageAlpha(255);
        }
        else if (sfmReadValue <= 20 && sfmReadValue > 10){
            sfmImage.setImageAlpha(170);
        }
        else if (sfmReadValue <= 40 && sfmReadValue > 20){
            sfmImage.setImageAlpha(85);
        }
        else if (sfmReadValue > 40){
            sfmImage.setImageAlpha(7);
        }

        if(sflReadValue < 10){
            sflImage.setImageAlpha(255);
        }
        else if (sflReadValue <= 20 && sflReadValue > 10){
            sflImage.setImageAlpha(170);
        }
        else if (sflReadValue <= 40 && sflReadValue > 20){
            sflImage.setImageAlpha(85);
        }
        else if (sflReadValue > 40){
            sflImage.setImageAlpha(7);
        }

        if(sfrReadValue < 10){
            sfrImage.setImageAlpha(255);
        }
        else if (sfrReadValue <= 20 && sfrReadValue > 10){
            sfrImage.setImageAlpha(170);
        }
        else if (sfrReadValue <= 40 && sfrReadValue > 20){
            sfrImage.setImageAlpha(85);
        }
        else if (sfrReadValue > 40){
            sfrImage.setImageAlpha(7);
        }

        if(slReadValue < 10){
            slImage.setImageAlpha(255);
        }
        else if (slReadValue <= 20 && slReadValue > 10){
            slImage.setImageAlpha(170);
        }
        else if (slReadValue <= 40 && slReadValue > 20){
            slImage.setImageAlpha(85);
        }
        else if (slReadValue > 40){
            slImage.setImageAlpha(7);
        }

        if(srReadValue < 10){
            srImage.setImageAlpha(255);
        }
        else if (srReadValue <= 20 && srReadValue > 10){
            srImage.setImageAlpha(170);
        }
        else if (srReadValue <= 40 && srReadValue > 20){
            srImage.setImageAlpha(85);
        }
        else if (srReadValue > 40){
            srImage.setImageAlpha(7);
        }

        if(sbReadValue < 10){
            sbImage.setImageAlpha(255);
        }
        else if (sbReadValue <= 20 && sbReadValue > 10){
            sbImage.setImageAlpha(170);
        }
        else if (sbReadValue <= 40 && sbReadValue > 20){
            sbImage.setImageAlpha(85);
        }
        else if (sbReadValue > 40){
            sbImage.setImageAlpha(7);
        }
    }
}