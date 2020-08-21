package com.example.leado.couse2Activities

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.AwarenessRoom_second
import com.example.leado.AwarenessRoom_third
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_congrats_2.*


class Congrats_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_congrats_2, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        claim_Your_Gift.setOnClickListener {
            val intent:Intent=Intent(activity, AwarenessRoom_third::class.java)
            activity?.startActivity(intent)
        }
        AchievementsBtn.setOnClickListener {
            findNavController().navigate(Congrats_2Directions.actionCongrats2ToAchievements4())
        }
        imageButton.setOnClickListener {
            findNavController().navigate(Congrats_2Directions.actionCongrats2ToShare3())
        }
    }
}