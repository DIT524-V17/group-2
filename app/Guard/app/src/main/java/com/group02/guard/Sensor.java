package com.group02.guard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by jeberlen on 2017-04-12.
 */

public class Sensor extends View {


    private int distance;

    Paint mGreen = new Paint();
    Paint mYellow = new Paint();
    Paint mRed = new Paint();
    Paint mTransparent = new Paint();

    public Sensor(Context context, AttributeSet attrs) {
        super(context, attrs);

        mTransparent.setColor(Color.TRANSPARENT);
        mGreen.setColor(Color.GREEN);
        mYellow.setColor(Color.YELLOW);
        mRed.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSensor(canvas);

    }

    private void drawSensor(final Canvas canvas) {

        int yPos = getHeight()/3;

        canvas.drawRect(0, 0, canvas.getWidth(), yPos, mTransparent);
        canvas.drawRect(0, yPos, canvas.getWidth(), yPos*2, mTransparent);
        canvas.drawRect(0, (yPos*2), canvas.getWidth(), (yPos*3), mTransparent);

        if (this.distance <= 10 && this.distance != 0){
            canvas.drawRect(0, (yPos*2), canvas.getWidth(), (yPos*3), mRed);
        } else if (this.distance > 10 && this.distance < 30){
            canvas.drawRect(0, yPos, canvas.getWidth(), yPos*2, mYellow);
        } else if (this.distance >= 30 && this.distance <= 70){
            canvas.drawRect(0, 0, canvas.getWidth(), yPos, mGreen);
        } else {
            canvas.drawRect(0, 0, canvas.getWidth(), yPos, mTransparent);
            canvas.drawRect(0, yPos, canvas.getWidth(), yPos*2, mTransparent);
            canvas.drawRect(0, (yPos*2), canvas.getWidth(), (yPos*3), mTransparent);
        }

    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
