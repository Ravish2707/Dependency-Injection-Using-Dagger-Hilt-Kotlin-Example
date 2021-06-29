package com.ravish.imagify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ravish.imagify.model.Car
import com.ravish.imagify.model.Main
import com.ravish.imagify.model.Student
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var main: Main

    @Inject
    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.getCar()
        main.getName()
        student.getName()
    }
}