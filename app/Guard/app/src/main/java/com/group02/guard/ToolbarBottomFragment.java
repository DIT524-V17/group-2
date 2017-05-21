package com.group02.guard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import static android.content.Context.MODE_PRIVATE;

/**
 * Creates a bottom toolbar used for navigating withing different activities
 * @author Justinas Stirbys
 * @version 1.0.1
 */

public class ToolbarBottomFragment extends Fragment implements View.OnClickListener {

    ImageButton controlNav;
    ImageButton mapsNav;
    ImageButton homeNav;
    private boolean wifiCon;
    private boolean btCon;
    private String address;


    /**
     * Inflates the bottom toolbar layout within fragments making it visible
     * @param inflater Layout inflater used to make the UI of this fragment visible
     * @param parent The view that this fragment belongs to
     * @param savedInstanceState Bundle used to parse data
     * @return view An inflated layout representing the bottom toolbar
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.toolbar_bottom, parent, false);

        SharedPreferences preferences = getActivity().getPreferences(MODE_PRIVATE);
        wifiCon = preferences.getBoolean("wifiCon", false);
        btCon = preferences.getBoolean("btCon", false);
        address = "20:15:10:20:11:37";

        controlNav = (ImageButton) view.findViewById(R.id.controlNavigation);
        mapsNav = (ImageButton) view.findViewById(R.id.mapsNavigation);
        homeNav = (ImageButton) view.findViewById(R.id.homeNavigation);

        controlNav.setOnClickListener(this);
        mapsNav.setOnClickListener(this);
        homeNav.setOnClickListener(this);
        return view;
    }

    /**
     * Starts new activities when a button press occurs
     * @param v View of the button pressed
     */
    @Override
    public void onClick(View v) {
        Intent controlIntent = new Intent(getActivity(), ControllerActivity.class);
        controlIntent.putExtra("address", address);
        controlIntent.putExtra("btCon", btCon);
        controlIntent.putExtra("wifiCon", wifiCon);
        Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
        Intent homeIntent = new Intent(getActivity(), MainActivity.class);

        switch (v.getId()) {
            case R.id.homeNavigation:
                startActivity(homeIntent);
                getActivity().finish();
                return;
            case R.id.controlNavigation:
                startActivity(controlIntent);
                getActivity().finish();
                return;
            case R.id.mapsNavigation:
                startActivity(mapIntent);
                getActivity().finish();
                return;
            default:
                return;
        }
    }
    public void buttonChecked(String buttonName){
        if(buttonName.equals("control"))  {
            controlNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("maps")){
            mapsNav.setColorFilter(Color.WHITE);
        }else{
            homeNav.setColorFilter(Color.WHITE);
        }
    }
}

