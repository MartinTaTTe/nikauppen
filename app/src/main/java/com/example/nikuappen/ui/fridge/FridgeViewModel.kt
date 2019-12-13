package com.example.nikuappen.ui.fridge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FridgeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Seems like the fridge is empty"
    }

    val text: LiveData<String> = _text

    private var title: String = ""
    private var description: String = ""

    public fun getTitle(): String { return this.title }
    public fun getDescription(): String { return this.description }

    public fun setTitle(title: String): Unit { this.title = title }
    public fun setDescription(desc: String): Unit { this.description = desc }

}