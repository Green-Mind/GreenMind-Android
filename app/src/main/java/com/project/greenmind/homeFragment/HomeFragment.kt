package com.project.greenmind.homeFragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.project.greenmind.R
import com.project.greenmind.homeFragment.home_result_rv.ResultAdapter
import com.project.greenmind.homeFragment.home_result_rv.ResultRepository
import com.project.greenmind.sign.SignInActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var rvResult: RecyclerView
    private lateinit var rvAdapter: ResultAdapter
    private val resultRepository = ResultRepository()

    private lateinit var signout : Button
    private lateinit var fake : View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val resultView = inflater.inflate(R.layout.fragment_home, container, false)

//        fake=resultView.findViewById(R.id.fake_btn)
//
//        fake.setOnClickListener{
//            val intent = Intent(getActivity(), fake_result::class.java)
//            startActivity(intent)
//        }
        rvResult = resultView.findViewById(R.id.rv_home_result_list)
        rvAdapter = ResultAdapter(requireContext())
        rvResult.adapter = rvAdapter
        rvResult.layoutManager = LinearLayoutManager(requireContext())

        rvAdapter.data = resultRepository.getRepoList()

        rvAdapter.notifyDataSetChanged()

        signout = resultView.findViewById(R.id.btn_logout)
        //로그아웃 버튼 이벤트 처리
        signout.setOnClickListener {

            FirebaseAuth.getInstance().signOut()
            Log.e("로그아웃 한다.","로그아웃")
            val intent = Intent(getActivity(), SignInActivity::class.java)
            startActivity(intent)
        }
        return resultView
    }
}
