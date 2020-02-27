package com.project.greenmind.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initialUI()
    }

    private fun initialUI(){
        btn_signup_fin.setOnClickListener{
            val finish = Intent(this, SignUpFinishActivity::class.java)
            startActivity(finish)
        }
    }
}
