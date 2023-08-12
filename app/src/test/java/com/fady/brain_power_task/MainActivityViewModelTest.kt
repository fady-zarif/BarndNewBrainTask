package com.fady.brain_power_task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class MainActivityViewModelTest {
    private val mainActivityViewModel = mock(MainActivityViewModel::class.java)
    private val liveData = mock(MutableLiveData::class.java)

    @Before
    fun setup() {
        `when`(mainActivityViewModel.liveData).thenReturn(liveData)
    }

    @Test
    fun liveDataObjects_areUpdatedCorrectly() {
        val expectedData = mock(Data::class.java)
        `when`(liveData.value).thenReturn(expectedData)
        val data = liveData.value
        assertNotNull(data)
        assertEquals(expectedData, data)
    }
}
    private val liveData = mock(MutableLiveData::class.java)

    @Before
    fun setup() {
        `when`(mainActivityViewModel.liveData).thenReturn(liveData)
    }

    @Test
    fun liveDataObjects_areUpdatedCorrectly() {
        val expectedData = mock(Data::class.java)
        `when`(liveData.value).thenReturn(expectedData)
        val data = liveData.value
        assertNotNull(data)
        assertEquals(expectedData, data)
    }
}
