package com.example.leado.couse3Activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import com.example.leado.couse2Activities.Lesson2_2Directions
import kotlinx.android.synthetic.main.fragment_lesson2_2.*
import kotlinx.android.synthetic.main.fragment_lesson4_3.*

class Lesson4_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lesson4_3, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        next_btn4.setOnClickListener {
            findNavController().navigate(Lesson4_3Directions.actionLesson43ToRefrence3())
        }
        takeQuiz2.setOnClickListener {
            findNavController().navigate(Lesson4_3Directions.actionLesson43ToQuiz23())
        }
}
}