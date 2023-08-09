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
