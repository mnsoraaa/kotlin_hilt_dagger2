package com.example.kotlin_hilt_dagger2.classes

import com.example.kotlin_hilt_dagger2.interfaces.SomeInterface
import javax.inject.Inject

class SomeOtherClass2 @Inject constructor() :
    SomeInterface {

    override fun getAThing(): String {
        return "A Thing 2"
    }
}