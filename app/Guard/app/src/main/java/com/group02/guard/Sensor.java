package com.group02.guard;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by jeberlen on 2017-04-12.
 */

public class Sensor extends View {

    private int distance;
    private Map<Integer, String> colorMap;
    Paint mFilled = new Paint();
    Paint mTransparent = new Paint();

    public Sensor(Context context, AttributeSet attrs) {
        super(context, attrs);

        createColorMap();

        mTransparent.setColor(Color.TRANSPARENT);
        mFilled.setColor(Color.TRANSPARENT);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSensor(canvas);
        postInvalidate();
    }

    private void drawSensor(final Canvas canvas) {

        int yPos = getHeight()/3;

        if (this.distance <= 10 && this.distance != 0){
            canvas.drawRect(0, (yPos*2), canvas.getWidth(), (yPos*3), mFilled);
        } else if (this.distance > 10 && this.distance < 20){
            canvas.drawRect(0, yPos, canvas.getWidth(), yPos*2, mFilled);
        } else if (this.distance >= 20 && this.distance <= 32){
            canvas.drawRect(0, 0, canvas.getWidth(), yPos, mFilled);
        } else {
            canvas.drawRect(0, 0, canvas.getWidth(), yPos, mTransparent);
            canvas.drawRect(0, yPos, canvas.getWidth(), yPos*2, mTransparent);
            canvas.drawRect(0, (yPos*2), canvas.getWidth(), (yPos*3), mTransparent);
        }
        postInvalidate();

    }

    public void setDistance(int distance) {
        this.distance = distance;
        if (distance <= 31){
            mFilled.setColor(Color.parseColor(colorMap.get(distance)));
        }
        postInvalidate();
    }

    public void createColorMap(){
        colorMap = new HashMap<>();
        colorMap.put(31, "#00CC00");
        colorMap.put(30, "#0DCC00");
        colorMap.put(29, "#A1CC00");
        colorMap.put(28, "#27CC00");
        colorMap.put(27, "#34CC00");
        colorMap.put(26, "#41CC00");
        colorMap.put(25, "#4ECC00");
        colorMap.put(24, "#5CCC00");
        colorMap.put(23, "#69CC00");
        colorMap.put(22, "#76CC00");
        colorMap.put(21, "#83CC00");
        colorMap.put(20, "#90CC00");
        colorMap.put(19, "#9DCC00");
        colorMap.put(18, "#ABCC00");
        colorMap.put(17, "#B8CC00");
        colorMap.put(16, "#C5CC00");
        colorMap.put(15, "#CCC500");
        colorMap.put(14, "#CCB800");
        colorMap.put(13, "#CCAB00");
        colorMap.put(12, "#CC9D00");
        colorMap.put(11, "#CC9000");
        colorMap.put(10, "#CC8300");
        colorMap.put(9, "#CC7600");
        colorMap.put(8, "#CC6900");
        colorMap.put(7, "#CC5C00");
        colorMap.put(6, "#CC4E00");
        colorMap.put(5, "#CC4100");
        colorMap.put(4, "#CC3400");
        colorMap.put(3, "#CC2700");
        colorMap.put(2, "#CC1A00");
        colorMap.put(1, "#CC0D00");
        colorMap.put(0, "#CC0000");
    }


}
