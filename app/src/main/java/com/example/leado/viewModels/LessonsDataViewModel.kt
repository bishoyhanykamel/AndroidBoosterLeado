package com.example.leado.viewModels

import com.example.leado.LessonItemClass
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