package com.example.daggerapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var driver2: Driver

    @Inject lateinit var driver3: Driver

    //private val carComponent = DaggerCarComponent
        //.builder().build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this.carComponent.inject(this)
        //Log.d("driver      ","$driver.hp")
        //driver.hp = 11
        //Log.d("driver1     ","$driver1.hp")
    }
}
