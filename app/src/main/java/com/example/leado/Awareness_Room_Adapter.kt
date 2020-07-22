package com.example.leado

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.self_awareness_item.view.*

class AwarnessRoomAdapter(val itemlist: List<SelfAwarnessItemClass>) :
    RecyclerView.Adapter<AwarnessRoomAdapter.SelfAwarnessItemViewHolder>() {


    inner class SelfAwarnessItemViewHolder(SelfAwarnessItemView: View) :
        RecyclerView.ViewHolder(SelfAwarnessItemView) {
        val itemtitle: TextView = SelfAwarnessItemView.TitleText
        val lesson: TextView = SelfAwarnessItemView.Lesson
        val lessonText: TextView = SelfAwarnessItemView.lessonText
        val itembutton: Button = SelfAwarnessItemView.ItemButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfAwarnessItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SelfAwarnessItemViewHolder(
            layoutInflater.inflate(R.layout.self_awareness_item, parent, false))
    }

    override fun onBindViewHolder(holder: SelfAwarnessItemViewHolder, position: Int) {
        val SelfAwarnessItemClass: SelfAwarnessItemClass = itemlist.get(position)
        holder.itemtitle.text = SelfAwarnessItemClass.litle
        holder.lesson.text = SelfAwarnessItemClass.lesson
        holder.lessonText.text = SelfAwarnessItemClass.lessonText
        holder.itembutton.text=SelfAwarnessItemClass.buttonText
        holder.itembutton.setBackgroundResource(R.drawable.start_button)
        if(position>0)
        holder.itembutton.setBackgroundResource(R.drawable.lock_button)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }
}