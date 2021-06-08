package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.tencent.bugly.crashreport.CrashReport
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var  hello:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /* hello = findViewById<TextView>(R.id.hello)
        hello?.setOnClickListener {
            //CrashReport.testJavaCrash();

        }*/
    }

}