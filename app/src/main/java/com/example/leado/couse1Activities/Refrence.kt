package com.example.leado.couse1Activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_refrence.*

class Refrence : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_refrence, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn5.setOnClickListener {
            findNavController().navigate(RefrenceDirections.actionRefrenceToCongrats2())
        }
    }
}