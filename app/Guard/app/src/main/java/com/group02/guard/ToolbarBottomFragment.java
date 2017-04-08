package com.group02.guard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Creates a bottom toolbar used for navigating withing different activities
 * @author Justinas Stirbys
 * @version 1.0.0
 */

public class ToolbarBottomFragment extends Fragment implements View.OnClickListener {

    ImageButton connectNav;
    ImageButton controlNav;
    ImageButton cameraNav;
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
        cameraNav = (ImageButton) view.findViewById(R.id.cameraNavigation);
        mapsNav = (ImageButton) view.findViewById(R.id.mapsNavigation);
        homeNav = (ImageButton) view.findViewById(R.id.homeNavigation);

        connectNav.setOnClickListener(this);
        controlNav.setOnClickListener(this);
        cameraNav.setOnClickListener(this);
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
        Intent controlIntent = new Intent(getActivity(), ControllerActivity.class);
        Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
        Intent homeIntent = new Intent(getActivity(), MainActivity.class);

        switch (v.getId()) {
            case R.id.homeNavigation:
                homeNav.setImageResource(R.drawable.activity_icon_home_selected);
                startActivity(homeIntent);
                return;
            case R.id.connectNavigation:
                connectNav.setImageResource(R.drawable.activity_icon_connection_selected);
                startActivity(wifiIntent);
                return;
            case R.id.cameraNavigation:
                Toast.makeText(getActivity(), "Check back in future sprints",
                        Toast.LENGTH_SHORT).show();
                return;
            case R.id.controlNavigation:
                controlNav.setImageResource(R.drawable.activity_icon_controller_selected);
                startActivity(controlIntent);
                return;
            case R.id.mapsNavigation:
                mapsNav.setImageResource(R.drawable.activity_icon_map_selected);
                startActivity(mapIntent);
                return;
            default:
                return;
        }
    }
}

