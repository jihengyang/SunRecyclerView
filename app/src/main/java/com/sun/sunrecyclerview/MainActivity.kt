package com.sun.sunrecyclerview

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.recyclerview).run {
            layoutManager = LinearLayoutManager(context)
            adapter = object : RecyclerView.Adapter<SunViewHolder>() {
                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SunViewHolder {
                    return SunViewHolder(TextView(context).apply {
                        text = "1"
                        minHeight = 100
                        textSize = 20f
                    })
                }

                override fun onBindViewHolder(holder: SunViewHolder, position: Int) {
                    (holder.itemView as TextView).text = position.toString()
                }

                override fun getItemCount() = 100
            }
        }
    }
}

class SunViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)