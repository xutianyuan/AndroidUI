package com.example.uipractice.material

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.uipractice.R

class DrawerLayoutActivity:AppCompatActivity(){

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_layout_activity)
        drawerLayout = findViewById(R.id.drawer_layout)

        drawerLayout.openDrawer(GravityCompat.START)
    }
}