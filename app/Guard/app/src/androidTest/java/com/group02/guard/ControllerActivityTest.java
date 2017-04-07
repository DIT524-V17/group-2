package com.group02.guard;


import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.Matchers.allOf;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class ControllerActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class, true, true);

    // This test will fail if there is no need to login. If there is it will pass.
    @Test
    public void a_logInIfNeeded(){
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnReg), withText("Register"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText2.perform(replaceText("guseberjo@student.gu.se"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.etPass), isDisplayed()));
        appCompatEditText3.perform(replaceText("fisk1234"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.etPass2), isDisplayed()));
        appCompatEditText4.perform(replaceText("fisk1234"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.etPass2), withText("fisk1234"), isDisplayed()));
        appCompatEditText5.perform(pressImeActionButton());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btnReg), withText("Register"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText6.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText7.perform(replaceText("guseberjo@student.gu.se"), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.etPass), isDisplayed()));
        appCompatEditText8.perform(replaceText("fisk1234"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.etPass), withText("fisk1234"), isDisplayed()));
        appCompatEditText9.perform(pressImeActionButton());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btnLogin), withText("Login"), isDisplayed()));
        appCompatButton3.perform(click());
    }

    @Test
    public void controllerActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.controlButton), withText("Control"), isDisplayed()));
        appCompatButton.perform(click());
    }
    @Test
    public void controllerActivityTest_controlView() {

        controllerActivityTest();

        ViewInteraction appControlButton = onView(
                allOf(withId(R.id.controlView), isDisplayed()));
        appControlButton.perform(click(), swipeRight());
        appControlButton.perform(click(), swipeLeft());
        appControlButton.perform(click(), swipeUp());
        appControlButton.perform(click(), swipeDown());
    }
    @Test
    public void controllerActivity_batteryButton() {

        controllerActivityTest();

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.batteryButton), isDisplayed()));
        appCompatImageButton.perform(click());

        pressBack();
    }
    @Test
    public void controllerActivityTest_menuButton() {

        controllerActivityTest();

        ViewInteraction toggleButton = onView(
                allOf(withId(R.id.menuButton), isDisplayed()));
        toggleButton.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.title), withText("My Profile"), isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withId(R.id.menuButton), isDisplayed()));
        appCompatImageButton2.perform(click());

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.title), withText("Security"), isDisplayed()));
        appCompatTextView2.perform(click());

        ViewInteraction appCompatImageButton3 = onView(
                allOf(withId(R.id.menuButton), isDisplayed()));
        appCompatImageButton3.perform(click());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.title), withText("Settings"), isDisplayed()));
        appCompatTextView3.perform(click());

        ViewInteraction appCompatImageButton4 = onView(
                allOf(withId(R.id.menuButton), isDisplayed()));
        appCompatImageButton4.perform(click());

        ViewInteraction appCompatTextView4 = onView(
                allOf(withId(R.id.title), withText("Help & Feedback"), isDisplayed()));
        appCompatTextView4.perform(click());

        pressBack();
    }
}
