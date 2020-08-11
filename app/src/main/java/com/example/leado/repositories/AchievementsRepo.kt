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
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Emilly"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Ali"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Sally"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "Watson"
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "sara"
        mList.add(itemAdapter)
        mList.add(itemAdapter)
        itemAdapter = ItemAdapter()
        itemAdapter.image = R.drawable.person
        itemAdapter.text = "selim"
        mList.add(itemAdapter)

        return mList
    }

}