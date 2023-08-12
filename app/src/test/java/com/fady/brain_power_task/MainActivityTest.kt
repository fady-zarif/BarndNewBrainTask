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

    @Before
    fun setup() {
        `when`(mainActivity.recyclerView).thenReturn(recyclerView)
        `when`(mainActivity.loadingSpinner).thenReturn(loadingSpinner)
        `when`(mainActivity.bottomSheetView).thenReturn(bottomSheetView)
    }

    @Test
    fun testMainActivityBehavior() {
        mainActivity.showLoadingSpinner()
        verify(loadingSpinner).show()
        assertTrue(mainActivity.loadingSpinner.isShown)

        mainActivity.hideLoadingSpinner()
        verify(loadingSpinner).hide()
        assertFalse(mainActivity.loadingSpinner.isShown)

        mainActivity.showBottomSheetView()
        verify(bottomSheetView).show()
        assertTrue(mainActivity.bottomSheetView.isShown)
    }
}