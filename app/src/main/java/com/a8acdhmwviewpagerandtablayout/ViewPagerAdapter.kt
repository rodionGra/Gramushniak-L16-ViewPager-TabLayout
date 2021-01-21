package com.a8acdhmwviewpagerandtablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity, private val listOfCountry: List<Country>) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = listOfCountry.size

    override fun createFragment(position: Int): Fragment {
        return CountryInfoFragment.newInstance(listOfCountry[position])
    }

}