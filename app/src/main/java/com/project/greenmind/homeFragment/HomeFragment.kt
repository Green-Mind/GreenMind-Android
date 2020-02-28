package com.project.greenmind.homeFragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.greenmind.R
import com.project.greenmind.homeFragment.home_result_rv.ResultAdapter
import com.project.greenmind.homeFragment.home_result_rv.ResultRepository
import kotlinx.android.synthetic.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var rvResult: RecyclerView
    private lateinit var rvAdapter: ResultAdapter
    private val resultRepository = ResultRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //result()
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    /*
    private fun result(){
        rvResult = findViewById(R.id.rv_home_result_list)
        rvAdapter
    }*/


}
