package com.example.leado.viewModels

import com.example.leado.LessonItemClass
import com.example.leado.repositories.LessonsDataRepo

class LessonsDataViewModel {
    fun getLessonsData():ArrayList<LessonItemClass>{
        return LessonsDataRepo.getfakedata()
    }
}