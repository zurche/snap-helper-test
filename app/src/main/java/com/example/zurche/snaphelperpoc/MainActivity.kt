package com.example.zurche.snaphelperpoc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = arrayOf("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18")

        first_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        first_recycler.adapter = MyAdapter(myDataset)
        LinearSnapHelper().attachToRecyclerView(first_recycler)

        second_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        second_recycler.adapter = MyAdapterWithFixedSize(myDataset)
        LinearSnapHelper().attachToRecyclerView(second_recycler)

        third_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        third_recycler.adapter = MyAdapter(myDataset)
        PagerSnapHelper().attachToRecyclerView(third_recycler)

        fourth_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        fourth_recycler.adapter = MyAdapterWithFixedSize(myDataset)
        StartSnapHelper().attachToRecyclerView(fourth_recycler)
    }
}

