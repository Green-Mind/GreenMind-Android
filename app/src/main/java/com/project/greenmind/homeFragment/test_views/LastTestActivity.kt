package com.project.greenmind.homeFragment.test_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_last_test.*

class LastTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_test)


        btn_finish.setOnClickListener {
            //finish()
            finish()
        }
    }
}
