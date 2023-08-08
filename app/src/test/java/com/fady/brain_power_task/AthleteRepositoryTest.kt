package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class AthleteRepositoryTest {
    @Test
    fun data_isFetchedCorrectly() {
        val athleteRepository = AthleteRepository(RemoteSourceImp())
        val data = athleteRepository.fetchData()
        assertNotNull(data)
    }

    @Test
    fun data_isCachedCorrectly() {
        val athleteRepository = AthleteRepository(RemoteSourceImp())
        athleteRepository.fetchData()
        val cachedData = athleteRepository.getCachedData()
        assertNotNull(cachedData)
    }
}