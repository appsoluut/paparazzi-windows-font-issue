package app.appsoluut.paparazzi

import app.cash.paparazzi.Paparazzi
import app.cash.paparazzi.detectEnvironment
import org.junit.Rule
import org.junit.Test

class CustomFontTest() {
    @get:Rule
    val paparazzi = Paparazzi(
        environment = detectEnvironment().copy(compileSdkVersion = 34) // issue: https://github.com/cashapp/paparazzi/issues/1866
    )

    @Test
    fun renderCorrectFont() {
        paparazzi.snapshot {
            CustomFont()
        }
    }
}