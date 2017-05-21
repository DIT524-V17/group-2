package com.group02.guard;

import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;



/**
 * Creates an analog controller to control the SmartCar
 * @author Joacim Eberlen, Boyan Dai
 * @version 1.0.1 BD
 */
public class ControllerFragment extends Fragment {
    // Following variables is used by the batteryImageButton function
    private double analogReadValue;
    private double arduinoVoltage;
    private boolean criticalLevel = false;

    private Sensor sfmImage, sfrImage, sflImage, srImage, slImage, sbImage;
    private Control analogue;
    ImageButton batteryButton;

    private String videoStream;
    private WebView webView;



    String address = "20:15:10:20:11:37";

    // The thread that does all the work
    BluetoothThread btt;

    // Handler for writing messages to the Bluetooth connection
    Handler writeHandler;

    //Set MAX_SPEED for motors
    final int MAX_SPEED = 70;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_controller2, parent, false);

        try {

            webView = (WebView) view.findViewById(R.id.videoview);
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
            e.printStackTrace();
        }

        analogue = (Control) view.findViewById(R.id.controlView);

        sfmImage = (Sensor) view.findViewById(R.id.sensor_front_middle);
        sfrImage = (Sensor) view.findViewById(R.id.sensor_front_right);
        sflImage = (Sensor) view.findViewById(R.id.sensor_front_left);
        slImage = (Sensor) view.findViewById(R.id.sensor_left);
        srImage = (Sensor) view.findViewById(R.id.sensor_right);
        sbImage = (Sensor) view.findViewById(R.id.sensor_back);

        batteryButton = (ImageButton) view.findViewById(R.id.batteryButton);
        batteryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                displayBatteryStats(v);
            }
        });

        analogue.setOnMoveListener(new Control.OnMoveListener() {
            public void onMoveInDirection(final double polarAngle) {
                double speed = analogue.getSpeed(MAX_SPEED);
                Log.e("", "" + speed);
                // [0] is left, [1] is right
                int[] motors = analogue.motorSpeed((int)speed, (int)analogue.nAngle());
                write(motors[0], motors[1]);
            }

            @Override
            public void onMoveStopped() {
                write(0, 0);
            }
        });

        return view;
    }


    /**
     * Creates UI elements and initializes the BluetoothThread.
     *
     */
    @Override
    public void onCreate(Bundle SharedPreferences) {

        super.onCreate(SharedPreferences);
        setRetainInstance(true);



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
            batteryButton.clearColorFilter();
            batteryButton.setImageResource(R.drawable.full_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.30 && voltage < 1.40) {
            batteryButton.clearColorFilter();
            batteryButton.setImageResource(R.drawable.charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.20 && voltage < 1.30) {
            batteryButton.clearColorFilter();
            batteryButton.setImageResource(R.drawable.half_charged_battery);
            criticalLevel = false;
        }
        else if(voltage >= 1.15 && voltage < 1.20) {
            batteryButton.clearColorFilter();
            batteryButton.setImageResource(R.drawable.low_battery);
            criticalLevel = false;
        }
        if(voltage < 1.15){
            batteryButton.setImageResource(R.drawable.empty_battery);
            batteryButton.setColorFilter(Color.RED);  //For effect
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
        Toast toast = Toast.makeText(getActivity(), text, duration);
        toast.show();
    }

    /**
     * The method creates a notification to notify the user of the SmartCar's critical battery level
     * (@author Erik Laurin)
     */
    private void setCriticalBatteryLevelNotification(){
        NotificationCompat.Builder mBuilder= new NotificationCompat.Builder(getActivity());
        Intent intent = new Intent(getActivity(), NavigationActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(getActivity(), 0, intent, 0);
        mBuilder.setSmallIcon(R.drawable.notification_battery)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.guard_launcher))
                .setContentTitle("Critical Battery Level")
                .setAutoCancel(true)
                .setContentText(String.format("%.3f", (arduinoVoltage)) + "V")
                .setContentIntent(pendingIntent); //Sets the app to open MainActivity on press on notificaton
        NotificationManager notificationManager= (NotificationManager)getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());
    }

    /**
     * The method calculates the SmartCar's battery voltage (@author Erik Laurin)
     * @param analogReadValue analogRead value from Arduino between 0-1024
     * @return returns the SmartCar's battery voltage as a double
     */
    private double getVoltage(double analogReadValue){
        arduinoVoltage = analogReadValue* (5.0 / 1024.0); // Converts the analog reading to voltage
        this.setArduinoVoltage(arduinoVoltage);
        double voltage = arduinoVoltage * 5.0; //Restores the actual voltage (the voltage is divided by 5 since Arduino can handle max 5 V)
        return voltage;
    }

    /**
     * The method takes and decodes the strings received via Bluetooth from the SmartCar.
     * Depending on type of string (its first letter decides its use),
     * various actions executes (@author Erik Laurin and partly Axel Granli)
     * @param inputString String received from the SmartCar containing data
     */
    private void readInput(String inputString){

        try{
        switch (inputString.charAt(0) + inputString.charAt(1)) {
            case 'B' + 'B':
                analogReadValue = Integer.parseInt(inputString.substring(2).trim());
                this.setAnalogReadValue(analogReadValue);
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
                return;

              }

        }catch (Exception e){
            Log.e("eadasd", "asdas");
        }
    }

    /**
     * Method is called when pressing the batteryImageButton.
     * Opens a new View with detailed battery data (@author Erik Laurin)
     * @param view current view is passed to the onClick method
     */
    public void displayBatteryStats(View view) {
        Intent batteryStats = new Intent(getActivity(), BatteryActivity.class);
        Bundle batteryBundle = new Bundle();    //Sends intent extras in bundle
        batteryBundle.putDouble("EXTRA_ANALOG", analogReadValue);
        batteryBundle.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(batteryBundle);
        startActivity(batteryStats);
    }

    public void setAnalogReadValue(double newValue){
        analogReadValue = newValue;
    }

    public void setArduinoVoltage(double newValue){
        arduinoVoltage = newValue;
    }

    public void onResume() {
        super.onResume();

        if (btt == null){

            try {
                btt.resetConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}