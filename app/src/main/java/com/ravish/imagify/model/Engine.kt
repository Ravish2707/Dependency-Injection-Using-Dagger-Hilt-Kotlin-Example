package com.ravish.imagify.model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Engine"
class Engine @Inject constructor() {

    fun getEngine(){
        Log.d(TAG, "Engine Started")
    }
}