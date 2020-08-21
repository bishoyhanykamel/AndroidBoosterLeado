package com.example.leado.buttonNavigationActivites

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.leado.AwarenessRoom
import com.example.leado.R
import com.example.leado.viewModels.HomeViewModel
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val lessonsDataViewModel = LessonsDataViewModel()

        selfAwarenessBtn.setOnClickListener {
            val intent = Intent(getActivity(), AwarenessRoom::class.java)
            intent.putExtra("lessonName", "Awareness Room")
         //   intent.putExtra("lessonNameRecycler", "Self-Awareness")
            getActivity()?.startActivity(intent)

        }
     /*   mindMappingBtn.setOnClickListener {
            val intent = Intent(getActivity(), AwarenessRoom::class.java)
            intent.putExtra("lessonName", "mind mapping")
            intent.putExtra("lessonNameRecycler", "mind mapping")
            getActivity()?.startActivity(intent)
            //   intent.putExtra("lessonName",)
        }
        personal_BrandingBtn.setOnClickListener {
            val intent = Intent(getActivity(), AwarenessRoom::class.java)
            intent.putExtra("lessonName", "personal-Branding")
            intent.putExtra("lessonNameRecycler", "personal-Branding")
            getActivity()?.startActivity(intent)
            //   intent.putExtra("lessonName",)
        }
*/
    }

}