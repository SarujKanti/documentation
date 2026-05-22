package com.skd.documentation.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary    = Purple80,
    secondary  = PurpleGrey80,
    tertiary   = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary    = Purple40,
    secondary  = PurpleGrey40,
    tertiary   = Pink40
)

@Composable
fun DocumentationTheme(
    // Dynamic color disabled — we use fixed Office branding colours,
    // and Android 12+ dynamic colour can turn the status bar
    // invisible by picking wallpaper colours unpredictably.
    darkTheme    : Boolean = isSystemInDarkTheme(),
    dynamicColor : Boolean = false,
    content      : @Composable () -> Unit
) {
    // Always use our fixed colour scheme so the UI is consistent
    // on every device regardless of wallpaper or Android version.
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    // ── Status bar & navigation bar icon colours ─────────────────────────────
    // Our AppTopBar background is always Color.White, so we need DARK icons
    // (isAppearanceLightStatusBars = true) on every Android version.
    // This replaces the old window.statusBarColor approach which is deprecated
    // on Android 13+ and has no effect on Android 15+.
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            val controller = WindowCompat.getInsetsController(window, view)
            // true → dark (visible) icons on our white top bar
            controller.isAppearanceLightStatusBars     = true
            // true → dark icons above the white/light navigation bar
            controller.isAppearanceLightNavigationBars = true
        }
    }
    
    MaterialTheme(
        colorScheme = colorScheme,
        typography  = Typography,
        content     = content
    )
}
