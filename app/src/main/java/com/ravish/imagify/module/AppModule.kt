package com.ravish.imagify.module

import com.ravish.imagify.model.ImplementOne
import com.ravish.imagify.model.One
import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun getName(): String = "Ravish Jain"

    @Provides
    @Singleton
    fun binding(name: String): One = ImplementOne(name)
}