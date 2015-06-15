/*
 * Copyright 2013-2015 by AVM GmbH, All Rights Reserved
 * Contact: <info@avm.de>
 */

package avm.de.dbflowtet;

import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class TestMainActivity extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    public TestMainActivity() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mActivity = getActivity();
    }

    public void testClick() {
        // Type text and then press the button.
        onView(withId(R.id.button))
                .perform(click())
                .check(matches(isEnabled()));
    }
}
