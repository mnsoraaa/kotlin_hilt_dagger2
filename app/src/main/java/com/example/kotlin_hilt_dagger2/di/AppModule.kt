package com.example.kotlin_hilt_dagger2.di

import com.example.kotlin_hilt_dagger2.classes.Implementation1
import com.example.kotlin_hilt_dagger2.classes.Implementation2
import com.example.kotlin_hilt_dagger2.classes.SomeOtherClass1
import com.example.kotlin_hilt_dagger2.classes.SomeOtherClass2
import com.example.kotlin_hilt_dagger2.interfaces.SomeInterface
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideSomeString() : String {
        return "some string"
    }

    @Implementation1
    @Singleton
    @Provides
    fun provideSomeInterface1(someString : String) : SomeInterface {
        return SomeOtherClass1()
    }

    @Implementation2
    @Singleton
    @Provides
    fun provideSomeInterface2(someString : String) : SomeInterface {
        return SomeOtherClass2()
    }

    @Singleton
    @Provides
    fun provideGson() : Gson {
        return Gson()
    }
}