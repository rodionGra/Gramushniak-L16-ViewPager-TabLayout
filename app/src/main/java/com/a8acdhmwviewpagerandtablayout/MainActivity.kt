package com.a8acdhmwviewpagerandtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a8acdhmwviewpagerandtablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupViewPager()
        setupTabLayoutMediator()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupViewPager() {
        binding.viewPager.adapter = ViewPagerAdapter(this, Country.listOfCountry)
    }

    private fun setupTabLayoutMediator(){
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = Country.listOfCountry[position].name
        }.attach()

    }
}