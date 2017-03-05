package com.group02.guard;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.UUID;

public class ControllerActivity extends AppCompatActivity {

    Control analogue;
    TextView showMoveEvent;

    String TAG = "ContAct";

    private static final UUID MY_UUID_INSECURE =
            UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

    BluetoothConnectionService mBluetoothConnection;
    BluetoothDevice mBTDevice;

    public void startBTConnection(BluetoothDevice device, UUID uuid) {
        Log.d(TAG, "startBTConnection: Initializing RFCOM Bluetooth Connection.");

        mBluetoothConnection.startClient(device, uuid);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        if(getIntent().getExtras() == null){
            Log.e(TAG, "EAEAEAEAEAEAEAEA");
        }else {
            mBTDevice = getIntent().getExtras().getParcelable("mBTDevice");
            mBluetoothConnection = new BluetoothConnectionService(ControllerActivity.this);
        }
        showMoveEvent = (TextView) findViewById(R.id.coords);
        analogue = (Control) findViewById(R.id.controlView);

        analogue.setOnMoveListener(new Control.OnMoveListener()
        {
            public void onMoveInDirection(final double polarAngle) {
                if (polarAngle <= 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            double speed = analogue.getSpeed(100.0);
                            Log.e("", "" + speed);
                            showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);
                        }
                    });

                    mBluetoothConnection.write(toByteArray(polarAngle));


                } else if (polarAngle > 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            double speed = analogue.getSpeed(-100.0);
                            Log.e("", "" + speed);
                            showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);
                        }
                    });

                    mBluetoothConnection.write(toByteArray(polarAngle));

                }
            }
        });
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



