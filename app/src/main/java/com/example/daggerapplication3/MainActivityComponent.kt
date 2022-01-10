package com.example.daggerapplication3

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [EngineModule::class])
interface MainActivityComponent {

    fun inject(activity: MainActivity)
}