package com.example.kotlin_hilt_dagger2.classes

import com.example.kotlin_hilt_dagger2.interfaces.SomeInterface
import javax.inject.Inject

class SomeOtherClass1 @Inject constructor() :
    SomeInterface {
    fun doSomeOtherThing() : String {
        return "Look I do some other thing!"
    }

    override fun getAThing(): String {
        return "A Thing 1"
    }
}