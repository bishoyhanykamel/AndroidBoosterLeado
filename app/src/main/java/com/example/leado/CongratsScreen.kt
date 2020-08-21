package com.example.leado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.R
import kotlinx.android.synthetic.main.activity_congrats_screen.*

class CongratsScreen : AppCompatActivity() {
    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_screen)

      claim_Your_Gift.setOnClickListener {
        //  val intent:Intent=Intent(this,AwarenessRoom::class.java)
          intent.putExtra("lessonName", "mind mapping")
          intent.putExtra("lessonNameRecycler", "mind mapping")
          startActivity(intent)
      }

        }
    }
