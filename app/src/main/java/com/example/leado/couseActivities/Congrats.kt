package com.example.leado.couseActivities

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.leado.AwarenessRoom
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_congrats.*

var click: Int = 0

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
        click++
        System.out.println("# " + click)
        ClaimGift.setOnClickListener {

            if (click == 1) {
                val intent: Intent = Intent(activity, AwarenessRoom::class.java)
                intent.putExtra("lessonName", "mind mapping")
               // intent.putExtra("lessonNameRecycler", "mind mapping")
                getActivity()?.startActivity(intent)

            } else {
                val intent = Intent(getActivity(), AwarenessRoom::class.java)
                intent.putExtra("lessonName", "personal-Branding")
               // intent.putExtra("lessonNameRecycler", "personal-Branding")
                getActivity()?.startActivity(intent)
            }
            if(click==3){
                val intent = Intent(getActivity(), AwarenessRoom::class.java)
                intent.putExtra("click", "three")
                // intent.putExtra("lessonNameRecycler", "personal-Branding")
                getActivity()?.startActivity(intent)
            }

        }
    }
}
