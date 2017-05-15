package com.group02.guard;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * An fragment that includes the elements for home screen.
 * @author Boyan Dai
 * @version 1.0.0 BD
 */

public class MainFragment extends Fragment implements View.OnClickListener {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        // Toast.makeText(getActivity(), (String) R.id.controlButton, Toast.LENGTH_SHORT).show();
        Button control = (Button) getView().findViewById(R.id.controlButton);
        Button map = (Button) getView().findViewById(R.id.mapsButton);
        Button gps = (Button) getView().findViewById(R.id.gpsButton);

        control.setOnClickListener(this);
        map.setOnClickListener(this);
        gps.setOnClickListener(this);
    }

//    private void logout() {
//        session.setLoggedin(false);
//        finish();
//        startActivity(new Intent(this, LoginActivity.class));
//    }

    /**
     * Starts new activities and saves booleans when buttons in the MainScreen are clicked.
     * The booleans are retrieved in other activities and are used to set the state of ToggleButton
     *
     * @param v The current View
     */
    @Override
    public void onClick(View v) {
        Intent wifi = new Intent(getActivity(), WifiActivity.class);
        wifi.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        wifi.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent controlIntent = new Intent(getActivity(), ControllerFragment.class);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        controlIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        Intent gpsIntent = new Intent(getActivity(), GpsActivity.class);
//        gpsIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        gpsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        switch (v.getId()) {
            case R.id.controlButton:
                ControllerFragment controllerFragment = new ControllerFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content, controllerFragment).commit();
                return;
            case R.id.mapsButton:
                startActivity(mapIntent);
                return;
//            case R.id.gpsButton:
//                startActivity(gpsIntent);
//                return;
            default:
                return;
        }
    }

}

