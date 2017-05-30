package com.group02.guard;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Creates a bottom toolbar used for navigating withing different activities
 * @author Justinas Stirbys
 * @version 1.0.1
 */

public class ToolbarBottomFragment extends Fragment implements View.OnClickListener {

    ImageButton controlNav;
    ImageButton mapsNav;
    ImageButton homeNav;
    ImageButton profileNav;
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

        //Setting values for controller
        wifiCon = true;
        btCon = true;
        address = "20:15:10:20:11:37";

        controlNav = (ImageButton) view.findViewById(R.id.controlNavigation);
        mapsNav = (ImageButton) view.findViewById(R.id.mapsNavigation);
        homeNav = (ImageButton) view.findViewById(R.id.homeNavigation);
        profileNav = (ImageButton) view.findViewById(R.id.profileNavigation);

        controlNav.setOnClickListener(this);
        mapsNav.setOnClickListener(this);
        homeNav.setOnClickListener(this);
        profileNav.setOnClickListener(this);
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
        Intent profileIntent = new Intent(getActivity(), ProfileActivity.class);

        switch (v.getId()) {
            case R.id.homeNavigation:
                startActivity(homeIntent);
                getActivity().finish();
                return;
            case R.id.profileNavigation:
                startActivity(profileIntent);
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

    /**
     * Repaints the button in the toolbar to better illustrate selected activity
     * @param buttonName, string of current activity
     */
    public void buttonChecked(String buttonName){
        if(buttonName.equals("control"))  {
            controlNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("maps")){
            mapsNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("profile")){
            profileNav.setColorFilter(Color.WHITE);
        }else{
            homeNav.setColorFilter(Color.WHITE);
        }
    }
}

