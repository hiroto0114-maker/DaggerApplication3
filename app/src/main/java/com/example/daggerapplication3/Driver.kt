package com.example.daggerapplication3

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/*
   たった一つのインスタンスをみんなで共有するために使う@Singleton
 */
@Singleton
class Driver @Inject constructor() {
    var hp:Int = 10
}