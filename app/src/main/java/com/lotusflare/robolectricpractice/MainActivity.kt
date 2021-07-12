package com.lotusflare.robolectricpractice

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeWelcomeText(view: View) {
        findViewById<TextView>(R.id.welcomeTextView).text = "你好，jephy"
    }
}