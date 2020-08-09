package com.example.leado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_welcome_.*


class Welcome_ : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getStartedBtn.setOnClickListener {
            findNavController().navigate(Welcome_Directions.actionWelcomeToBeforeHome())
        }
        Loginview.setOnClickListener {
            findNavController().navigate(Welcome_Directions.actionWelcomeToLogin())
        }
    }


}