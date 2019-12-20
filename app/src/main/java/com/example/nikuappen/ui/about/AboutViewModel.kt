package com.example.nikuappen.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nikuappen.App
import com.example.nikuappen.R
import com.example.nikuappen.ResourceProvider


class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = ResourceProvider.aboutText
    }
    val text: LiveData<String> = _text
}