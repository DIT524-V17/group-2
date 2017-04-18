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
    ImageButton menuButton;
    ImageButton batteryButton;
    TextView appTitle;

    private Intent batteryStats;
    private Bundle batteryBundle;
//    private ImageButton batteryImageButton;
    private double analogReadValue;
    private double arduinoVoltage;
//    private boolean criticalLevel = false;

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
        this.menuButton = (ImageButton) view.findViewById(R.id.menuButton);
        this.batteryButton = (ImageButton) view.findViewById(R.id.batteryButton);
        this.appTitle = (TextView) view.findViewById(R.id.toolbarTitle);
        appTitle.setText("G.U.A.R.D");

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOptionMenu(v);
            }
        });

        batteryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                displayBatteryStats(v);
            }
        });
        return view;
    }

    /**
     * Creates a popup option menu
     * @param v Current View
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(getActivity(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_option, popup.getMenu());
        popup.show();
    }

    /**
     * Identifies selected option from the option menu by comparing their ids
     * @param item The clicked option in the pop up menu
     * @return true For the selected option
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_profile:
                Toast.makeText(getActivity(), "Check back in future sprints", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.nav_settings:
                Toast.makeText(getActivity(), "Check back in future sprints", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.nav_help:
                Toast.makeText(getActivity(), "Check back in future sprints", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.nav_feedback:
                Toast.makeText(getActivity(), "Check back in future sprints", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.nav_logout:
                Toast.makeText(getActivity(), "Check back in future sprints", Toast.LENGTH_SHORT)
                        .show();
                return true;
            default:
                return false;
        }
    }

    /**
     * Method is called when pressing the batteryImageButton.
     * Opens a new View with detailed battery data (@author Erik Laurin)
     * @param view current view is passed to the onClick method
     */
    public void displayBatteryStats(View view) {
        batteryStats = new Intent(getActivity(), BatteryActivity.class);
        batteryBundle = new Bundle();    //Sends intent extras in bundle
        batteryBundle.putDouble("EXTRA_ANALOG", analogReadValue);
        batteryBundle.putDouble("EXTRA_ARDUINO_VOLTAGE", arduinoVoltage);
        batteryStats.putExtras(batteryBundle);
        startActivity(batteryStats);
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
