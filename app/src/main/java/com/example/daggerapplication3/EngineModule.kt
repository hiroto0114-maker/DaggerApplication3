package com.example.daggerapplication3

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class EngineModule {

    //@Singleton
    @Provides
    fun provideEngine(driver: Driver):Driver{
        return driver
    }

}
