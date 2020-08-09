package com.example.leado.startActivities

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.buttonNavigationActivites.Fragment2
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_login_.*


class Login_ : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Loginbtn.setOnClickListener {
        val intent = Intent(activity, Fragment2::class.java)
        startActivity(intent)

        }
    }
}