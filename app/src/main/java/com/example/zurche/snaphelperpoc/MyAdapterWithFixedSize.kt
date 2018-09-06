package com.example.zurche.snaphelperpoc

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class MyAdapterWithFixedSize(private val myDataset: Array<String>) :
        RecyclerView.Adapter<MyAdapterWithFixedSize.MyViewHolder>() {

    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapterWithFixedSize.MyViewHolder {
        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.my_text_view_with_fixed_size, parent, false) as TextView

        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = myDataset[position]
    }

    override fun getItemCount() = myDataset.size
}