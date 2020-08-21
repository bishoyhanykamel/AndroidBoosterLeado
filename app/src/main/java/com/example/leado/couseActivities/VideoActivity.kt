package com.example.leado.couseActivities

import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_lesson1.*
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.R


class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val LessonName: String? = getIntent().getStringExtra("lessonName")
        System.out.println("#"+LessonName)
        if(LessonName=="mind mapping"){

        }
    }
}