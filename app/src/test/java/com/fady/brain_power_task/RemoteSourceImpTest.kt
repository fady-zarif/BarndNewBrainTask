package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class RemoteSourceImpTest {
    @Test
    fun data_isFetchedCorrectly() {
        val remoteSourceImp = RemoteSourceImp()
        val data = remoteSourceImp.fetchData()
        assertNotNull(data)
    }
}