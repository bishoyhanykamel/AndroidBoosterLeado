package com.example.leado

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.leado.adapter.AwarnessRoomSecAdapter
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room_second.*

class AwarenessRoom_second : AppCompatActivity() {

    val lessonsDataViewModel:LessonsDataViewModel= LessonsDataViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room_second)

        main_recyclerview.adapter = AwarnessRoomSecAdapter(lessonsDataViewModel.getLessonsDataMind())

        coreValue.setOnClickListener {
            info1.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson2)
            info1.layoutParams.width = 85
            info1.layoutParams.height= 162
            coreValue.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
            coreValue.setTextColor(Color.parseColor("#000000"))
        }
    }
}