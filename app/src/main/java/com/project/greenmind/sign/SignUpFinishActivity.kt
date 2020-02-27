package com.project.greenmind.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_sign_up_finish.*

class SignUpFinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_finish)

        signup_finish.setOnClickListener {
            val fin = Intent(this, SignInActivity::class.java)
            startActivity(fin)
        }
    }
}
