package com.group02.guard;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.nio.ByteBuffer;

import static com.group02.guard.MainActivity.controlNav;
import static java.security.AccessController.getContext;

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



