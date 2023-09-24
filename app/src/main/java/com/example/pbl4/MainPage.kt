package com.example.pbl4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val fragmentList = listOf(BuyFragment(), SellFragment(), OutstandingFragment())
        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragmentList
        binding.viewPager.adapter = adapter

    }
}