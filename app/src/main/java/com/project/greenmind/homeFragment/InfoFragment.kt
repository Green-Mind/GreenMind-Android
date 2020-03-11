package com.project.greenmind.homeFragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.project.greenmind.R
import com.project.greenmind.homeFragment.Infomation.*

/**
 * A simple [Fragment] subclass.
 */
class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        val next1 = view.findViewById<ImageButton>(R.id.button1)
        next1.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity1::class.java)
            startActivity(intent)
        }

        val next2 = view.findViewById<ImageButton>(R.id.button2)
        next2.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity2::class.java)
            startActivity(intent)
        }

        val next3 = view.findViewById<ImageButton>(R.id.button3)
        next3.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity3::class.java)
            startActivity(intent)
        }

        val next4 = view.findViewById<ImageButton>(R.id.button4)
        next4.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity4::class.java)
            startActivity(intent)
        }

        val next5 = view.findViewById<ImageButton>(R.id.button5)
        next5.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity5::class.java)
            startActivity(intent)
        }

        val next6 = view.findViewById<ImageButton>(R.id.button6)
        next6.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity6::class.java)
            startActivity(intent)
        }
return view
}
}
