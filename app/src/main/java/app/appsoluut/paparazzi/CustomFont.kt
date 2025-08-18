package app.appsoluut.paparazzi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CustomFont() {
    MaterialTheme {
        Box(Modifier.fillMaxSize().background(color = Color.White)) {
            Text(
                text = "Hello, Paparazzi!",
                style = TextStyle(
                    fontFamily = GreatVibes
                )
            )
        }
    }
}

val GreatVibes = FontFamily(
    Font(resId = R.font.great_vibes_regular, weight = FontWeight.Normal, FontStyle.Normal),
)
