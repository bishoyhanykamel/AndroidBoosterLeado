package com.example.leado

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.leado.adapter.AwarnessRoomAdapter
import com.example.leado.couseActivities.VideoActivity
import com.example.leado.viewModels.LessonsDataViewModel
import kotlinx.android.synthetic.main.activity_awareness_room.*

class AwarenessRoom : AppCompatActivity() {

    val lessonsDataViewModel: LessonsDataViewModel = LessonsDataViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)


        val LessonName: String? = getIntent().getStringExtra("lessonName")
        val click: String? = getIntent().getStringExtra("click")

        if (LessonName == "Awareness Room")
            main_recyclerview.adapter = AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataAwareness())
        else if (LessonName == "mind mapping") {

            main_recyclerview.adapter = AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataMind())
            second.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
            checked1.visibility = View.VISIBLE
            coreValue.setOnClickListener {
                info1.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
                info1.layoutParams.width = 85
                info1.layoutParams.height = 162
                coreValue.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
                coreValue.setTextColor(Color.parseColor("#000000"))
            }

        } else {
            main_recyclerview.adapter = AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataBranding())
            info1.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
            info1.layoutParams.width = 85
            info1.layoutParams.height = 162
            second.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
            third.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
            checked1.visibility = View.VISIBLE
            checked2.visibility = View.VISIBLE
            coreValue.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
            coreValue.setTextColor(Color.parseColor("#000000"))
            Strenth_Weakness.setOnClickListener {
                info2.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
                info2.layoutParams.width = 85
                info2.layoutParams.height = 162
                Strenth_Weakness.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
                Strenth_Weakness.setTextColor(Color.parseColor("#000000"))
            }
            if (click == "three") {
                main_recyclerview.adapter =
                    AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataBranding())
                info2.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_three_vector)
                second.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                third.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                fourth.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                info2.layoutParams.width = 85
                info2.layoutParams.height = 162
                checked1.visibility = View.VISIBLE
                checked2.visibility = View.VISIBLE
                checked3.visibility = View.VISIBLE
                coreValue.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
                coreValue.setTextColor(Color.parseColor("#000000"))
                Strenth_Weakness.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
                Strenth_Weakness.setTextColor(Color.parseColor("#000000"))
                GoalsAspiration.setOnClickListener {
                    info3.background = ContextCompat.getDrawable(this, R.drawable.ic_lesson_four)
                    info3.layoutParams.width = 85
                    info3.layoutParams.height = 162
                    GoalsAspiration.background = ContextCompat.getDrawable(this, R.drawable.rectangle_3)
                    GoalsAspiration.setTextColor(Color.parseColor("#000000"))
                }
            }
            lesson1btn.setOnClickListener {
                val intent = Intent(
                    this,
                    VideoActivity::class.java
                )
                startActivity(intent)
            }

        }
    }
}

