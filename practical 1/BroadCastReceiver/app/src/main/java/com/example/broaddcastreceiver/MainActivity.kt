package com.example.broaddcastreceiver

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val con  =applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager;

        val connection= con.activeNetworkInfo;

        if(connection!=null && connection.isConnected){
                if(connection.type ==ConnectivityManager.TYPE_MOBILE ){
                    Toast.makeText(applicationContext, "Mobile Data",Toast.LENGTH_LONG).show();

                }else if(connection.type==ConnectivityManager.TYPE_WIFI){
                        Toast.makeText(applicationContext,"WIFI Data", Toast.LENGTH_LONG).show();
                }
        }else{
           val t= Toast.makeText(applicationContext,"Offline Connection",Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0,0);
            t.show();
        }

    }
}