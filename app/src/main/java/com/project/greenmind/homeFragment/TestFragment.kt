package com.project.greenmind.homeFragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.project.greenmind.R
import com.project.greenmind.homeFragment.test_views.TestActivity1
import kotlinx.android.synthetic.main.fragment_test.*

/**
 * A simple [Fragment] subclass.
 */
// 아마 프래그먼트 안에 프래그먼트를 이용해야될 것 같음.
class TestFragment : Fragment() {

    private lateinit var next : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_test, container, false)

        next = view.findViewById(R.id.test_start)
        next.setOnClickListener {
            val intent = Intent(getActivity(), TestActivity1::class.java)
            startActivity(intent)
        }

        return view
    }


}
