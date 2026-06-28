package com.example

import android.os.Build
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [33])
class MainActivityTest {
    @Test
    fun launchActivity() {
        try {
            ActivityScenario.launch(MainActivity::class.java)
        } catch(e: Exception) {
            e.printStackTrace()
            throw e
        }
    }
}
