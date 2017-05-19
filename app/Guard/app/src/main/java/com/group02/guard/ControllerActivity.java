package com.group02.guard;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * An activity that includes the video stream, the controller, the batteryImageButton levels of the car.
 * @author Joacim Eberlen, Erik Laurin, Axel Granli, Shaun McMurray
 * @version 1.1.0 JE
 */
public class ControllerActivity extends AppCompatActivity {

    private final String TAG = "ControllerActivity";

    // The thread that does all the work
    BluetoothThread btt;
    // Handler for writing messages to the Bluetooth connection
    private Handler writeHandler;

    //Set MAX_SPEED for motors
    final int MAX_SPEED = 70;

    private String address;
    private boolean btCon;

    ToolbarTopFragment topFragment;
    // Following variables is used by the batteryImageButton function
    private double analogReadValue;
    private double arduinoVoltage;
    private boolean criticalLevel = false;
    private Sensor sfmImage, sfrImage, sflImage, srImage, slImage, sbImage;
    private Control analogue;
    private TextView showMoveEvent;

    private String videoStream;
    private WebView webView;

    /**
     * Creates UI elements and initializes the BluetoothThread.
     * @param savedInstanceState Saved Instance State
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        Bundle bundle = getIntent().getExtras();
        if(bundle.getString("address") != null)
        {
            address = bundle.getString("address");
            btCon = bundle.getBoolean("btCon");
        }

        try {

            webView = (WebView) findViewById(R.id.videoview);
            videoStream = "http://192.168.42.1:8080/stream";

            int default_zoom_level = 100;
            webView.setInitialScale(default_zoom_level);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            webView.post(new Runnable() {
                @Override
                public void run() {
                    int width = webView.getWidth();
                    int height = webView.getHeight();
                    webView.loadUrl(videoStream + "?width=" + width + "&height=" + height);
                }
            });
        }catch (Exception e){
            Log.d(TAG, e.getMessage());
        }

        analogue = (Control) findViewById(R.id.controlView);

        if(btCon) {
            Log.d(TAG, "Start Thread: startThread initiated.");
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

            showMoveEvent = (TextView) findViewById(R.id.coords);
            sfmImage = (Sensor) findViewById(R.id.sensor_front_middle);
            sfrImage = (Sensor) findViewById(R.id.sensor_front_right);
            sflImage = (Sensor) findViewById(R.id.sensor_front_left);
            slImage = (Sensor) findViewById(R.id.sensor_left);
            srImage = (Sensor) findViewById(R.id.sensor_right);
            sbImage = (Sensor) findViewById(R.id.sensor_back);

            analogue.setOnMoveListener(new Control.OnMoveListener() {
                public void onMoveInDirection(final double polarAngle) {
                    double speed = analogue.getSpeed(MAX_SPEED);
                    Log.e("", "" + speed);
                    // [0] is left, [1] is right
                    int[] motors = analogue.motorSpeed((int) speed, (int) analogue.nAngle());
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

        } else {
            analogue.setAlpha(0.5f);
            analogue.setClickable();
            analogue.setOnMoveListener(new Control.OnMoveListener() {
                @Override
                public void onMoveInDirection(final double polarAngle) {
                }
                @Override
                public void onMoveStopped() {

                }
            });
        }

        topFragment = (ToolbarTopFragment)getSupportFragmentManager()
                .findFragmentById(R.id.topBar);
        topFragment.getBatteryButton().setVisibility(View.VISIBLE);

        ToolbarBottomFragment fragment = (ToolbarBottomFragment)getSupportFragmentManager()
                .findFragmentById(R.id.bottomBarr);
        fragment.buttonChecked("control");


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
            topFragment.getBatteryButton().clearColorFilter();
            topFragment.getBatteryButton().setImageResource(R.drawable.full_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            topFragment.getBatteryButton().clearColorFilter();
            topFragment.getBatteryButton().setImageResource(R.drawable.charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            topFragment.getBatteryButton().clearColorFilter();
            topFragment.getBatteryButton().setImageResource(R.drawable.half_charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.15 && voltage < 1.20) {
            topFragment.getBatteryButton().clearColorFilter();
            topFragment.getBatteryButton().setImageResource(R.drawable.low_battery);
            criticalLevel = false;
        }
        if(voltage < 1.15){
            topFragment.getBatteryButton().setImageResource(R.drawable.empty_battery);
            topFragment.getBatteryButton().setColorFilter(Color.RED);  //For effect
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
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.guard_launcher))
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
        topFragment.setArduinoVoltage(arduinoVoltage);
        double voltage = arduinoVoltage * 5.0; //Restores the actual voltage (the voltage is divided by 5 since Arduino can handle max 5 V)
        return voltage;
    }

    /**
     * The method takes and decodes the strings received via Bluetooth from the SmartCar.
     * Depending on type of string (its first letter decides its use),
     * various actions executes
     * @param inputString String received from the SmartCar containing data
     */
    private void readInput(String inputString){

        Log.d(TAG, inputString);

        switch (inputString.charAt(0) + inputString.charAt(1)) {
            case 'B' + 'B':
                analogReadValue = Integer.parseInt(inputString.substring(2).trim());
                topFragment.setAnalogReadValue(analogReadValue);
                setBatteryLevel();
                break;
            case 'F' + 'M':
                sfmImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            case 'F' + 'L':
                sflImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            case 'F' + 'R':
                sfrImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            case 'S' + 'L':
                slImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            case 'S' + 'R':
                srImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            case 'S' + 'B':
                sbImage.setDistance(Integer.parseInt(inputString.substring(2).trim()));
                break;
            default:
                break;

        }
    }


}