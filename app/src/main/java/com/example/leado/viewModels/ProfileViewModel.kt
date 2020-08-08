package com.example.leado.viewModels

import com.example.leado.repositories.ProfileRepo.getProfileFakeData
import com.example.leado.skillitem

class ProfileViewModel {

    fun getprofileData() : ArrayList<skillitem>{
        return getProfileFakeData()
    }
}