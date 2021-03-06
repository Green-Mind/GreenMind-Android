package com.project.greenmind.homeFragment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.project.greenmind.R
import com.project.greenmind.homeFragment.test_views.LastTestActivity
import kotlinx.android.synthetic.main.graph_result.*

class fake_result  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph_result)

        btn_last.setOnClickListener {
            finish()
        }

        //Part1
        val entries = ArrayList<Entry>()
        val entries1 =ArrayList<Entry>()

        //Part2
        entries.add(Entry(1f, 10f))
        entries.add(Entry(2f, 2f))
        entries.add(Entry(3f, 7f))
        entries.add(Entry(4f, 20f))

        //Part2
        entries1.add(Entry(1f, 1f))
        entries1.add(Entry(2f, 12f))
        entries1.add(Entry(3f, 10f))
        entries1.add(Entry(4f, 4f))

        //Part3
        val vl = LineDataSet(entries, "My Type")
        val va = LineDataSet(entries, "Your Type")

        //Part4
        vl.setDrawValues(false)
        vl.setDrawFilled(true)
        vl.lineWidth = 3f
        //vl.fillColor = R.color.gray
        //vl.fillAlpha = R.color.red

        va.setDrawValues(false)
        va.setDrawFilled(true)
        va.lineWidth = 3f

        //Part5
        lineChart.xAxis.labelRotationAngle = 0f

        //Part6
        lineChart.data = LineData(vl)
        lineChart.data = LineData(va)


        //Part7
        lineChart.axisRight.isEnabled = false
        //lineChart.xAxis.axisMaximum = j+0.1f

        //Part8
        lineChart.setTouchEnabled(true)
        lineChart.setPinchZoom(true)

        //Part9
        lineChart.description.text = "항목별 분석"
        lineChart.setNoDataText("No forex yet!")

        //Part10
        lineChart.animateX(1800, Easing.EaseInExpo)

        //Part11
        //val markerView = CustomMarker(this@ShowForexActivity, R.layout.activity_graph_prac)
        //val markerView = MarkerView(R.layout.activity_graph_prac)
        //lineChart.marker = markerView
    }

}
