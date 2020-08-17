package com.example.leado.viewModels

import androidx.lifecycle.ViewModel
import com.example.leado.model.ItemAdapter
import com.example.leado.repositories.AchievementsRepo

class AchievementsViewModel : ViewModel() {

    fun getAchievementsDataList(): ArrayList<ItemAdapter> {
        return AchievementsRepo.getAchievementsList()
    }

    fun sortList(): ArrayList<ItemAdapter> {

        val achievementsViewModel:AchievementsViewModel= AchievementsViewModel()
        val list = achievementsViewModel.getAchievementsDataList()
        lateinit var item: ItemAdapter

        for (i in 0 until ((list.size) - 1))
            for (i in 0 until ((list.size) - 1)) {

                var Intf = list[i].points.replace(",", "").toInt()
                var Ints = list[i + 1].points.replace(",", "").toInt()

                if (Intf < Ints) {
                    item = list[i + 1]
                    list[i + 1] = list[i]
                    list[i] = item
                }
            }
        return list
    }
}