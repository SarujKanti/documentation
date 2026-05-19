package com.skd.documentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.skd.documentation.ui.screen.DocumentationScreen
import com.skd.documentation.ui.theme.DocumentationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // ── Edge-to-edge: transparent status bar + navigation bar ────────────
        // Works on API 21+ and handles Android 15 enforcement automatically.
        // SystemBarStyle.light() → dark (visible) icons for our white top bar.
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                scrim = Color.Transparent.toArgb(),
                darkScrim = Color.Transparent.toArgb()
            ),
            navigationBarStyle = SystemBarStyle.light(
                scrim = Color.Transparent.toArgb(),
                darkScrim = Color.Transparent.toArgb()
            )
        )

        setContent {
            DocumentationTheme {
                DocumentationScreen()
            }
        }
    }
}
