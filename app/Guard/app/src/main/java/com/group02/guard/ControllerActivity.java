package com.group02.guard;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ToggleButton;
import java.nio.ByteBuffer;

import static com.group02.guard.MainActivity.controlNav;

public class ControllerActivity extends AppCompatActivity {

    Control analogue;
    TextView showMoveEvent;

    ImageButton batteryButton;

    String address = "20:15:10:20:11:37";

    // The thread that does all the work
    BluetoothThread btt;

    // Handler for writing messages to the Bluetooth connection
    Handler writeHandler;



    public static byte[] toByteArray(double value) {
        byte[] bytes = new byte[8];
        ByteBuffer.wrap(bytes).putDouble(value);
        return bytes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        showMoveEvent = (TextView) findViewById(R.id.coords);
        analogue = (Control) findViewById(R.id.controlView);

        controlNav = (ToggleButton) findViewById(R.id.controlNavigation);
        controlNav.setChecked(true);

        /*
        * @author Joacim Eberlen
        * @purpose Initialize the battery button.
        * ToDo: Needs to be put into some where were it can be accessed.
        */
        batteryButton = (ImageButton) findViewById(R.id.batteryButton);
        final BatterySingleton battery = BatterySingleton.getInstance();
        final Context context = this;
        battery.initBattery(context);
        battery.showBattery(batteryButton);
        batteryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                battery.displayBatteryStats();
            }
        });

        // Initialize the Bluetooth thread, passing in a MAC address
        // and a Handler that will receive incoming messages
        btt = new BluetoothThread(address, new Handler() {

            @Override
            public void handleMessage(Message message) {

            String s = (String) message.obj;
            battery.readInput(s);

            }
        });

        // Get the handler that is used to send messages
        writeHandler = btt.getWriteHandler();

        // Run the thread
        btt.start();

        analogue.setOnMoveListener(new Control.OnMoveListener() {
            public void onMoveInDirection(final double polarAngle) {
                double speed = analogue.getSpeed(100);
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
    }

    public void write(int left, int right){
            Message l = Message.obtain();
            l.obj = "L" + left;
            writeHandler.sendMessage(l);

            Message r = Message.obtain();
            r.obj = "R" + right;
            writeHandler.sendMessage(r);


    }


}