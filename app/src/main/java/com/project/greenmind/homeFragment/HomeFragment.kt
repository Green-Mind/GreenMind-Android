package com.project.greenmind.homeFragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
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

        val resultView = inflater.inflate(R.layout.fragment_home, container, false)

        rvResult= resultView.findViewById(R.id.rv_home_result_list)
        rvAdapter= ResultAdapter(requireContext())
        rvResult.adapter=rvAdapter
        rvResult.layoutManager=LinearLayoutManager(requireContext())

        rvAdapter.data = resultRepository.getRepoList()

        rvAdapter.notifyDataSetChanged()
        return resultView
    }

}
