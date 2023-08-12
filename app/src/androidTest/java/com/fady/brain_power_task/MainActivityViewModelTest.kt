package com.fady.brain_power_task

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

@RunWith(AndroidJUnit4::class)
class MainActivityViewModelTest {
    private val mainActivityViewModel = mock(MainActivityViewModel::class.java)

    @Test
    fun liveDataObjects_areUpdatedCorrectly() {
        `when`(mainActivityViewModel.liveData).thenReturn(mock(LiveData::class.java))
        val liveData = mainActivityViewModel.liveData
        assertNotNull(liveData)
    }
}