package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test1_2.*
import kotlinx.android.synthetic.main.activity_test2.*

class TestActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        test2_next.setOnClickListener {
            val intent = Intent(this, TestActivity3::class.java)
            startActivityForResult(intent, 3000)
        }

        // RadioGroup
//        test2_a13.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test2_a14.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test2_a15.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test2_a16.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test2_a17.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
//        test2_a18.setOnCheckedChangeListener { group, checkedId ->
//            val radio: RadioButton = findViewById(checkedId)
//            var a1 = radio.tag.toString().toInt()
//        }
    }
    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 3000){
            finish()
        }
    }
}
