package com.example.robolectricbug;

import android.view.View;
import android.widget.FrameLayout;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertTrue;

@Config(constants = BuildConfig.class, sdk= 26)
@RunWith(RobolectricTestRunner.class)
public class CustomViewHolderTest {

    private CustomViewHolder customViewHolder;
    private CustomTextView customTextView;
    private View view;

    @Before
    public void setup() {
        customViewHolder = new CustomViewHolder();
        view = customViewHolder.inflate(new FrameLayout(RuntimeEnvironment.application));
    }

    @Test
    public void test() {
        // Test should pass.
        assertTrue(true);
    }

}