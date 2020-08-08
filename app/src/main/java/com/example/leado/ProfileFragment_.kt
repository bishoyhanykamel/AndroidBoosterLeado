package com.example.leado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.leado.repositories.profileSkillsRepo
import kotlinx.android.synthetic.main.fragment_profile_.*

class ProfileFragment_ : Fragment() {

    private val ProfileViewModel: profileViewModel by viewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_, container, false)
        profileRecycler.adapter = skillAdapter(ProfileViewModel.getProfiledata())
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       // findNavController().navigate(Profile)
    }


    fun getProfileFakeData(): ArrayList<skillitem> {

        val profileSkillList: ArrayList<skillitem> = ArrayList()


        profileSkillList.add(skillitem("Quick Learner", "Completed 1 course", R.drawable.icon2))
        profileSkillList.add(skillitem("Master Mind!", "Got 1st place on leaderboard", R.drawable.icon1))
        profileSkillList.add(skillitem("Super Learner", "Completed more than 5 courses", R.drawable.icon3))
        profileSkillList.add(skillitem("Quick Learner", "Logged in everyday for a moth", R.drawable.icon))

        return profileSkillList
    }
}










/*inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?
   ): View? {
       notificationsViewModel =
           ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
       val root = inflater.inflate(R.layout.fragment_profile, container, false)
      // val textView: TextView = root.findViewById(R.id.text_notifications)
       notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
      //     textView.text = it
       })
       return root
   }*/