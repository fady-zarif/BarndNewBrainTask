package com.fady.brain_power_task

import org.junit.Test
import org.junit.Assert.*
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class MainActivityTest {
    private val mainActivity = mock(MainActivity::class.java)
    private val recyclerView = mock(RecyclerView::class.java)
    private val loadingSpinner = mock(ProgressBar::class.java)
    private val bottomSheetView = mock(BottomSheetView::class.java)

    class MainActivityTest {
        private val mainActivity = mock(MainActivity::class.java)
        private val recyclerView = mock(RecyclerView::class.java)
        private val loadingSpinner = mock(ProgressBar::class.java)
        private val bottomSheetView = mock(BottomSheetView::class.java)
    
        @Test
        fun recyclerView_isPopulated() {
            `when`(mainActivity.populateRecyclerView()).thenReturn(Unit)
            mainActivity.populateRecyclerView()
            assertNotNull(mainActivity.recyclerView.adapter)
        }
    
        @Test
        fun loadingSpinner_isDisplayedAndHidden() {
            `when`(mainActivity.showLoadingSpinner()).thenReturn(Unit)
            `when`(mainActivity.hideLoadingSpinner()).thenReturn(Unit)
            mainActivity.showLoadingSpinner()
            assertTrue(mainActivity.loadingSpinner.isDisplayed)
            mainActivity.hideLoadingSpinner()
            assertFalse(mainActivity.loadingSpinner.isDisplayed)
        }
    
        @Test
        fun bottomSheetView_isDisplayed() {
            `when`(mainActivity.showBottomSheetView()).thenReturn(Unit)
            mainActivity.showBottomSheetView()
            assertTrue(mainActivity.bottomSheetView.isDisplayed)
        }
    }