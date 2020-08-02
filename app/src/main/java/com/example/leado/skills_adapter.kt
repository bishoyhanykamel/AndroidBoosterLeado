package com.example.leado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile_items.view.*
import java.util.zip.Inflater

class skillAdapter (val skillList:List<skillitem>): RecyclerView.Adapter<skillAdapter.skillViewHolder>() {


    inner class skillViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val skill = view.skill
        val skilldes = view.completion
        val skillImage = view.skillimage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): skillViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return skillViewHolder(layoutInflater.inflate(R.layout.profile_items, parent, false))
    }

    override fun onBindViewHolder(holder: skillViewHolder, position: Int) {
       val skilllist : skillitem = skillList.get(position)
        holder.skill.text = skilllist.Skill
        holder.skilldes.text=skilllist.SkillDes
        holder.skillImage.setImageResource(skilllist.Image)
    }
    override fun getItemCount(): Int {
        return skillList.size
    }

}


