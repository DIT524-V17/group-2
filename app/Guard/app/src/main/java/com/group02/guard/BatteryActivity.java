package com.group02.guard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * The class creates an activity that displays detailed battery data
 *
 * @author Erik Laurin
 * @version 1.0.1
 */

public class BatteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        TextView analogValue;
        TextView arduinoVoltage;
        TextView actualVoltage;

        Bundle batteryBundle = getIntent().getExtras();

        analogValue = (TextView) findViewById(R.id.analogValue);
        arduinoVoltage = (TextView) findViewById(R.id.arduinoVoltage);
        actualVoltage = (TextView) findViewById(R.id.actualVoltage);

        if (batteryBundle.getDouble("EXTRA_ANALOG")==0.000){
            analogValue.setText("Battery details not yet available");
            arduinoVoltage.setVisibility(View.GONE);
            actualVoltage.setVisibility(View.GONE);
        }else{
            analogValue.setText("Arduino analog read value: " + (batteryBundle.getDouble("EXTRA_ANALOG")));
            arduinoVoltage.setText("Arduino voltage input: " + String.format("%.3f",
                    (batteryBundle.getDouble("EXTRA_ARDUINO_VOLTAGE"))) + "V");
            actualVoltage.setText("Estimated battery pack voltage: " + String.format("%.3f",
                    (batteryBundle.getDouble("EXTRA_ARDUINO_VOLTAGE"))*5.0) + "V");
        }
    }
}
