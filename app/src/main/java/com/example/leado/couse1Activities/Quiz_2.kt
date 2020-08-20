package com.example.leado.couse1Activities

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_quiz_2.*
import kotlinx.android.synthetic.main.quiz_dialog.view.*


class Quiz_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        close_imageBtnQuiz2.setOnClickListener {
            findNavController().navigate(Quiz_2Directions.actionQuiz2ToRefrence())
        }
        microphone.setOnClickListener {
            val Dialog = LayoutInflater.from(activity).inflate(R.layout.quiz_dialog, null)
            val builder = AlertDialog.Builder(activity)
            builder.setView(Dialog)
            val alertdialog = builder.show()
            Dialog.agree_btn.setOnClickListener {

            }
            Dialog.cancel_btn.setOnClickListener {
                alertdialog.dismiss()
            }
            quiz2AnswerOne_textView.setOnClickListener{

            }
        }
    }
}