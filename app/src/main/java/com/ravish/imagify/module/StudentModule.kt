package com.ravish.imagify.module

import com.ravish.imagify.annotations.FirstName
import com.ravish.imagify.annotations.LastName
import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StudentModule {

    @Provides
    @Singleton
    @FirstName
    fun getFirstName() = "Ravish"

    @Provides
    @Singleton
    @LastName
    fun getLastName() = "Jain"
}