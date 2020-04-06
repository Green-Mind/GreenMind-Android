package com.project.greenmind.homeFragment.test_views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    }
    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1000){
            finish()
        }
    }
}
