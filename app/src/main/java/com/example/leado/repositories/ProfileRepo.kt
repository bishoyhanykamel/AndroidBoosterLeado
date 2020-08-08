package com.example.leado.repositories

import com.example.leado.R
import com.example.leado.skillitem

object ProfileRepo {

    fun getProfileFakeData(): ArrayList<skillitem> {

        val profileSkillList: ArrayList<skillitem> = ArrayList()

        profileSkillList.add(skillitem("Quick Learner", "Completed 1 course", R.drawable.icon2))
        profileSkillList.add(skillitem("Master Mind!", "Got 1st place on leaderboard", R.drawable.icon1))
        profileSkillList.add(skillitem("Super Learner", "Completed more than 5 courses", R.drawable.icon3))
        profileSkillList.add(skillitem("Quick Learner", "Logged in everyday for a moth", R.drawable.icon))

        return profileSkillList
    }
}