package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class AthleteRepositoryTest {
    private val athleteRepository = mock(AthleteRepository::class.java)
    private val remoteSourceImp = mock(RemoteSourceImp::class.java)

    @Test
    fun data_isFetchedCorrectly() {
        val expectedData = mock(Data::class.java)
        `when`(remoteSourceImp.fetchData()).thenReturn(expectedData)
        athleteRepository.fetchData()
        verify(remoteSourceImp).fetchData()
        val data = athleteRepository.fetchData()
        assertNotNull(data)
        assertEquals(expectedData, data)
    }

    @Test
    fun data_isCachedCorrectly() {
        val expectedData = mock(Data::class.java)
        `when`(remoteSourceImp.fetchData()).thenReturn(expectedData)
        athleteRepository.fetchData()
        verify(remoteSourceImp).fetchData()
        val cachedData = athleteRepository.getCachedData()
        assertNotNull(cachedData)
        assertEquals(expectedData, cachedData)
    }
}