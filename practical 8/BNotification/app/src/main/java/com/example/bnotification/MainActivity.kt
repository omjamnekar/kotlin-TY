package com.example.bnotification

import android.Manifest
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {


    lateinit var nm:NotificationManager
    lateinit var nc:NotificationChannel
    lateinit var b:NotificationCompat.Builder

    val channelID="com.example.notification"
    val channelName="My Channel"
    var d ="Text Notification"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show= findViewById<Button>(R.id.btnShow)

        show.setOnClickListener {
            val i =Intent(applicationContext,MainActivity::class.java)

            val pi =PendingIntent.getActivity(applicationContext,0,i,PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT)


            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                b =NotificationCompat.Builder(this, channelID).apply {
                    setSmallIcon(R.mipmap.ic_launcher)
                    setContentTitle("AP")
                    setContentText("Android Programming")
                    setPriority(NotificationCompat.PRIORITY_HIGH)
                    setContentIntent(pi)
                    setAutoCancel(true)
                }

                nc =NotificationChannel(channelID,channelName,NotificationManager.IMPORTANCE_HIGH).apply {
                    enableVibration(true)
                    description =d
                }

                nm =getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

                nm.createNotificationChannel(nc)

                with(NotificationManagerCompat.from(this)){
                    if (ActivityCompat.checkSelfPermission(
                            applicationContext,
                            Manifest.permission.POST_NOTIFICATIONS
                        ) != PackageManager.PERMISSION_GRANTED
                    ) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return@with
                    }
                    notify(0,b.build())
                }
            }
        }
    }


}