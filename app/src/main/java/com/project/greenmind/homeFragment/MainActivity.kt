package com.project.greenmind.homeFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.greenmind.R
import kotlinx.android.synthetic.main.activity_main.*
// 프래그먼트 내부에 리사이클러뷰 만들기, 프래그먼트 안에 자체적으로 인텐트를 달 수가 없으므로 해결방안이 필요.
class MainActivity : AppCompatActivity() {

    private val mOnNavigationiItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId){
            R.id.nav_home -> {
                println("home pressed")
                replaceFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_test -> {
                println("test pressed")
                replaceFragment(TestFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_info -> {
                println("info pressed")
                replaceFragment(InfoFragment())
                return@OnNavigationItemSelectedListener true
            }

            else -> false
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(HomeFragment())
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationiItemSelectedListener)
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}
