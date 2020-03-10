package com.example.recyclerviewaddlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count =1

    var modelList: ArrayList<ModelClass>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        modelList = ArrayList<ModelClass>()
        modelList!!.add(ModelClass(count))


        rv.layoutManager = LinearLayoutManager(this)
        val customAdapter = CustomAdapter(modelList!!)
        rv.adapter = customAdapter


        btn_add.setOnClickListener {
           count =  count++
            modelList!!.add(ModelClass(count))
            customAdapter.notifyDataSetChanged()
        }
    }
}
