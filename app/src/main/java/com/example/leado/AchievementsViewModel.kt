package com.example.leado

import androidx.lifecycle.ViewModel
import com.example.leado.model.ItemAdapter
import com.example.leado.repositories.AchievementsRepo

class AchievementsViewModel : ViewModel() {

    fun getAchievementsDataList():ArrayList<ItemAdapter> {
        return AchievementsRepo.getAchievementsList()
    }

}