package com.example.latihancatalogmovie
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.latihancatalogmovie.databinding.ListMovieBinding

class MovieRecycler : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items : List<ListObjMovie> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DosenViewHolder {
        val binding = ListMovieBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return DosenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DosenViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener {
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }

    fun submitList(listDosen: List<ListObjMovie>) {
        items = listDosen
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class DosenViewHolder constructor(val binding: ListMovieBinding): RecyclerView.ViewHolder(binding.root) {
        val foto_movie: ImageView = binding.gambarMovie
        val sinopsis_movie: TextView = binding.sinopsisMovie
        val rating: TextView = binding.ratingMovie
        var klik: RelativeLayout = binding.rlKlik

        fun bind(ListObjMovie: ListObjMovie) {
            sinopsis_movie.setText(ListObjMovie.sinopsis)
            rating.setText(ListObjMovie.rating)


            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(ListObjMovie.gambar)
                .into(foto_movie)
        }

        fun kalau_diklik(get: ListObjMovie){
            Toast.makeText(itemView.context, "Kamu memilih : ${get.judulMovie}",
                Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(itemView.context, DetilMovie::class.java)
            intent.putExtra("Judulnya", get.judulMovie)
            intent.putExtra("Sinopsisnya", get.sinopsis)
            intent.putExtra("fotonya", get.gambar)
            intent.putExtra("genrenya", get.genre)
            intent.putExtra("sinopsisnya", get.sinopsis)
            intent.putExtra("pemerannya", get.pemeran)
            intent.putExtra("Durasi", get.durasi)
            intent.putExtra("Rating", get.rating)
            intent.putExtra("Bahasanya", get.bahasa)
            itemView.context.startActivity(intent)
        }
    }
}