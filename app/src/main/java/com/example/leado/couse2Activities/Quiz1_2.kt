package com.example.leado.couse2Activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_quiz_1.*

class Quiz1_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz1_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        close_imageBtnQuiz1.setOnClickListener {
            findNavController().navigate(Quiz1_2Directions.actionQuiz122ToLesson322())
        }
        quiz1AnswerOne_textView.setOnClickListener {

        }
    }
}