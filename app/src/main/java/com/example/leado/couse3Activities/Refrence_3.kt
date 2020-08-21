package com.example.leado.couse3Activities

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.AwarenessRoom_fourth
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_refrence_3.*

class Refrence_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_refrence_3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn5.setOnClickListener {
        findNavController().navigate(Refrence_3Directions.actionRefrence3ToCongrats3())
        }
    }

}