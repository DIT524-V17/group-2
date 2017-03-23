package com.group02.guard;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.group02.guard.Coordinates.parserino;

public class MapsActivity extends MainActivity implements OnMapReadyCallback {
    private static final int ERROR_DIALOG_REQUEST = 9001;
    private static final double
//            SEATLE_LAT = 47.60621,
//            SEATLE_LON = 122.33207,
//            SYDNEY_LAT = -33.867487,
//            SYDNEY_LON = 151.20699,
            NEWYORK_LAT = 40.714353,
            NEWYORK_LON = -74.005973;
    private GoogleMap mMap;
//    private String latitude = "0.0";
//    private String longitude = "0.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (servicesOK()) {
            setContentView(R.layout.activity_maps);
            initMap();
            if (initMap()) {
                Toast.makeText(this, "Ready to map!", Toast.LENGTH_SHORT).show();
                //gotoLocation(NEWYORK_LAT, NEWYORK_LON);
            } else {
                Toast.makeText(this, "Map Not Connected!", Toast.LENGTH_SHORT).show();
            }
        } else {
            setContentView(R.layout.activity_main);
        }
    }

    public void send(View view) {
        EditText latitude = (EditText) findViewById(R.id.latitude);
        EditText longitude = (EditText) findViewById(R.id.longitude);
//        EditText currentLat = (EditText)findViewById(R.id.curLat);
//        EditText currentLong = (EditText)findViewById(R.id.curLong);
        String lat = String.valueOf(parserino(latitude.getText().toString()));
        String lng = String.valueOf(parserino(longitude.getText().toString()));

        double newLat = Double.parseDouble(lat);
        double newLong = Double.parseDouble(lng);
        gotoLocation(newLat, newLong, 5);
//        Toast.makeText(getApplicationContext(), "The latitude is " + lat, Toast.LENGTH_LONG ).show();
//        Toast.makeText(getApplicationContext(), "The longitude is " + longi, Toast.LENGTH_LONG ).show();
//        Log.i("The latitude is ", String.valueOf(parserino(coords)));
//        Log.i("The longitude is ", String.valueOf(parserino(coords2)));
    }

    public boolean servicesOK() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);

        if (resultCode == ConnectionResult.SUCCESS) {
            return true; //the user can make a mapping request
        } else if (apiAvailability.isUserResolvableError(resultCode)) {
            apiAvailability.getErrorDialog(this, resultCode, ERROR_DIALOG_REQUEST)
                    .show();
        } else {
            Toast.makeText(this, "Could not connect to mapping service", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    private boolean initMap() {
        if (mMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    mMap = googleMap;
                    gotoLocation(NEWYORK_LAT, NEWYORK_LON, 5);
                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    mMap.setMyLocationEnabled(true);
                    mMap.getUiSettings().setZoomControlsEnabled(true);
                    mMap.getUiSettings().setAllGesturesEnabled(true);
                    mMap.getUiSettings().setMyLocationButtonEnabled(true);
                    mMap.getUiSettings().setCompassEnabled(true);
                }
            });
        }
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

    private void gotoLocation(double lat, double lng, float zoom) {
        LatLng latlng = new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(latlng, zoom);
        mMap.addMarker(new MarkerOptions().position(latlng).title("Location"));
        mMap.animateCamera(update);
    }
}