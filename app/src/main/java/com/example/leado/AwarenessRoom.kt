package com.example.leado

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.adapter.AwarnessRoomAdapter
import com.example.leado.couseActivities.VideoActivity
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*

class AwarenessRoom : AppCompatActivity() {

    val lessonsDataViewModel: LessonsDataViewModel = LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)


        LessonName.text = getIntent().getStringExtra("lessonName")
        LessonNameRecycler.text = getIntent().getStringExtra("lessonNameRecycler")


        if (LessonName.text == "Awareness Room")
            main_recyclerview.adapter =
                AwarnessRoomAdapter(
                    lessonsDataViewModel.getLessonsDataAwareness()
                )
        else if (LessonName.text == "mind mapping")
            main_recyclerview.adapter =
                AwarnessRoomAdapter(
                    lessonsDataViewModel.getLessonsDataMind()
                )
        else
            main_recyclerview.adapter =
                AwarnessRoomAdapter(
                    lessonsDataViewModel.getLessonsDataBranding()
                )

        lesson1btn.setOnClickListener {
            val intent = Intent(
                this,
                VideoActivity::class.java
            )
            startActivity(intent)
        }

    }


}