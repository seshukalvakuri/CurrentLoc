package com.example.currentloc

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class LocViewModel(application: Application) : AndroidViewModel(application) {

    private val locationData = LocLiveData(application)

    fun getLocationData() = locationData
}