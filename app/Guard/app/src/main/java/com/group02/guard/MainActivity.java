package com.group02.guard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;


public class MainActivity extends Activity {
    Button connect;
    Button control;
    Button camera;
    Button map;

    Toolbar appBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect = (Button) findViewById(R.id.connectButton);

        control = (Button) findViewById(R.id.controlButton);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ControllerActivity.class);
                startActivity(i);
            }
        });

        camera = (Button) findViewById(R.id.cameraButton);

        map = (Button) findViewById(R.id.mapButton);

    }
}
