package com.piccionialessio.nine.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MatchViewModel(): ViewModel() {
    val match = MutableLiveData(Match())

}