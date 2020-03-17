package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_test3.*

class TestActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        test3_next.setOnClickListener {
            val intent = Intent(this, TestActivity3_2::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1000){
            //finish()
            finishActivity(2000)
        }
    }
}
