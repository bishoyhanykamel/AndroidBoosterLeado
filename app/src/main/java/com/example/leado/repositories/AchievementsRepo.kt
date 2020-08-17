package com.example.leado.repositories

import com.example.leado.R
import com.example.leado.model.ItemAdapter
import java.util.*

object AchievementsRepo {


     fun getAchievementsList(): ArrayList<ItemAdapter> {

        val mList: ArrayList<ItemAdapter> = ArrayList()

        var itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Hanna"
        itemAdapter.points="156,544"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Emilly"
        itemAdapter.points="160,000"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Ali"
        itemAdapter.points="200,000"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Sally"
        itemAdapter.points="133,500"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Watson"
        itemAdapter.points="250,000"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "sara"
        itemAdapter.points="145,000"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "selim"
        itemAdapter.points="123,300"
        mList.add(itemAdapter)

        return mList
    }

}