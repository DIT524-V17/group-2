package com.group02.guard;

import com.group02.guard.ControllerActivityTest;
import com.group02.guard.MainActivityTest;
import com.group02.guard.NonMatchingPasswordRegisterTest;
import com.group02.guard.NonValidEmailRegisterTest;
import com.group02.guard.ShortPasswordRegisterTest;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jeberlen on 2017-03-27.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({NonMatchingPasswordRegisterTest.class,
                        NonValidEmailRegisterTest.class, ShortPasswordRegisterTest.class, ControllerActivityTest.class, MainActivityTest.class})
public class InstrumentedSuite {
    @BeforeClass
    public static void setUp(){

    }
}
