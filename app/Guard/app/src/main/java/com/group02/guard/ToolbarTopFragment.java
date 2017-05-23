package com.group02.guard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Creates a top toolbar with app title, option menu button and battery button
 * @author Justinas Stirbys
 * @version 1.0.0
 */

public class ToolbarTopFragment extends Fragment {

    Toolbar toolbar;
    ImageButton batteryButton;
    TextView appTitle;

    private double analogReadValue;
    private double arduinoVoltage;

    /**
     * Inflates the top toolbar layout within fragments making it visible
     * @param inflater Layout inflater used to make the UI of this fragment visible
     * @param parent The view that this fragment belongs to
     * @param savedInstanceState Bundle used to parse data
     * @return view An inflated layout representing the bottom toolbar
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.toolbar_top, parent, false);
        this.toolbar = (Toolbar) view.findViewById(R.id.top_toolbar);
        this.batteryButton = (ImageButton) view.findViewById(R.id.batteryButton);
        this.appTitle = (TextView) view.findViewById(R.id.toolbarTitle);
        appTitle.setText("G.U.A.R.D");

        batteryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                displayBatteryStats(v);
            }
        });

        return view;
    }

    /**
     * Method is called when pressing the batteryImageButton.
     * Opens a new View with detailed battery data (@author Erik Laurin)
     * @param view current view is passed to the onClick method
     */
    public void displayBatteryStats(View view) {
        Intent batteryStats = new Intent(getActivity(), BatteryActivity.class);
        Bundle batteryBundle = new Bundle();    //Sends intent extras in bundle
        batteryBundle.putDouble("EXTRA_ANALOG", analogReadValue);
        batteryBundle.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(batteryBundle);
        startActivity(batteryStats);
        getActivity().finish();
    }

    public ImageButton getBatteryButton(){
        return batteryButton;
    }

    public void setAnalogReadValue(double newValue){
        analogReadValue = newValue;
    }

    public void setArduinoVoltage(double newValue){
        arduinoVoltage = newValue;
    }
}
