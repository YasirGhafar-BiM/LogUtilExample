package com.techlads.logutilexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techlads.logutil.LogUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtil.LogD("MainActivity::::", "DEBUG Logged using using separate module")
        LogUtil.LogE("MainActivity::::", "ERROR Logged using using separate module")
        LogUtil.LogW("MainActivity::::", "WARN Logged using using separate module")
    }
}