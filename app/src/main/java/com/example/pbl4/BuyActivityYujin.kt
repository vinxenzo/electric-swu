package com.example.mypbl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class BuyActivityYujin : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_yujin)

        drawerLayout = findViewById(R.id.drawer_layout)

        navigationView=findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        drawerLayout = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item!!.itemId){
            android.R.id.home->{
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)

    }
    override fun onNavigationitemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.menu_home-> Toast.makeText(this,"menu_home 실행", Toast.LENGTH_SHORT).show()
            R.id.menu_mypage-> Toast.makeText(this, "menu_mypage", Toast.LENGTH_SHORT).show()
            R.id.menu_buy-> Toast.makeText(this, "menu_buy",Toast.LENGTH_SHORT).show()
            R.id.menu_sell->Toast.makeText(this, "menu_sell",Toast.LENGTH_SHORT).show()

        }
        return false
    }

}