package com.example.qrcodescanner.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = purple2,
    primaryVariant = purple3,
    secondary = purple1
)

private val DarkColorPalette = darkColors(
    primary = purple1,
    primaryVariant = purple3,
    secondary = purple2
)

@Composable
fun QrCodeScannerComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(),content: @Composable() () -> Unit) {
    val colors = if(darkTheme)
    {
        DarkColorPalette
    }
    else
    {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}