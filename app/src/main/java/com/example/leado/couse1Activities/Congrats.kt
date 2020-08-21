package com.example.leado.couse1Activities

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.leado.AwarenessRoom_first
import com.example.leado.AwarenessRoom_second
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_achievements_.*
import kotlinx.android.synthetic.main.fragment_congrats.*

class Congrats : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_congrats, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        claim_Your_Gift.setOnClickListener {
            val intent:Intent=Intent(activity,AwarenessRoom_second::class.java)
           activity?.startActivity(intent)
        }
        AchievementsBtn.setOnClickListener {
            findNavController().navigate(CongratsDirections.actionCongrats2ToAchievements2())
        }
    }
}