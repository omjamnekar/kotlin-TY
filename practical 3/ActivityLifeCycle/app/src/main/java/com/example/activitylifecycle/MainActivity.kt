package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

     val msg = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.about_us)
        btn.setOnClickListener {
            val i = Intent(this, AboutUs::class.java)
            startActivity(i)
        }

        Log.d(msg, "Created")
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
