package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class AthleteRepositoryTest {
    private val athleteRepository = mock(AthleteRepository::class.java)
    private val remoteSourceImp = mock(RemoteSourceImp::class.java)

    @Test
    fun data_isFetchedCorrectly() {
        `when`(athleteRepository.fetchData()).thenReturn(mock(Data::class.java))
        val data = athleteRepository.fetchData()
        assertNotNull(data)
    }

    @Test
    fun data_isCachedCorrectly() {
        `when`(athleteRepository.fetchData()).thenReturn(mock(Data::class.java))
        `when`(athleteRepository.getCachedData()).thenReturn(mock(Data::class.java))
        athleteRepository.fetchData()
        val cachedData = athleteRepository.getCachedData()
        assertNotNull(cachedData)
    }
}