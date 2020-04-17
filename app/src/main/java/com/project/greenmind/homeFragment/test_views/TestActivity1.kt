package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test1.*

class TestActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        test1_next.setOnClickListener {
            val intent = Intent(this, TestActivity1_2::class.java)
            startActivityForResult(intent, 1000)
        }

        // RadioGroup 리스너
       test1_a1.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test1_a2.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
            // test1_3은 editText 답안 입력
        test1_a4.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test1_a5.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test1_a6.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1000){
            finish()
        }
    }
}
