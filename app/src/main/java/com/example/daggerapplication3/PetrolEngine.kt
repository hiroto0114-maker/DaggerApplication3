package com.example.daggerapplication3

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override
    fun start(){
        Log.d("111","111")
    }
}