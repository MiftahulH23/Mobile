package com.example.belajarsqllite.fragments.list

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarsqllite.R
import com.example.belajarsqllite.fragments.list.ListAdapter
import com.example.belajarsqllite.viewmodel.JadwalViewModel
import kotlinx.android.synthetic.main.fragment_list.view.*

class ListFragment : Fragment() {

    private lateinit var mJadwalViewModel: JadwalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        //val adapter = ListAdapter()
        val adapter = ListAdapter()
        val rv = view.recyclerView
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))

        mJadwalViewModel = ViewModelProvider(this).get(JadwalViewModel::class.java)
        mJadwalViewModel.bacaSemuaData.observe(
            viewLifecycleOwner,
            Observer { jadwal -> adapter.tampilkanData(jadwal) })

        view.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_tambahFragment)
        }
        setHasOptionsMenu(true)

        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_hapus, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_hapus) {
            hapusSemua()
        }
        return super.onOptionsItemSelected(item)
    }
    private fun hapusSemua() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setPositiveButton("Iya") { _, _ ->
            mJadwalViewModel.hapusSemuaJadwal()
            Toast.makeText(requireContext(),"Semua data berhasil di hapus", Toast.LENGTH_SHORT)
                .show()}
        builder.setNegativeButton("Tidak") { _, _ -> }
        builder.setTitle("Hapus semua?")
        builder.setMessage("Apakah kamu yakin ingin menghapus seluruh data ini?")
        builder.create().show()
    }
}