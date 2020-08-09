package com.example.leado

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.self_awareness_item.*

class AwarenessRoom : AppCompatActivity() {

    val lessonsDataViewModel:LessonsDataViewModel= LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        val intent = intent

        main_recyclerview.adapter = AwarnessRoomAdapter(lessonsDataViewModel.getLessonsData())

        LessonName.text = getIntent().getStringExtra("lessonName")
        LessonNameRecycler.text=getIntent().getStringExtra("lessonNameRecycler")

    }


}