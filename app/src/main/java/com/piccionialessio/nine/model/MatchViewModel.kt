package com.piccionialessio.nine.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MatchViewModel(application: Application): AndroidViewModel(application) {
    val match = MutableLiveData<Match>()

    fun startMatch() {
        match.postValue()
    }
}