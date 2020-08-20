package com.example.leado.couse2Activities

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import com.example.leado.couse1Activities.Quiz_2Directions
import kotlinx.android.synthetic.main.fragment_quiz2_2.*
import kotlinx.android.synthetic.main.fragment_quiz_2.*
import kotlinx.android.synthetic.main.fragment_quiz_2.close_imageBtnQuiz2
import kotlinx.android.synthetic.main.fragment_quiz_2.microphone
import kotlinx.android.synthetic.main.fragment_quiz_2.quiz2AnswerOne_textView
import kotlinx.android.synthetic.main.quiz_dialog.view.*

class Quiz2_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz2_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        close_imageBtnQuiz2.setOnClickListener {
            findNavController().navigate(Quiz2_2Directions.actionQuiz222ToRefrence22())
        }
        microphone2.setOnClickListener {
            val Dialog = LayoutInflater.from(activity).inflate(R.layout.quiz_dialog, null)
            val builder = AlertDialog.Builder(activity)
            builder.setView(Dialog)
            val alertdialog = builder.show()
            Dialog.agree_btn.setOnClickListener {

            }
            Dialog.cancel_btn.setOnClickListener {
                alertdialog.dismiss()
            }
            quiz2AnswerOne_textView.setOnClickListener {

            }
        }
    }
}