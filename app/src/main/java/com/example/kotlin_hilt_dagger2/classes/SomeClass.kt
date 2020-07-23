package com.example.kotlin_hilt_dagger2.classes

import com.example.kotlin_hilt_dagger2.interfaces.SomeInterface
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SomeClass @Inject constructor(
    @Implementation1 private val someInterface1: SomeInterface,
    @Implementation2 private val someInterface2: SomeInterface
){
    fun doAThing1() : String {
        return "Look I got: ${someInterface1.getAThing()} !"
    }
    fun doAThing2() : String {
        return "Look I got: ${someInterface2.getAThing()} !"
    }

    fun doSomething() : String {
        return "Yeah I got ${someInterface1.getAThing()} !"
    }
}