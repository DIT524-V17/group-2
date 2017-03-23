package com.group02.guard;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by jeberlen on 2017-03-20.
 */

class BatterySingleton extends MainActivity{



    private static final BatterySingleton ourInstance = new BatterySingleton();

    public static synchronized BatterySingleton getInstance() {
        return ourInstance;
    }

    private BatterySingleton() {

    }

    /**
     * @author jeberlen
     * @purpose Makes the image button visible and initializes the view.
     */
    protected void initBattery(Context context){


    }

    protected void showBattery(ImageButton newBattery){

    }



}
