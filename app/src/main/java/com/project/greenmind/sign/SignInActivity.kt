package com.project.greenmind.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.greenmind.homeFragment.MainActivity
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initialUI()
    }

    private fun initialUI() {
        btn_login.setOnClickListener {
            val id = edt_signin_id?.text.toString()
            val password = edt_signin_pw?.text.toString()

            if (id.isEmpty() || password.isEmpty()) {
                // 사용자에게 간단한 text 정보를 알려주기 위해 Toast를 띄워준다.
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val login = Intent(this, MainActivity::class.java)
            startActivity(login)
        }

        txt_signup.setOnClickListener{
            val signUp = Intent(this, SignUpActivity::class.java)
            startActivity(signUp)
        }
    }
}