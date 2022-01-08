package com.example.daggerapplication3

import dagger.Component

@Component(modules = [EngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}