package com.project.greenmind.homeFragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.project.greenmind.R

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

        val next = view.findViewById<Button>(R.id.button1)
        next.setOnClickListener {
            val intent = Intent(getActivity(), InfoDetailsActivity1::class.java)
            startActivity(intent)
        }
        return view
    }
}
