package com.example.leado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        profileRecycler.adapter = skillAdapter(profileViewModel.getprofileData())
        profilebackbtn.setOnClickListener {
            findNavController().navigate(ProfileFragment_Directions.actionProfileFragmentToAchievements())
        }
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