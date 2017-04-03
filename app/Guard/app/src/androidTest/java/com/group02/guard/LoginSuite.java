package com.group02.guard;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jeberlen on 2017-03-30.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({NonMatchingPasswordRegisterTest.class,
        NonValidEmailRegisterTest.class, ShortPasswordRegisterTest.class})
public class LoginSuite {
    public static void setUp(){

    }
}
