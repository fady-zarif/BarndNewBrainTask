package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {
    @Test
    fun recyclerView_isPopulated() {
        val mainActivity = MainActivity()
        mainActivity.populateRecyclerView()
        assertNotNull(mainActivity.recyclerView.adapter)
    }

    @Test
    fun loadingSpinner_isDisplayedAndHidden() {
        val mainActivity = MainActivity()
        mainActivity.showLoadingSpinner()
        assertTrue(mainActivity.loadingSpinner.isDisplayed)
        mainActivity.hideLoadingSpinner()
        assertFalse(mainActivity.loadingSpinner.isDisplayed)
    }

    @Test
    fun bottomSheetView_isDisplayed() {
        val mainActivity = MainActivity()
        mainActivity.showBottomSheetView()
        assertTrue(mainActivity.bottomSheetView.isDisplayed)
    }
}