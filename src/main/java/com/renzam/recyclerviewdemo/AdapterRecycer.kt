package com.renzam.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import java.util.ArrayList

class AdapterRecycer(internal var modelList: List<model>, internal var context: Context) : RecyclerView.Adapter<AdapterRecycer.ViewHolder>() {
    //    public AdapterRecycer(List<model> modelList) {
    //        this.modelList = modelList;
    //    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_items, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.textView.text = modelList[i].messege

    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var textView: TextView


        init {

            textView = itemView.findViewById(R.id.textView)


        }
    }
}
