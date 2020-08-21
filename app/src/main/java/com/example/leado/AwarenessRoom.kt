package com.example.leado

import android.content.Intent
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
        val LessonNameRecycler: String? = getIntent().getStringExtra("lessonNameRecycler")
      //  val click: Int =

            if (LessonName == "Awareness Room")

                main_recyclerview.adapter =
                    AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataAwareness())
            else if (LessonName == "mind mapping") {

                main_recyclerview.adapter =
                    AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataMind())
                second.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                checked1.visibility = View.VISIBLE
                coreValue.setOnClickListener {

                }

            } else {
                main_recyclerview.adapter =
                    AwarnessRoomAdapter(lessonsDataViewModel.getLessonsDataBranding())
                second.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                third.background = ContextCompat.getDrawable(this, R.drawable.rectangle)
                checked1.visibility = View.VISIBLE
                checked2.visibility = View.VISIBLE
                checked3.visibility = View.VISIBLE
                Strenth_Weakness.setOnClickListener {

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