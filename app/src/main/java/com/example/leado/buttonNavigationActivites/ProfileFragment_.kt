package com.example.leado.buttonNavigationActivites

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leado.R
import com.example.leado.adapter.skillAdapter
import com.example.leado.viewModels.ProfileViewModel
import kotlinx.android.synthetic.main.fragment_profile_.*

class ProfileFragment_ : Fragment() {

    val profileViewModel: ProfileViewModel =
        ProfileViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_, container, false)

        val preferences = this.activity?.getSharedPreferences("pref", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preferences!!.edit()
        editor.putString("name", prof_name.text.toString())
        editor.putString("courses", prof_courses.text.toString())
        editor.putString("rank", prof_rank.text.toString())
        editor.apply()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        profileRecycler.adapter =
            skillAdapter(profileViewModel.getprofileData())
        profilebackbtn.setOnClickListener {
            findNavController().navigate(ProfileFragment_Directions.actionProfileFragmentToAchievements())
        }

    }

    fun plus25Points() {
        var pointsInInt: Int = prof_points.text.toString().toInt()
        pointsInInt += 25
        prof_points.text = pointsInInt.toString()
    }
    fun plus50Points() {
        var pointsInInt: Int = prof_points.text.toString().toInt()
        pointsInInt += 50
        prof_points.text = pointsInInt.toString()
    }
}
