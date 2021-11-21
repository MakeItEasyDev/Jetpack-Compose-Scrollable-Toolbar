package com.jetpack.scrollabletoolbar.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScrollViewModel: ViewModel() {
    private var lastScrollIndex = 0
    private val _scrollUp = MutableLiveData(false)
    val scrollUp: LiveData<Boolean> = _scrollUp

    fun updateScrollPosition(newScrollIndex: Int) {
        if (newScrollIndex == lastScrollIndex) return

        _scrollUp.value = newScrollIndex > lastScrollIndex
        lastScrollIndex = newScrollIndex
    }
}