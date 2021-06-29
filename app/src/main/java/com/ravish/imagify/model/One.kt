package com.ravish.imagify.model

import android.util.Log
import dagger.hilt.DefineComponent
import javax.inject.Inject

private const val TAG = "One"

interface One {

    fun getOne()
}

class ImplementOne @Inject constructor(private val name: String) : One{
    override fun getOne() {
        Log.d(TAG, "Ny name is $name")
    }

}

class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getOne()
    }
}