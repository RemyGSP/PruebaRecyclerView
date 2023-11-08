package com.example.recyclerviewpeliculas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeliculasAdapter(private val FilmList: List<Pelicula>) : RecyclerView.Adapter<PeliculasAdapter.ViewHolder>() {


    inner class ViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView = itemView.findViewById<TextView>(R.id.TituloPelicula);
        var image: ImageView = itemView.findViewById<ImageView>(R.id.ImagenPelicula);
    };

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent?.context;
        val inflater = LayoutInflater.from(context);
        val filmView = inflater.inflate(R.layout.layoutrecyclerview,parent,false);
        return ViewHolder(filmView)
    }

    override fun getItemCount(): Int {
        return FilmList.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val film: Pelicula = FilmList.get(position)
        val textView =holder.titleTextView;
        textView.text = film.titulo;

        val image = holder.image;
        image.setImageResource(R.drawable.film_placeholder);

    }


}