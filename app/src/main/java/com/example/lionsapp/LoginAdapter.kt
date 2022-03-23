package com.example.lionsapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.lionsapp.LoginTabFragment
import com.example.lionsapp.RegisterTabFragment

@Suppress("DEPRECATION")
internal class LoginAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                RegisterTabFragment()
            }
            1 -> {
                LoginTabFragment()

            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}

