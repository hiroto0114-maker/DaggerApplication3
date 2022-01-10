package com.example.daggerapplication3

import dagger.Module
import dagger.Provides

@Module
class EngineModule {

    @Provides
    fun provideEngine():Driver{
        return Driver()
    }

}
