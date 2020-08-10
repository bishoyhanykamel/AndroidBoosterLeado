package com.example.leado.couseActivities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.couseActivities.Lesson2Directions
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_lesson2.*


class Lesson2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn2.setOnClickListener {
            findNavController().navigate(Lesson2Directions.actionLesson2ToLesson3())
        }
        takeQuiz1.setOnClickListener {
            findNavController().navigate(Lesson2Directions.actionLesson2ToQuiz1())
        }
    }
}