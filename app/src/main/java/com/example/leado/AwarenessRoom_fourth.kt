package com.example.leado

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.leado.adapter.AwarnessRoomfourthAdapter
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room_fourth.*

class AwarenessRoom_fourth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room_fourth)

        val lessonsDataViewModel:LessonsDataViewModel= LessonsDataViewModel()

       // main_recyclerview.adapter = AwarnessRoomfourthAdapter(lessonsDataViewModel.getLessonsDataMind())

        GoalsAspiration.setOnClickListener {
            info3.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
            info3.layoutParams.width = 85
            info3.layoutParams.height= 162
            GoalsAspiration.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
            GoalsAspiration.setTextColor(Color.parseColor("#000000"))
        }
        claim_Your_Gift.setOnClickListener {
            checked4.visibility= View.VISIBLE
        }

    }
}