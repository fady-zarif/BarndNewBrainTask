package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.check.checkModules
import com.fady.brain_power_task.di.AppModule.networkModule
import com.fady.brain_power_task.di.AppModule.viewModule

class AthleteAppTest : KoinTest {
    @Test
    fun checkAthleteAppInstantiation() {
        startKoin {
            modules(listOf(networkModule, viewModule))
        }.checkModules()
        val athleteApp = AthleteApp()
        assertNotNull(athleteApp)
    }
}