package com.group02.dit524.guard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ControllerActivity extends AppCompatActivity {

    Control analogue;
    TextView showMoveEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        showMoveEvent = (TextView) findViewById(R.id.showCoords);
        analogue = (Control) findViewById(R.id.controlView1);
        analogue.setOnMoveListener(new Control.OnMoveListener() {

            @Override
            public void onMoveInDirection(double polarAngle) {
                if(polarAngle <= 0){
                    double speed = analogue.getSpeed(100.0);
                    showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);
                } else if(polarAngle > 0){
                    double speed = analogue.getSpeed(-100.0);
                    showMoveEvent.setText("Max move in " + polarAngle + " direction. " + "\nSpeed: " + speed);
                }
            }

        });
    }
}
