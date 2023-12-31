package com.example.belajarviewpager2.vPagerFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.belajarviewpager2.R
import com.example.belajarviewpager2.databinding.FragmentViewPagerBinding
import com.example.belajarviewpager2.vPagerFragment.Screen.HalamanKeduaFragment
import com.example.belajarviewpager2.vPagerFragment.Screen.HalamanPertamaFragment
import com.example.belajarviewpager2.vPagerFragment.Screen.HalamanKetigaFragment

class ViewPagerFragment : Fragment() {
    lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        binding = FragmentViewPagerBinding.bind(view)

        val fragmentList = arrayListOf(
            HalamanPertamaFragment(),
            HalamanKeduaFragment(),
            HalamanKetigaFragment()
        )

        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        binding.viewPager.adapter = adapter
        return view
    }

}