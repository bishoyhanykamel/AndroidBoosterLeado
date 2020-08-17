package com.example.leado.buttonNavigationActivites

import android.R.id.message
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.activity_fragment2.*


class Fragment2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)

        val mainNavigation = findNavController(R.id.host1_fragment)
        nav_btn.setupWithNavController(mainNavigation)

    }
}
