package com.example.ejercicio2

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    private var onSaveInstanceState = 7
    private var onRestoreInstanceState = 8



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        setContentView(R.layout.activity_main)
        println("onSaveInstanceState $onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onRestoreInstanceState $onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        println("onRestart $onRestart")
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        println("onStop $onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        println("onDestroy $onDestroy")
    }
}