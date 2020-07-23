package com.example.kotlin_hilt_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_hilt_dagger2.classes.SomeClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Whats dagger doing is that its creating these dependencies at compile time
 * and its making it available to use at run time.
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Field injection, which in this case inject to this MainActivity
    @Inject
    lateinit var someClass : SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(someClass.doAThing1())
        println(someClass.doAThing2())
    }
}

