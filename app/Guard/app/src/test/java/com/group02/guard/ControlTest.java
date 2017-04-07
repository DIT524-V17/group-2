package com.group02.guard;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by jeberlen on 2017-03-23.
 */
@RunWith(MockitoJUnitRunner.class)
public class ControlTest {

    @Mock
    Context context;
    @Mock
    AttributeSet attr;
    @Mock
    Control control;
    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        control = mock(Control.class);
    }

    @Test
    public void getScale_negativeInt(){

        int newMax = 70;
        int oldMax = 200;
        int newMin = 0;
        int oldMin = 0;
        int input = 90;

        verify(control).scale(oldMax, oldMin, newMax, newMin, input);

        //assertEquals(70, control.getSpeed(newMinTest));
    }
    @Test
    public void scaleTest_divisionByZero(){

        try{

            fail();
        }catch (ArithmeticException e){
            //do nothing
            e.getStackTrace();
        }

    }

}
