package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class RemoteSourceImpTest {
    private val remoteSourceImp = mock(RemoteSourceImp::class.java)

    @Test
    fun data_isFetchedCorrectly() {
        val expectedData = mock(Data::class.java)
        `when`(remoteSourceImp.fetchData()).thenReturn(expectedData)
        val data = remoteSourceImp.fetchData()
        verify(remoteSourceImp).fetchData()
        assertNotNull(data)
        assertEquals(expectedData, data)
    }
}