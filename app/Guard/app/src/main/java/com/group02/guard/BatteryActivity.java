package com.group02.guard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class BatteryActivity extends AppCompatActivity {

    TextView analogValue;
    TextView arduinoVoltage;
    TextView actualVoltage;
    TextView singleBatterAverageVoltage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        Intent intent = getIntent();

        Bundle b = getIntent().getExtras();
        analogValue = (TextView) findViewById(R.id.analogValue);
        arduinoVoltage = (TextView) findViewById(R.id.arduinoVoltage);
        actualVoltage = (TextView) findViewById(R.id.actualVoltage);
        singleBatterAverageVoltage = (TextView) findViewById(R.id.singleBatterAverageVoltage);

        analogValue.setText("Arduino analog read value: " + (b.getDouble("EXTRA_ANALOG")));
        arduinoVoltage.setText("Arduino voltage input: " + String.format("%.3f", (b.getDouble("EXTRA_ARDUINO_VOLTAGE"))) + "V");
        actualVoltage.setText("Actual battery voltage: " + String.format("%.3f",(b.getDouble("EXTRA_ARDUINO_VOLTAGE"))*5.0) + "V");
        singleBatterAverageVoltage.setText("Single average battery voltage: " + String.format("%.3f",((b.getDouble("EXTRA_ARDUINO_VOLTAGE")*5.0))/8));
    }
}
