package com.ravish.imagify.model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d(TAG, "Car is running")
    }

}