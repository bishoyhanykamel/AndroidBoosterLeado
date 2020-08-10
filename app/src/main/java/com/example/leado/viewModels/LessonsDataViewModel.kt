package com.example.leado.viewModels

import com.example.leado.model.LessonItemClass
import com.example.leado.repositories.LessonsDataRepo

class LessonsDataViewModel {
    fun getLessonsDataAwareness(): ArrayList<LessonItemClass> {
        return LessonsDataRepo.getfakedataAwareness()
    }

    fun getLessonsDataMind(): ArrayList<LessonItemClass> {
        return LessonsDataRepo.getfakedataMind()
    }
    fun getLessonsDataBranding(): ArrayList<LessonItemClass> {
        return LessonsDataRepo.getfakedataBranding()
    }
}