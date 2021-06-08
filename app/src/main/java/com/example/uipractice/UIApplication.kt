package com.example.uipractice

import android.app.Application
import com.tencent.bugly.crashreport.CrashReport

class UIApplication:Application(){

    override fun onCreate() {
        super.onCreate()
        CrashReport.initCrashReport(getApplicationContext(), "2f70b729f6", false);

    }


}