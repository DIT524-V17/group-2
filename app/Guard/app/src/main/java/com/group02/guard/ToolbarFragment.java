package com.group02.guard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * @author Justinas Stirbys
 * @version 1.0.0
 */


public class ToolbarFragment extends AppCompatActivity {

    Toolbar toolbar;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_top);
        toolbar = (Toolbar) findViewById(R.id.top_toolbar);
        menuButton = (ImageButton) findViewById(R.id.menuButton);
        setSupportActionBar(toolbar);
    }
    /**
     * Creates a popup option menu
     * @param v Current View
     */
    public void showOptionMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_options, popup.getMenu());
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
            case R.id.menu_profile:
                Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_security:
                Toast.makeText(this, "Security Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_settings:
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_themes:
                Toast.makeText(this, "App Themes Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            case R.id.menu_feedback:
                Toast.makeText(this, "Help & Feedback Selected", Toast.LENGTH_SHORT)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
