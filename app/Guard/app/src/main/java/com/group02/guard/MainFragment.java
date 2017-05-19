package com.group02.guard;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Modified from Main Activity
 * @author Boyan Dai
 * @version 1.0.0 BD
 */

public class MainFragment extends Fragment implements View.OnClickListener {

    private Session session;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button control = (Button) getView().findViewById(R.id.controlButton);
        Button map = (Button) getView().findViewById(R.id.mapsButton);
        Button gps = (Button) getView().findViewById(R.id.gpsButton);
        Button logout = (Button) getView().findViewById(R.id.logoutDebug);
        control.setOnClickListener(this);
        map.setOnClickListener(this);
        gps.setOnClickListener(this);

        session = new Session(getActivity());
        if (!session.loggedin()) {
            logout();
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }
    private void logout() {
        session.setLoggedin(false);
        getActivity().finish();
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }

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
        Intent mapIntent = new Intent(getActivity(), MapsActivity.class);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


        switch (v.getId()) {
            case R.id.controlButton:
                FragmentManager fragmentManager;
                ControllerFragment controllerFragment;
                fragmentManager = getActivity().getSupportFragmentManager();
                controllerFragment = new ControllerFragment();
               fragmentManager.beginTransaction().replace(R.id.content, controllerFragment).commit();

                return;
            case R.id.mapsButton:
                startActivity(mapIntent);
                return;
            default:
                return;
        }
    }

}

