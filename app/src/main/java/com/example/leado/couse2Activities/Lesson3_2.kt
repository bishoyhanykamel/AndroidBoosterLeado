package com.example.leado.couse2Activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_lesson3_2.*


class Lesson3_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson3_2, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn3.setOnClickListener {
        findNavController().navigate(Lesson3_2Directions.actionLesson322ToLesson422())
        }
    }
}