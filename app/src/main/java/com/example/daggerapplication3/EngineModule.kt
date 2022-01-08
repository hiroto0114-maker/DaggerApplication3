package com.example.daggerapplication3

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class EngineModule {

    @Binds
    abstract fun bindEngine(engine : PetrolEngine):Engine

}
