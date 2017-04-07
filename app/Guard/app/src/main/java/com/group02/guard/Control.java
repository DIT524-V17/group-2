package com.group02.guard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author Joacim Eberlen
 * The Control class is a circular controller for an Arduino Smartcar.
 * The class also contains calculations of polar angle(), normal angle (nAngle()),
 * a onMoveListener(), a method for size change (onSizeChanged()), a scaling method(scale()).
 *
 * IMPORTANT: motorSpeed() sets two motor speeds calculated from nAngle() and the
 * speed(Distance from center).
 *
 * @version 1.0.0 JE
 */
public class Control extends View {

    OnMoveListener moveListener;

    float x, y;
    double r, t;
    int cx, cy, w, h;
    static final int RADIUS = 20;
    Paint backGround = new Paint();
    Paint smallDotAndOuterBorder = new Paint();
    Paint smallDotBorder = new Paint();



    private int toDo;

    /**
     * Constructor for the control circle.
     * @param context auto-generated when connected to the xml-layout with the name com...Control
     * @param attrs auto-generated when connected to the xml-layout with the name com...Control
     */
    public Control(Context context, AttributeSet attrs) {
        super(context, attrs);

        backGround.setColor(getResources().getColor(R.color.colorMutedLight));
        smallDotAndOuterBorder.setColor(Color.parseColor("#000000"));
        smallDotBorder.setColor(Color.parseColor("#000000"));

        backGround.setFlags(Paint.ANTI_ALIAS_FLAG);
        smallDotBorder.setFlags(Paint.ANTI_ALIAS_FLAG);
        smallDotAndOuterBorder.setFlags(Paint.ANTI_ALIAS_FLAG);
    }
    /**
     * Handles the changing of sizes for the control.
     * @param w Width
     * @param h Height
     * @param oldH Old height
     * @param oldW Old width
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldW, int oldH) {
        this.w = w;
        this.h = h;
        cx = w / 2;
        cy = h / 2;
        x = cx;
        y = cy;
        super.onSizeChanged(w, h, oldW, oldH);
    }
    /**
     * Draws the controller.
     * @param canvas The canvas on the UI thread.
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawController(canvas);
        switch (toDo) {
            case 1:
                center();
                break;
            default:
                break;
        }

    }

    /**
     * Drawing the circle on the canvas.
     * @param canvas The canvas on the UI thread.
     */

    private void drawController(final Canvas canvas) {
        canvas.drawCircle(cx, cy, w / 2, backGround);
        canvas.drawCircle(cx, cy, (w / 2) - 5, smallDotAndOuterBorder);
        canvas.drawCircle(cx, cy, w / 2 - 10, backGround);
        canvas.drawCircle(x, y, RADIUS + 2, smallDotBorder);
        canvas.drawCircle(x, y, RADIUS, smallDotAndOuterBorder);

    }

    /**
     * Getting the coordinates from the onTouchEvent.
     * @param x X position
     * @param y Y position
     *  n2p : normal to polar coordinates conversion
     * p2n : polar to normal coordinates conversion
     *  R : distance to polar center
     *  T : polar angle
    */
    double n2pR(double x, double y){

        return distance(x, y, cx, cy);
    }

    double n2pT(double x, double y){

        return Math.atan2((y - cy),(x - cx));
    }

    double p2nX(){

        return (r * Math.cos(t) + cx) ;
    }

    double p2nY(){

        return r * Math.sin(t) + cy;
    }
    /**
     *  Getting an angle from 0-360 degrees.
     */
    double nAngle(){

        double angle = Math.toDegrees(t);

        angle += 90;

        if (angle < 0) {
            angle += 360;
        }

        return angle;

    }

    /**
     * Scales all positive integers.
     * @param oldMax Old max double
     * @param oldMin Old min double
     * @param input Input received
     * @param newMax New max double
     * @param newMin New min double
     */
    public double scale(double oldMax, double oldMin, double newMax, double newMin, double input){
        double scaled = ((newMax - newMin) / (oldMax - oldMin) * (input - oldMax) + newMax);
        return scaled;
    }

    /**
     * Speed rescaled to fit into 0 - 100 for the car speed.
     * @param newMax The maximum speed for the car
     * @return Total speed
     */
    public double getSpeed(double newMax){
        //ToDo: Make this universal so it is reusable.
        double speed = scale(w/2-RADIUS, 0, newMax, 0, r);
        return speed;
    }

    /**
     * Returns the distance between the center and the touched area.
     * @param x1 Lesser x
     * @param y1 Lesser y
     * @param x2 Greater x
     * @param y2 Greater y
     * @return The distance
     */

    static double distance(double x1 , double y1, double x2, double y2 ){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    /**
     * Dividing the speed and angle into different speeds for each motor.
     * @param speed The distance from center to the MotionEvent,
     * @param angle The angle from center.
     */
    public int[] motorSpeed(double speed, double angle){

        int[] motors = new int[2];
        double leftMotor, rightMotor;
            if (angle >= 0 && angle < 90) {
                leftMotor = speed;
                rightMotor = (leftMotor * angle/90) - leftMotor;

                motors[0] = (int)leftMotor;
                motors[1] = Math.abs((int)rightMotor);

                return motors;

            } else if (angle >= 90 && angle < 180) {

                leftMotor = speed;
                rightMotor = (leftMotor * angle/90) - leftMotor;

                motors[0] = (int)leftMotor * -1;
                motors[1] = (int)rightMotor * -1;

                return motors;

            } else if (angle >= 180 && angle < 270) {

                rightMotor = speed;
                leftMotor = rightMotor - (rightMotor * ((angle - 180)/90));

                motors[0] = (int)leftMotor * -1;
                motors[1] = (int)rightMotor * -1;

                return motors;

            } else if (angle >= 270 && angle <= 360) {

                rightMotor = speed;
                leftMotor = rightMotor - (rightMotor * ((angle - 180) /90));

                motors[0] = Math.abs((int)leftMotor);
                motors[1] = (int)rightMotor;

                return motors;
            }
        return motors;
    }

    /**
     * The handling of the touch event on the controller.
     * @param event The touch of a finger.
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN :
                updatePosition(event);
                break;
            case MotionEvent.ACTION_MOVE :
                updatePosition(event);
                break;
            case MotionEvent.ACTION_UP :
                toDo = 1;
                center();
                moveListener.onMoveStopped();
                break;
            default :
                break;
        }
        return true;
    }

    /**
     * Centers the small dot on release of the touch event.
     */
    private void center(){
        if(r > 15){
            r -= 15;
        }else{
            toDo = 0;
            r = 0;
        }

        x = (float) p2nX();
        y = (float) p2nY();
        invalidate();
    }

    /**
     * Updating the position of the small dot that indicated where the event occurs.
     * @param e A motion event.
     */
    void updatePosition(MotionEvent e){
        r= Math.min(w/2-RADIUS, n2pR(e.getX(),e.getY()));
        t = n2pT(e.getX(),e.getY());
        x = (float) p2nX();
        y =(float) p2nY();

        if(moveListener != null) {
            moveListener.onMoveInDirection(t);
        }
        invalidate();
    }
    /**
     * An interface to make choices to different Motion events.
     * @param listener Listens to changes.
     */
    public void setOnMoveListener(OnMoveListener listener){
        moveListener = listener;
    }

    interface OnMoveListener{
        void onMoveInDirection(double polarAngle);
        void onMoveStopped();
    }
}