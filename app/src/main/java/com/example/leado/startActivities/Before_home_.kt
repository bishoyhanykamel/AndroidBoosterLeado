package com.example.leado.startActivities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.startActivities.Before_home_Directions
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_before_home_.*


class Before_home_ : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_before_home_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mindMappingBtnbflogin.setOnClickListener {
            findNavController().navigate(Before_home_Directions.actionBeforeHomeToLogin())
        }
        selfAwarenessBtnbeforelogin.setOnClickListener {
            findNavController().navigate(Before_home_Directions.actionBeforeHomeToLogin())
        }
        personal_BrandingBtnbflogin.setOnClickListener {
            findNavController().navigate(Before_home_Directions.actionBeforeHomeToLogin())
        }
    }

}
