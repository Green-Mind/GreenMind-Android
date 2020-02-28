package com.project.greenmind.homeFragment.home_result_rv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.greenmind.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class ResultAdapter (private val context: Context) : RecyclerView.Adapter<ResultViewHolder>(){

    var data = listOf<ResultItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_result, parent, false)

        return ResultViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.bind(data[position])
    }
}