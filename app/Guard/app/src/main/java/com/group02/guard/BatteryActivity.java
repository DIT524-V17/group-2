package com.group02.guard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * The class creates an activity that displays detailed battery data
 *
 * @author Erik Laurin
 * @version 1.0.0
 */

public class BatteryActivity extends AppCompatActivity {
    TextView analogValue;
    TextView arduinoVoltage;
    TextView actualVoltage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        Bundle b = getIntent().getExtras();
        analogValue = (TextView) findViewById(R.id.analogValue);
        arduinoVoltage = (TextView) findViewById(R.id.arduinoVoltage);
        actualVoltage = (TextView) findViewById(R.id.actualVoltage);

        analogValue.setText("Arduino analog read value: " + (b.getDouble("EXTRA_ANALOG")));
        arduinoVoltage.setText("Arduino voltage input: " + String.format("%.3f",
                (b.getDouble("EXTRA_ARDUINO_VOLTAGE"))) + "V");
        actualVoltage.setText("Estimated battery pack voltage: " + String.format("%.3f",
                (b.getDouble("EXTRA_ARDUINO_VOLTAGE"))*5.0) + "V");
    }
}
