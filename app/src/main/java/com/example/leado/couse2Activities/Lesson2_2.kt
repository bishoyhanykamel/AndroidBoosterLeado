package com.example.leado.couse2Activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_lesson2_2.*


class Lesson2_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson2_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn2.setOnClickListener {
            findNavController().navigate(Lesson2_2Directions.actionLesson222ToLesson322())
        }
        takeQuiz1.setOnClickListener {
            findNavController().navigate(Lesson2_2Directions.actionLesson222ToQuiz122())
        }
    }

}
