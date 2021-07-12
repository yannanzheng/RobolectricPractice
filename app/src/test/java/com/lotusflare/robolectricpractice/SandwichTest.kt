package com.lotusflare.robolectricpractice

import android.widget.Button
import android.widget.TextView
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class SandwichTest {

    @Test
    fun clickingLogin_shouldStartLoginActivity() {
        val activity: MainActivity = Robolectric.setupActivity(MainActivity::class.java)
        activity.findViewById<Button>(R.id.login).performClick()
        val textView = activity.findViewById<TextView>(R.id.welcomeTextView)

        assertThat(textView.text.toString(),equalTo("你好，jephy"))
    }
}