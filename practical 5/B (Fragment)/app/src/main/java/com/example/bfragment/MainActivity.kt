package com.example.bfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data projectors
        var vp =findViewById<ViewPager>(R.id.myVp)
        var tabs =findViewById<TabLayout>(R.id.myTabs)

        //data giver
        var vpa =ViewPageAdapter(supportFragmentManager);

        vp.adapter =vpa
        tabs.setupWithViewPager(vp)

    }
}