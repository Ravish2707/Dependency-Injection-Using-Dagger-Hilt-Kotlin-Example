package com.ravish.imagify.model

import android.util.Log
import com.ravish.imagify.annotations.FirstName
import com.ravish.imagify.annotations.LastName
import javax.inject.Inject

private const val TAG = "Student"
class Student @Inject constructor(@FirstName private val firstName: String, @LastName private val lastName: String){

    fun getName(){
        Log.d(TAG, "My Name is $firstName $lastName")
    }
}