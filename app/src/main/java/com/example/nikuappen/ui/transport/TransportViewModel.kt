package com.example.nikuappen.ui.transport

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransportViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is transport Fragment"
    }
    val text: LiveData<String> = _text
}