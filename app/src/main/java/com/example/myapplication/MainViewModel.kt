package com.example.myapplication

import androidx.lifecycle.*
import android.util.Log

class MainViewModel : ViewModel() {
    init {
        Log.d("RRR","MainViewModel")
    }

    var counter = MutableLiveData<Int>()
    fun setCounter() {
        counter.value = (counter.value ?: 0) + 1
    }
}