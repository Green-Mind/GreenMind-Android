package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test3.*
import kotlinx.android.synthetic.main.graph_result.*
import kotlin.concurrent.thread

class GraphResult  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph_result)

        btn_last.setOnClickListener {
            val intent = Intent(this, LastTestActivity::class.java)
            startActivityForResult(intent,6000)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 6000) {
            finish()
        }
    }

    private fun setChart() {
        val xAxis = lineChart.xAxis // x축 가져오기

        xAxis.apply {
            position = XAxis.XAxisPosition.BOTTOM // x축 데이터의 위치를 아래로
            textSize = 10f // 텍스트 크기 지정 (float형으로 해줌)
            setDrawGridLines(false) // 배경 그리드 라인 세팅
            granularity = 1f // x축 데이터 표시 간격
            axisMaximum = 2f // x축 데이터의 최소 표시값
            isGranularityEnabled = true // x축 간격을 제한하는 세분화 기능
        }

        lineChart.apply {
            // 차트 라인 세팅
            axisRight.isEnabled = false // y축의 오른쪽 데이터 비활성화
            axisLeft.axisMaximum = 50f // y축의 왼쪽 데이터 최대값은 50으로
            legend.apply {
                // 범레 세팅
                textSize = 15f // 글자 크기 지정
                verticalAlignment = Legend.LegendVerticalAlignment.TOP // 수직 조정 -> 위로
                horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER // 수평 조정 -> 가운데로
                orientation = Legend.LegendOrientation.HORIZONTAL // 범례와 차트 정렬 -> 수평
                setDrawInside(false) // 차트안에 그릴것인가?
            }
            val lineData = LineData()
            lineChart.data = lineData // 라인 차트 데이터 정리
        }
    }


    private fun addEntry() {
        val data = lineChart.data
        // 라인차트
        data?.let {
            var set: ILineDataSet? = data.getDataSetByIndex(0)
            if (set == null) {
                set = createSet()
                data.addDataSet(set)
            }
            //data.addEntry(Entry(set.entryCount.toFloat(), floatTemp), 0)
            // 데이터 엔트리 추가 ENtry(x값, y값)
            data.notifyDataChanged() // 데이터 변경 알림
            lineChart.apply {
                notifyDataSetChanged() // 라인 차트 변경 알림
                moveViewToX(data.entryCount.toFloat()) // 계속 x축을 데이터의 오른쪽으로 옮기기
                setPinchZoom(false) // 확대 설정
                isDoubleTapToZoomEnabled = false // 더블탭 확대 설정
                description.text = "점수" // 라인 차트 안의 텍스트 설정
                //backgroundColor = resources.getColor(R.color.disable) // 배경색
                description.textSize = 15f // 텍스트 사이즈
                setExtraOffsets(8f, 16f, 8f, 16f) // 차트 패딩 설정
            }
        }
    }

    private fun createSet(): LineDataSet {
        val set = LineDataSet(null, "점수") // 범례 yVals 설정
        return set.apply {
            axisDependency = YAxis.AxisDependency.LEFT // y값 데이터를 왼쪽으로
            //color = resources.getColor(R.color.black) // 색 지정
            valueTextSize = 10f // 값 글자 크기
            lineWidth = 2f // 라인 두께
            circleRadius = 3f // 원 크기
            fillAlpha = 0 // 라인 색 투명도
            //fillColor = resources.getColor(R.color.green) // 라인 색 지정
            highLightColor = Color.BLACK // 라이라이트 컬러 지정
            setDrawValues(true) // 값을 그리기
        }

    }
}
