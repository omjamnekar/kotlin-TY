package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AboutUs : AppCompatActivity() {

    private val msg = "AboutUs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_main) // Ensure there is an XML file for this

        Log.d(msg, "Created")
        Toast.makeText(this, "You are in About Us", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(msg, "Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg, "Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(msg, "Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg, "Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg, "Destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(msg, "Restarted")
    }
}
