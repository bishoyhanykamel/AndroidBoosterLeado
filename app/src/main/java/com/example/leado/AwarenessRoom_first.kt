package com.example.leado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leado.adapter.AwarnessRoomFirstAdapter
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room_first.*

class AwarenessRoom_first : AppCompatActivity() {

    val lessonsDataViewModel: LessonsDataViewModel = LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room_first)

        main_recyclerview.adapter = AwarnessRoomFirstAdapter(lessonsDataViewModel.getLessonsDataAwareness())

    }
}