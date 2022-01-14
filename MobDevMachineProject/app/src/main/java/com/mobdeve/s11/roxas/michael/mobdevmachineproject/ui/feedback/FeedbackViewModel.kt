package com.mobdeve.s11.roxas.michael.mobdevmachineproject.ui.feedback

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeedbackViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is feedback Fragment"
    }
    val text: LiveData<String> = _text
}