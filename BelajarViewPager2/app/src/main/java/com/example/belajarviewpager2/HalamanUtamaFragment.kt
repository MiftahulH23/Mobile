package com.example.belajarviewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.belajarviewpager2.databinding.FragmentHalamanUtamaBinding


class HalamanUtamaFragment : Fragment() {
    private lateinit var binding: FragmentHalamanUtamaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_halaman_utama,
                container, false)
        binding= FragmentHalamanUtamaBinding.bind(view)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtUtama.setOnClickListener{
            Toast.makeText(context, "Ini Halaman Utama", Toast.LENGTH_SHORT).show()
        }
        return view
    }


}