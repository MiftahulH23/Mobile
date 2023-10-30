package com.example.latihancatalogmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihancatalogmovie.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var dosenAdapter: MovieRecycler
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        tambahDataSet()
    }

    private fun tambahDataSet(){
        val data = SumberData.buatSetData()
        dosenAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        binding.recylerView.apply {
            layoutManager = LinearLayoutManager( this@MainActivity)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            dosenAdapter = MovieRecycler()
            adapter = dosenAdapter
        }
    }
}