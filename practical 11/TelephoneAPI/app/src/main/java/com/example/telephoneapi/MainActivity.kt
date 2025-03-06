package com.example.telephoneapi

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {


    var mobileNum:String ="1234567890"
    val REQUEST =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val call =findViewById<Button>(R.id.btnCallMaker)
        call.setOnClickListener {
            makeCall()
        }

    val dial =findViewById<Button>(R.id.btnDialog)
        dial.setOnClickListener {
            dialler()
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == REQUEST)
            makeCall()
    }
    private fun makeCall(){
        val i =Intent(Intent.ACTION_CALL , Uri.fromParts("tel",mobileNum,null))
        if(ActivityCompat.checkSelfPermission(this ,android.Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE),REQUEST)
        else
            startActivity(i)
    }


    private fun dialler(){
        val i = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel","",null))

        startActivity(i)
    }



















}