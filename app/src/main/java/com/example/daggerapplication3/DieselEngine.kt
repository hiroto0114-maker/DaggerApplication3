package com.example.daggerapplication3

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override
    fun start(){
        Log.d("133","123")
    }
}