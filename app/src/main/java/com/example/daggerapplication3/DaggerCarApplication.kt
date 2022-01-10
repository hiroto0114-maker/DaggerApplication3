package com.example.daggerapplication3

import android.app.Application

class DaggerCarApplication : Application() {
    lateinit var carComponent: MainActivityComponent
    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerMainActivityComponent.builder().build()
    }
}