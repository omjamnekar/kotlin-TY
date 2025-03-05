package com.example.aiappbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mymenu,menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        var id =item.itemId;
        if(id ==R.id.search) {
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show()
        }
        if(id==R.id.settings){
            Toast.makeText(this,"Options",Toast.LENGTH_LONG).show()
        }
        if(id == R.id.contactus)
            Toast.makeText(this,"ContactUs", Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}