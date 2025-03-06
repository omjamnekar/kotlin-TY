package com.example.cbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneBroadCast:BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {


        if(intent.getAction() ==Intent.ACTION_AIRPLANE_MODE_CHANGED)
        {
            var data =intent.getBooleanExtra("state",false)
            if(data == true){
                Toast.makeText(context,"Airplane Mode is on",Toast.LENGTH_LONG).show()

            }
            else {
                Toast.makeText(context,"Airplane Mode is off",Toast.LENGTH_LONG).show()

            }
        }


    }
}