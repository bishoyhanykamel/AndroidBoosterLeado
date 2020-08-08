package com.example.leado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
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
        achievementsRecycler.adapter =
            ListAdapter(achievementsViewModel.getAchievementsDataList(), activity)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
      //  findNavController().navigate(Achievements_Directions.actionAchievementsToProfileFragment())

    }


    //  override fun onActivityCreated(savedInstanceState: Bundle?) {
    //    super.onActivityCreated(savedInstanceState)
    // init();
    //   addList()
    //  adapter()
}


//  private void init() {
//    mRecycleview = achievementslistview.findViewById(R.id.achievementsListView); }
//  private fun adapter() {
// Log.d("anhtt", "mlist : " + mList.size())
// mAdapter = ListAdapter(mList, activity)
//  mRecycleview!!.adapter = mAdapter
//  mRecycleview.layoutManager = LinearLayoutManager(activity)
//  mAdapter!!.notifyDataSetChanged()
//} }