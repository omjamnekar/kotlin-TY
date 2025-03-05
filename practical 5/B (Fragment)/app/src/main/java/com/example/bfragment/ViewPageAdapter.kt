package com.example.bfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPageAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var f :Fragment? =null
        if(position ==0){
            f=FirstFragment()
        }
        else if(position==1){
            f=SecondFragment()

        }else if(position ==2){
                f= ThirdFragment()
        }
        return f!!
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {

        var title :String?=null
        if(position ==0){
            title="Chats"
        }else if(position==1){
            title="Status"
        }else if(position==2){
            title="Calls"
        }

        return title

    }



}