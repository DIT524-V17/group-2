package com.group02.guard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * Activity for navigation drawer
 * @author Boyan Dai
 * @version 1.0.0 BD
 */
public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private Session session;
    private FragmentManager fragmentManager;
    private Fragment fragment;
    private FragmentTransaction fragmentTransaction;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_navigation2);
        fragment = new MainFragment();
        fragmentManager = getSupportFragmentManager();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.charged_battery);

        if(savedInstanceState == null) {
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment).commit();
            //Getting data from Login Activity
            bundle = getIntent().getExtras();
            int userId = bundle.getInt("ID");
            String email = bundle.getString("EMAIL");
            String password = bundle.getString("PASSWORD");
//        }
            Log.e("Check", "id: " + userId + " email " + email + " password " + password);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);//changed from setDrawerListener
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_main) {
            Toast.makeText(this, "Main", Toast.LENGTH_SHORT).show();
            MainFragment mainFragment = new MainFragment();
            fragmentManager.beginTransaction().replace(R.id.content,
                    mainFragment).addToBackStack("tag").commit();
        } else if (id == R.id.nav_controller) {
            Toast.makeText(this, "Controller", Toast.LENGTH_SHORT).show();
            ControllerFragment controlFragment = new ControllerFragment();
            fragmentManager.beginTransaction().replace(R.id.content,
                    controlFragment).addToBackStack("tag").commit();
        } else if (id == R.id.nav_maps) {
            Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
            Intent mapIntent = new Intent(this, MapsActivity.class);
            mapIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(mapIntent);
        }else if(id == R.id.nav_profile){
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            ProfileFragment profileFragment = new ProfileFragment();
            profileFragment.setArguments(bundle);
            fragmentManager.beginTransaction().replace(R.id.content,
                    profileFragment).addToBackStack("tag").commit();
        }else if(id == R.id.nav_logout){
            session = new Session(this);
            if (!session.loggedin()) {
                logout();
            }
            logout();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void logout() {
        session.setLoggedin(false);
        this.finish();
        startActivity(new Intent(this, LoginActivity.class));
    }
}
