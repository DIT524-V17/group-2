package com.group02.guard;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BatteryActivity extends MainActivity {

    private TextView analogValue;
    private TextView arduinoVoltage;
    private TextView actualVoltage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        Bundle b = getIntent().getExtras();
        analogValue = (TextView) findViewById(R.id.analogValue);
        arduinoVoltage = (TextView) findViewById(R.id.arduinoVoltage);
        actualVoltage = (TextView) findViewById(R.id.actualVoltage);

        try {   //Sets the TextViews based on the bundle that accompanies the intent
            analogValue.setText("Arduino analog read value: " + (b.getDouble("EXTRA_ANALOG")));
            arduinoVoltage.setText("Arduino voltage input: " + String.format("%.3f", (b.getDouble("EXTRA_ARDUINO_VOLTAGE"))) + "V");
            actualVoltage.setText("Estimated battery pack voltage: " + String.format("%.3f", (b.getDouble("EXTRA_ARDUINO_VOLTAGE")) * 5.0) + "V");
        } catch (NullPointerException e) {
            Log.e("BatteryActivity", "onCreate: ", e);
        }
    }
}
