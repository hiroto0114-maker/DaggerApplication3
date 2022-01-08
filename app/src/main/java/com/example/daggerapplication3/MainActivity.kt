package com.example.daggerapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var engine: Engine
    private val carComponent = DaggerCarComponent
        .builder().build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.carComponent.inject(this)
        engine.start()
    }
}
