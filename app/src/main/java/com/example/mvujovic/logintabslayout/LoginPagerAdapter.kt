package com.example.mvujovic.logintabslayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by mvujovic on 24.4.2018..
 */
class LoginPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if(position == 0)
            return SignInFragment()
        else
            return SignUpFragment()
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        if (position == 0)
            return "Sign In"
        else
            return "Sign Up"
    }
}