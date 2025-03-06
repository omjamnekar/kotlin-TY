package com.example.permission

import android.content.DialogInterface
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val TAG= "Permission";
    private val REQUEST_CODE= 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setPermission()
    }

    private fun makeRequest(){
        ActivityCompat.requestPermissions( this, arrayOf(android.Manifest.permission.RECORD_AUDIO),REQUEST_CODE)

    }

    private  fun setPermission(){
        val permission= ContextCompat.checkSelfPermission(this,android.Manifest.permission.RECORD_AUDIO)


        if(permission!=PackageManager.PERMISSION_GRANTED)
            Log.d(TAG,"Permission Denied")

        if(ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.RECORD_AUDIO)){
            val dialog=AlertDialog.Builder(this).create()
            dialog.setMessage("Permission")
            dialog.setTitle("Permission")
            dialog.setButton(AlertDialog.BUTTON_POSITIVE,"OKs",DialogInterface.OnClickListener { dialog, which ->

                makeRequest()
            })

            dialog.show()
        }
        else
            makeRequest()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode){
            REQUEST_CODE->{
                if(grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED)
                    Log.d(TAG,"Permission denied by user")

                else
                    Log.d(TAG,"Permission grant by user")
            }
        }
    }






}