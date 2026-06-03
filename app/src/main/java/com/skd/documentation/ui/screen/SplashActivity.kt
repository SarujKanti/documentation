package com.skd.documentation.ui.screen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.skd.documentation.MainActivity

class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install splash screen BEFORE super.onCreate
        installSplashScreen()

        super.onCreate(savedInstanceState)

        // Navigate immediately to MainActivity
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}