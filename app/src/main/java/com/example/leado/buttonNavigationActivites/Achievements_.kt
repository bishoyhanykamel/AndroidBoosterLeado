package com.example.leado.buttonNavigationActivites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.adapter.ListAdapter
import com.example.leado.R
import com.example.leado.viewModels.AchievementsViewModel
import kotlinx.android.synthetic.main.fragment_achievements_.*

class Achievements_ : Fragment() {
    private val achievementsViewModel: AchievementsViewModel by viewModels()
    private val mRecycleview: RecyclerView? = null
    private var mAdapter: ListAdapter? = null
    private val v: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_achievements_, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        achievementsRecycler.adapter = ListAdapter(achievementsViewModel.sortList(), activity)
        achievementsbackbtn.setOnClickListener {
            findNavController().navigate(Achievements_Directions.actionAchievementsToNavigationHome())
        }

    }

}