package com.skd.documentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.skd.documentation.ui.screen.DocumentationScreen
import com.skd.documentation.ui.theme.DocumentationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DocumentationTheme {
                DocumentationScreen()
            }
        }
    }
}