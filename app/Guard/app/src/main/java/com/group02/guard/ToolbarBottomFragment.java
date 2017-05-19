package com.group02.guard;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Creates a bottom toolbar used for navigating withing different activities
 * @author Justinas Stirbys
 * @version 1.0.0
 * @deprecated from Sprint 7
 */

public class ToolbarBottomFragment extends Fragment implements View.OnClickListener {

    ImageButton connectNav;
    ImageButton controlNav;
    ImageButton gpsNav;
    ImageButton mapsNav;
    ImageButton homeNav;

    /**
     * Inflates the bottom toolbar layout within fragments making it visible
     * @param inflater Layout inflater used to make the UI of this fragment visible
     * @param parent The view that this fragment belongs to
     * @param savedInstanceState Bundle used to parse data
     * @return view An inflated layout representing the bottom toolbar
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.toolbar_bottom, parent, false);

        connectNav = (ImageButton) view.findViewById(R.id.connectNavigation);
        controlNav = (ImageButton) view.findViewById(R.id.controlNavigation);
        gpsNav = (ImageButton) view.findViewById(R.id.gpsNavigation);
        mapsNav = (ImageButton) view.findViewById(R.id.mapsNavigation);
        homeNav = (ImageButton) view.findViewById(R.id.homeNavigation);

        connectNav.setOnClickListener(this);
        controlNav.setOnClickListener(this);
        gpsNav.setOnClickListener(this);
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
        Intent wifiIntent = new Intent(getActivity(), WifiActivity.class);
       // Intent controlIntent = new Intent(getActivity(), ControllerFragment.class);
        Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
       // Intent homeIntent = new Intent(getActivity(), MainFragment.class);
        //Intent gpsIntent= new Intent(getActivity(), GpsActivity.class);


        switch (v.getId()) {
            case R.id.homeNavigation:
                MainFragment mainFragment = new MainFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().attach(mainFragment).commit();
                return;
            case R.id.connectNavigation:
                startActivity(wifiIntent);
                return;
//            case R.id.gpsNavigation:
//                startActivity(gpsIntent);
//                return;
            case R.id.controlNavigation:
                ControllerFragment controllerFragment = new ControllerFragment();
                FragmentManager fragmentManagerC = getActivity().getSupportFragmentManager();
                fragmentManagerC.beginTransaction().replace(this.getView().getId(), controllerFragment).commit();
                return;
            case R.id.mapsNavigation:
                startActivity(mapIntent);
                return;
            default:
                return;
        }
    }
    public void buttonChecked(String buttonName){
        if(buttonName.equals("gps"))  {
            gpsNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("connect")) {
            connectNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("control"))  {
            controlNav.setColorFilter(Color.WHITE);
        }else if(buttonName.equals("maps")){
            mapsNav.setColorFilter(Color.WHITE);
        }else{
            homeNav.setColorFilter(Color.WHITE);
        }
    }
}

