package com.example.leado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leado.couseActivities.VideoActivity
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*

class AwarenessRoom : AppCompatActivity() {

    val lessonsDataViewModel:LessonsDataViewModel= LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        val intent = intent

        main_recyclerview.adapter = AwarnessRoomAdapter(lessonsDataViewModel.getLessonsData())

        LessonName.text = getIntent().getStringExtra("lessonName")
        LessonNameRecycler.text=getIntent().getStringExtra("lessonNameRecycler")

        lesson1btn.setOnClickListener {
            val intent=Intent(this,
                VideoActivity::class.java)
            startActivity(intent)
        }

    }


}