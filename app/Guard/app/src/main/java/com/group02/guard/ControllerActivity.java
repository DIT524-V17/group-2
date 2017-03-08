package com.group02.guard;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.nio.ByteBuffer;

import static com.group02.guard.MainActivity.controlNav;

public class ControllerActivity extends AppCompatActivity {

    Control analogue;
    TextView showMoveEvent;
    TextView connectionStatus;

    String TAG = "Controller Activity";

    String address = "20:15:10:20:11:37";

    // The thread that does all the work
    BluetoothThread btt;

    // Handler for writing messages to the Bluetooth connection
    Handler writeHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        showMoveEvent = (TextView) findViewById(R.id.coords);
        analogue = (Control) findViewById(R.id.controlView);

        controlNav = (ToggleButton) findViewById(R.id.controlNavigation);
        controlNav.setChecked(true);

        // Initialize the Bluetooth thread, passing in a MAC address
        // and a Handler that will receive incoming messages
        btt = new BluetoothThread(address, new Handler() {

            @Override
            public void handleMessage(Message message) {

                String s = (String) message.obj;

            }
        });

        // Get the handler that is used to send messages
        writeHandler = btt.getWriteHandler();

        // Run the thread
        btt.start();

        analogue.setOnMoveListener(new Control.OnMoveListener()
        {
            public void onMoveInDirection(final double polarAngle) {

                if (polarAngle <= 0) {
                    double speed = analogue.getSpeed(100.0);
                    Log.e("", "" + speed);
                    showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);

                    write(polarAngle, speed);

                } else if (polarAngle > 0) {

                    double speed = analogue.getSpeed(-100.0);
                    Log.e("", "" + speed);
                    showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);


                    write(polarAngle, speed);
                }

            }
        });


    }

    public void write(double polarAngle, double speed){
        Message msg = Message.obtain();
        msg.obj = "A" + polarAngle;
        writeHandler.sendMessage(msg);

        Message msgSpeed = Message.obtain();
        msgSpeed.obj = "S" + speed;
        writeHandler.sendMessage(msgSpeed);
    }

    public static byte[] toByteArray(double value) {
        byte[] bytes = new byte[8];
        ByteBuffer.wrap(bytes).putDouble(value);
        return bytes;
    }

    public static double toDouble(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getDouble();
    }
}



