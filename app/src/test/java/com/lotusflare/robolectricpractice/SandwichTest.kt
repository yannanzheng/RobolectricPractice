package com.lotusflare.robolectricpractice

import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.test.runner.AndroidJUnit4
import androidx.test.runner.AndroidJUnitRunner
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf
import kotlin.math.exp


@RunWith(AndroidJUnit4::class)
//@RunWith(RobolectricTestRunner::class)

class SandwichTest {

    @Test
    fun click_button_and_change_text() {
        val activity: MainActivity = Robolectric.setupActivity(MainActivity::class.java)
        activity.findViewById<Button>(R.id.login).performClick()
        val textView = activity.findViewById<TextView>(R.id.welcomeTextView)

        assertThat(textView.text.toString(),equalTo("你好，jephy"))
    }

    @Test
    fun click_button_and_go_second_screen(){
        val activity: MainActivity = Robolectric.setupActivity(MainActivity::class.java)
        activity.findViewById<Button>(R.id.go_second_screen_button).performClick()
        val expectIntent = Intent(activity, SecondActivity::class.java)
        val actual = shadowOf(RuntimeEnvironment.getApplication()).nextStartedActivity
        assertThat(actual.component, equalTo(expectIntent.component))
        assertEquals(actual.component,expectIntent.component)
    }
}