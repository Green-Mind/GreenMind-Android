package com.project.greenmind.homeFragment.home_result_rv

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.greenmind.R
import kotlinx.android.synthetic.main.rv_item_result.view.*

class ResultViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val date : TextView=view.findViewById(R.id.rv_date)

    fun bind(data:ResultItem){
        date.text=data.resultDate
    }
}