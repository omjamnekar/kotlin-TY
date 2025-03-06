package com.example.cbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var airplaneBroadCast:BroadcastReceiver = AirplaneBroadCast();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val filter:IntentFilter =IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(airplaneBroadCast,filter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneBroadCast)
    }
}