package com.ravish.imagify.module

import com.ravish.imagify.model.ImplementOne
import com.ravish.imagify.model.One
import dagger.Binds
import dagger.Module
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@Module
//@InstallIn(SingletonComponent::class)
//abstract class OneInterfaceModule {
//
//    @Binds
//    @Singleton
//    abstract fun binding(
//        implementOne: ImplementOne
//    ) : One
//}