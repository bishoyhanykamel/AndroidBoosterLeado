package com.example.leado.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.couse3Activities.VideoActivity3
import com.example.leado.model.LessonItemClass
import kotlinx.android.synthetic.main.self_awareness_item.view.*

class AwarnessRoomfourthAdapter(val itemlist: List<LessonItemClass>) : RecyclerView.Adapter<AwarnessRoomfourthAdapter.SelfAwarnessItemViewHolder>() {


    inner class SelfAwarnessItemViewHolder(SelfAwarnessItemView: View) : RecyclerView.ViewHolder(SelfAwarnessItemView) {
        val itemtitle: TextView = SelfAwarnessItemView.TitleText
        val lesson: TextView = SelfAwarnessItemView.Lesson
        val lessonText: TextView = SelfAwarnessItemView.lessonText
        val itembutton: Button = SelfAwarnessItemView.startButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfAwarnessItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SelfAwarnessItemViewHolder(layoutInflater.inflate(R.layout.self_awareness_item, parent, false))
    }

    override fun onBindViewHolder(holder: SelfAwarnessItemViewHolder, position: Int) {
        val lessonItemClass: LessonItemClass = itemlist.get(position)
        holder.itemtitle.text = lessonItemClass.litle
        holder.lesson.text = lessonItemClass.lesson
        holder.lessonText.text = lessonItemClass.lessonText
        holder.itembutton.text=lessonItemClass.buttonText
        holder.itembutton.setBackgroundResource(R.drawable.lock_button)
        if(position==0){
            holder.itembutton.setBackgroundResource(R.drawable.start_button)
            val context: Context = holder.itemView.context
            holder.itembutton.setOnClickListener {
                val intent: Intent = Intent(context, VideoActivity3::class.java)
                context.startActivity(intent)}
        }

    }

    override fun getItemCount(): Int {
        return itemlist.size
    }
}