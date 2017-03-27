package com.group02.guard;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import com.group02.guard.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
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

        ViewInteraction appCompatImageButton = onView(
                allOf(withId(R.id.menuButton), isDisplayed()));
        appCompatImageButton.perform(click());

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

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btnLogout), withText("Logout"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText10.perform(click());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.etEmail), isDisplayed()));
        appCompatEditText11.perform(replaceText("guseberjo@student.gu.se"), closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.etPass), isDisplayed()));
        appCompatEditText12.perform(replaceText("fisk1234"), closeSoftKeyboard());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btnLogin), withText("Login"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.controlButton), withText("Control"), isDisplayed()));
        appCompatButton6.perform(click());

        pressBack();

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.wifiDirectButton), withText("WiFi Direct"), isDisplayed()));
        appCompatButton7.perform(click());

        pressBack();

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.mapsButton), withText("Map"), isDisplayed()));
        appCompatButton8.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        pressBack();

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.btnLogout), withText("Logout"), isDisplayed()));
        appCompatButton4.perform(click());

    }

}
