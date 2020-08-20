package com.example.leado.couse3Activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import com.example.leado.couse2Activities.Quiz1_2Directions
import kotlinx.android.synthetic.main.fragment_quiz1_3.*
import kotlinx.android.synthetic.main.fragment_quiz_1.*
import kotlinx.android.synthetic.main.fragment_quiz_1.close_imageBtnQuiz1
import kotlinx.android.synthetic.main.fragment_quiz_1.quiz1AnswerOne_textView


class Quiz1_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz1_3, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        close_imageBtnQuiz1.setOnClickListener {
            findNavController().navigate(Quiz1_3Directions.actionQuiz13ToLesson33())
        }
        quiz1AnswerOne_textView.setOnClickListener {

        }
    }
}