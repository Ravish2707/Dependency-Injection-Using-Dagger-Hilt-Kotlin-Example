package com.ravish.imagify.model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Wheel"
class Wheel @Inject constructor() {

    fun getWheel(){
        Log.d(TAG, "Wheel Placed.")
    }
}