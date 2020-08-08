package com.example.leado

import androidx.lifecycle.ViewModel
import com.example.leado.repositories.profileSkillsRepo
import com.example.leado.skillitem

class profileViewModel : ViewModel() {

    fun getProfiledata(): ArrayList<skillitem> {
        return profileSkillsRepo.getProfileFakeData()
    }
    //  private val _text = MutableLiveData<String>().apply { //   value = "This is notifications Fragment"
    // }
    // val text: LiveData<String> = _text


}