package com.example.leado.couse2Activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_lesson4_2.*


class Lesson4_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson4_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn4.setOnClickListener {
            findNavController().navigate(Lesson4_2Directions.actionLesson422ToRefrence22())
        }
        takeQuiz2.setOnClickListener {
            findNavController().navigate(Lesson4_2Directions.actionLesson422ToQuiz222())
        }
    }
}
