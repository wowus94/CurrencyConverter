package com.vlyashuk.currencyconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vlyashuk.currencyconverter.screens.root.RootFragment
import com.vlyashuk.currencyconverter.screens.splash.SplashFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.nav_host, RootFragment())
                .commit()
        }
    }
}
