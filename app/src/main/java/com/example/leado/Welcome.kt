package com.example.leado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        getStartedBtn.setOnClickListener {
            val intent = Intent (this, Fragment2::class.java)
            startActivity(intent)
        }
    }
}