package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test3.*
import kotlinx.android.synthetic.main.activity_test3_2.*

class TestActivity3_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3_2)

        test3_next_1.setOnClickListener {
            val intent = Intent(this, GraphResult::class.java)
            startActivityForResult(intent,5000)
        }

        // RadioGroup 리스너
        test3_2_a1.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a2.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a3.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a4.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a5.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a6.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a7.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a8.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a9.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a10.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a11.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a12.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a13.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a14.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a15.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a16.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a17.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a18.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a19.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a20.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a21.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a22.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a23.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a24.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
        test3_2_a25.setOnCheckedChangeListener { group, checkedId ->
            val radio: RadioButton = findViewById(checkedId)
            var a1 = radio.tag.toString().toInt()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 5000){
            finish()
        }
    }
}
