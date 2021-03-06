package com.example.tablayoutviewpager

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyAdapter(private val myContext: Context, fm: FragmentManager, private var totalTabs: Int) :
    FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                HomeFragment()
            }
            1 -> {
                SportFragment()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                MovieFragment()
            }
            3 -> {
                // val utilityFragment = UtilityFragment()
                UtilityFragment()
            }
            else -> getItem(position)
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}