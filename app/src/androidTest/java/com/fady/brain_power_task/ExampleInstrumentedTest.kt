package com.fady.brain_power_task

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class MainActivityViewModelTest {
    @Test
    fun liveDataObjects_areUpdatedCorrectly() {
        // TODO: Implement test
    }
}
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.fady.brain_power_task", appContext.packageName)
    }
}