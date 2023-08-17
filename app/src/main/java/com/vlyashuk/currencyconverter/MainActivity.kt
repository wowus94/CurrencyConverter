package com.vlyashuk.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vlyashuk.currencyconverter.screens.root.RootFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host, RootFragment()).commit()
        }
    }
}