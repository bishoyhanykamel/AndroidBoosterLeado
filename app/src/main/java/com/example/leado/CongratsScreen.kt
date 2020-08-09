package com.example.leado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.buttonNavigationActivites.Achievements_

class CongratsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_screen)
        val fragment: Achievements_ = Achievements_()

    }
}