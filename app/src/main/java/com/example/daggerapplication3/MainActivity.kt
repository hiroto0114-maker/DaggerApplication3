package com.example.daggerapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var driver2: Driver

    @Inject lateinit var driver3: Driver
//以下の１７行目のように記入すること
//DaggerCarApplicationと、AndroidManifest.xml(android:name=".DaggerCarApplication")
//に記入して、完了する。メインアクティヴィティが破棄されてもコンポーネントが破棄されることはなくなる。
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as DaggerCarApplication).carComponent.inject(this)
    }
}
