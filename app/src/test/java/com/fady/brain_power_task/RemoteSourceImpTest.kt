package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class RemoteSourceImpTest {
    private val remoteSourceImp = mock(RemoteSourceImp::class.java)

    @Test
    fun data_isFetchedCorrectly() {
        `when`(remoteSourceImp.fetchData()).thenReturn(mock(Data::class.java))
        val data = remoteSourceImp.fetchData()
        assertNotNull(data)
    }
}