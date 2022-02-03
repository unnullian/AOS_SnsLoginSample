package com.example.snsloginsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FacebookViewModel : ViewModel() {
    var isLoginLiveData = MutableLiveData<Boolean>(false)
}