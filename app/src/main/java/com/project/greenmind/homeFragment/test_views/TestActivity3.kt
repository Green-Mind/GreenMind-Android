package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test3.*

class TestActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        test3_next.setOnClickListener {
            val intent = Intent(this, TestActivity3_2::class.java)
            startActivityForResult(intent,4000)
        }

        // RadioGroup 리스너
//        test3_1_a1.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test3_1_a2.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a2 = radio.tag.toString().toInt()
//        }
//        test3_1_a3.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a3 = radio.tag.toString().toInt()
//        }
//        test3_1_a4.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a4 = radio.tag.toString().toInt()
//        }
//        test3_1_a5.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a5 = radio.tag.toString().toInt()
//        }
//        test3_1_a6.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a6 = radio.tag.toString().toInt()
//        }
//        test3_1_a7.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a7 = radio.tag.toString().toInt()
//        }
//        test3_1_a8.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a8 = radio.tag.toString().toInt()
//        }
//        test3_1_a9.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a9 = radio.tag.toString().toInt()
//        }
//        test3_1_a10.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a10 = radio.tag.toString().toInt()
//        }
//        test3_1_a11.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a11 = radio.tag.toString().toInt()
//        }
//        test3_1_a12.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a12 = radio.tag.toString().toInt()
//        }
//        test3_1_a13.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a13 = radio.tag.toString().toInt()
//        }
//        test3_1_a14.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a14 = radio.tag.toString().toInt()
//        }
//        test3_1_a15.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a15 = radio.tag.toString().toInt()
//        }
//        test3_1_a16.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a16 = radio.tag.toString().toInt()
//        }
//        test3_1_a17.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a17 = radio.tag.toString().toInt()
//        }
//        test3_1_a18.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a18 = radio.tag.toString().toInt()
//        }
//        test3_1_a19.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a19 = radio.tag.toString().toInt()
//        }
//        test3_1_a20.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a20 = radio.tag.toString().toInt()
//        }
//        test3_1_a21.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a21 = radio.tag.toString().toInt()
//        }
//        test3_1_a22.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a22 = radio.tag.toString().toInt()
//        }
//        test3_1_a23.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a23 = radio.tag.toString().toInt()
//        }
//        test3_1_a24.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a24 = radio.tag.toString().toInt()
//        }
//        test3_1_a25.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a25 = radio.tag.toString().toInt()
//        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 4000){
            finish()
        }
    }
}
