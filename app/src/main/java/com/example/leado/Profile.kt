package com.example.leado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profileRecycler.adapter = skillAdapter(getProfileFakeData())
    }

    fun getProfileFakeData(): ArrayList<skillitem> {
        val profileSkillList:ArrayList<skillitem> = ArrayList()

        profileSkillList.add(skillitem("Quick Learner","Completed 1 course",R.drawable.icon2))
        profileSkillList.add(skillitem("Master Mind!","Got 1st place on leaderboard",R.drawable.icon1))
        profileSkillList.add(skillitem("Super Learner","Completed more than 5 courses",R.drawable.icon3))
        profileSkillList.add(skillitem("Quick Learner","Logged in everyday for a moth",R.drawable.icon))

        return profileSkillList
    }
}