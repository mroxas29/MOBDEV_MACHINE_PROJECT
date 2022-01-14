package com.mobdeve.s11.roxas.michael.mobdevmachineproject.ui.favourites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavouritesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Favourites Fragment"
    }
    val text: LiveData<String> = _text
}