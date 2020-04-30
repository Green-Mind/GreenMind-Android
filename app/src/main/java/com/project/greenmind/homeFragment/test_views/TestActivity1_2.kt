package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test1_2.*
import kotlinx.android.synthetic.main.activity_test2.*

class TestActivity1_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1_2)

        test1_2_next.setOnClickListener {
            val intent = Intent(this, TestActivity2::class.java)
            startActivityForResult(intent, 2000)
        }
//
//        // RadioGroup 리스너
//        test1_a7.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test1_a8.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test1_a9.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test1_a10.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test1_a11.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test1_a12.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
    }
    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 2000){
            finish()
        }
    }
}
