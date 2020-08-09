package com.example.leado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_congrats_screen.*

class CongratsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_screen)

        AchievementsBtn.setOnClickListener{

            val int:Intent = Intent(this,Achievements_::class.java)
            startActivity(int)

        }
    }
}