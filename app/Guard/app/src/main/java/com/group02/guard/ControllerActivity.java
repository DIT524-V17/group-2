package com.group02.guard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ControllerActivity extends MainActivity {

    Control analogue;
    TextView showMoveEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

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
                } else if (polarAngle > 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            double speed = analogue.getSpeed(-100.0);
                            Log.e("", "" + speed);
                            showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);
                        }
                    });
                }
            }
        });
    }
}



