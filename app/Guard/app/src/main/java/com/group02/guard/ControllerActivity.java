package com.group02.guard;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
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
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.Math.round;

/**
 * An activity that includes the video stream, the controller, the batteryImageButton levels of the car.
 * @author Joacim Eberlen, Erik Laurin, Axel Granli
 * @version 1.0.4 JE
 */
public class ControllerActivity extends MainActivity {

    // Following variables is used by the batteryImageButton function
    private Intent batteryStats;
    private Bundle batteryBundle;
    private ImageButton batteryImageButton;
    private double analogReadValue;
    private double arduinoVoltage;
    private boolean criticalLevel = false;

    private Sensor sfmImage, sfrImage, sflImage, srImage, slImage, sbImage;
    private Control analogue;
    private TextView showMoveEvent;

    String address = "20:15:10:20:11:37";

    // The thread that does all the work
    BluetoothThread btt;

    // Handler for writing messages to the Bluetooth connection
    Handler writeHandler;


    ImageButton controlNav;
    SharedPreferences preferences;
    ImageButton optionMenu;

    static final int MAX_SPEED = 70;

    /**
     * Creates UI elements and initializes the BluetoothThread.
     * @param savedInstanceState Saved Instance State
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        showMoveEvent = (TextView) findViewById(R.id.coords);

        analogue = (Control) findViewById(R.id.controlView);
        optionMenu = (ImageButton) findViewById(R.id.menuButton);

        sfmImage = (Sensor) findViewById(R.id.sensor_front_middle);
        sfrImage = (Sensor) findViewById(R.id.sensor_front_right);
        sflImage = (Sensor) findViewById(R.id.sensor_front_left);
        slImage = (Sensor) findViewById(R.id.sensor_left);
        srImage = (Sensor) findViewById(R.id.sensor_right);
        sbImage = (Sensor) findViewById(R.id.sensor_back);

         // Initialize the Bluetooth thread, passing in a MAC address
        // and a Handler that will receive incoming messages
        btt = new BluetoothThread(address, new Handler() {

            @Override
            public void handleMessage(Message message) {

            String s = (String) message.obj;
                /*
                if(s.equals("CONNECTION FAILED")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(ControllerActivity.this);
                    builder.setMessage("Could not connect")
                            .setCancelable(false)
                            .setNegativeButton("Reconnect", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = getIntent();
                                    finish();
                                    startActivity(intent);
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                }else if(s.equals("CONNECTED")){
                    showMoveEvent.setText("Connected");
                }
                */
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
                showMoveEvent.setText("Angle: " + analogue.nAngle()
                        + "\nLEFT MOTOR: " + motors[0] + "\nRIGHT MOTOR: " + motors[1] + "."
                        + "\nSpeed: " + speed);

                write(motors[0], motors[1]);
            }

            @Override
            public void onMoveStopped() {
                showMoveEvent.setText("Angle: " + analogue.nAngle()
                        + "\nLEFT MOTOR: " + 0 + "\nRIGHT MOTOR: " + 0 + "."
                        + "\nSpeed: " + 0);
                write(0, 0);
            }
        });

        batteryImageButton = (ImageButton) findViewById(R.id.batteryButton);
        batteryImageButton.setVisibility(View.VISIBLE);
        batteryBundle = new Bundle();
        batteryStats = new Intent();
    }

    /**
     *   Writing to the Arduino for motor control.
     *   @param right Right motor
     *   @param left Left motor
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
        else if(voltage >= 1.15 && voltage < 1.20) {
            batteryImageButton.clearColorFilter();
            batteryImageButton.setImageResource(R.drawable.low_battery);
            criticalLevel = false;
        }
        if(voltage < 1.15){
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
        CharSequence text = "Critical Battery Level!";
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
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        mBuilder.setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.guard))
                .setContentTitle("Critical Battery Level")
                .setAutoCancel(true)
                .setContentText(String.format("%.3f", (arduinoVoltage)) + "V")
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
     * Depending on type of string (its first letter decides its use), various actions executes (@author Erik Laurin and partly Axel Granli)
     * @param inputString String received from the SmartCar containing data
     */
    private void readInput(String inputString){

        int parsedMsg = Integer.parseInt(inputString.substring(2).trim());


        switch (inputString){
            case "B":
                analogReadValue = Integer.parseInt(inputString.substring(1).trim());
                setBatteryLevel();
                break;
            case "FM":
                sfmImage.setDistance(parsedMsg);
                break;
            case "FL":
                sflImage.setDistance(parsedMsg);
                break;
            case "FR":
                sfrImage.setDistance(parsedMsg);
                break;
            case "SL":
                slImage.setDistance(parsedMsg);
                break;
            case "SR":
                srImage.setDistance(parsedMsg);
                break;
            case "SB":
                sbImage.setDistance(parsedMsg);
                break;
            default:
                return;

        }
    }
}