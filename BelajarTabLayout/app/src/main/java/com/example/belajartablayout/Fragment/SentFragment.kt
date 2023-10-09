package com.example.belajartablayout.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.belajartablayout.ARG_PARAM1
import com.example.belajartablayout.ARG_PARAM2
import com.example.belajartablayout.R

/**
 * A simple [Fragment] subclass.
 * Use the [SentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sent, container, false)
    }
}