package com.example.belajartablayout.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.belajartablayout.R

/**
 * A simple [Fragment] subclass.
 * Use the [DraftFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DraftFragment : Fragment() {
    override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
    ): View? {
         return inflater.inflate(R.layout.fragment_draft, container, false)
    }
}