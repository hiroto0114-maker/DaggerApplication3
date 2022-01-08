package com.example.daggerapplication3

import dagger.Component

@Component(modules = [EngineModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}
