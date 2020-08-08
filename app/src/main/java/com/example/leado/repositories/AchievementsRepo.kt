package com.example.leado.repositories

import com.example.leado.R
import com.example.leado.model.ItemAdapter
import java.util.*

object AchievementsRepo {


     fun getAchievementsList(): ArrayList<ItemAdapter> {

        val mList: ArrayList<ItemAdapter> = ArrayList()

        var itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Person"
        mList.add(itemAdapter)

        return mList
    }

}