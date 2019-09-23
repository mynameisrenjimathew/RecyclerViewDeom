package com.renzam.recyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    lateinit var adapter: AdapterRecycer

    lateinit var modelList: MutableList<model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        modelList = ArrayList()

        recyclerView = findViewById(R.id.recyclerview)
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))
        modelList.add(model("dsdsd"))


        adapter = AdapterRecycer(modelList, this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}
