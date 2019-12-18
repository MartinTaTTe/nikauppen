package com.example.nikuappen.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nikuappen.R
import kotlinx.android.synthetic.main.fragment_about.view.*

class AboutViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        //value = context.getResources().getString(R.string.about_text)
    }
    val text: LiveData<String> = _text
}