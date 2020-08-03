package com.example.leado

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_awareness_room.*
import kotlinx.android.synthetic.main.self_awareness_item.*

class AwarenessRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awareness_room)

        main_recyclerview.adapter = AwarnessRoomAdapter(getfakedata())
    }

    fun getfakedata(): ArrayList<SelfAwarnessItemClass> {
        var selfawarness: ArrayList<SelfAwarnessItemClass> = ArrayList()
        selfawarness.add(
            SelfAwarnessItemClass(
                "Support Systems", "Lesson 1", "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","start"))
        selfawarness.add(
            SelfAwarnessItemClass(
                "Support Systems", "Lesson 1", "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Lock"))
        selfawarness.add(
            SelfAwarnessItemClass(
                "Support Systems", "Lesson 1", "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas","Lock"))

        return selfawarness
    }
}