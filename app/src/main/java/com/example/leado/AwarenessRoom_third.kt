package com.example.leado

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.leado.adapter.AwarnessRoomThirdAdapter
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room_third.*

class AwarenessRoom_third : AppCompatActivity() {

    val lessonsDataViewModel: LessonsDataViewModel = LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room_third)

        main_recyclerview.adapter = AwarnessRoomThirdAdapter(lessonsDataViewModel.getLessonsDataBranding())

        Strenth_Weakness.setOnClickListener {
            info2.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
            info2.layoutParams.width = 85
            info2.layoutParams.height= 162
            Strenth_Weakness.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
            Strenth_Weakness.setTextColor(Color.parseColor("#000000"))
        }

    }
}