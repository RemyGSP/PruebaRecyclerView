package com.example.recyclerviewpeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewPeliculas)
        val pelicula1 = Pelicula("Batman Returns", "@drawable/film_placeholder");
        val pelicula2 = Pelicula("Avengers Endgame", "@drawable/film_placeholder")
        val pelicula3 = Pelicula("Five nights at Freddy's", "@drawable/film_placeholder")
        val pelicula4 = Pelicula("Avatar", "@drawable/film_placeholder")

        val peliculasAdapter: ArrayList<Pelicula> = ArrayList<Pelicula>();
        peliculasAdapter.add(pelicula1);
        peliculasAdapter.add(pelicula2)
        peliculasAdapter.add(pelicula3)
        peliculasAdapter.add(pelicula4)
        recyclerView.adapter = PeliculasAdapter(peliculasAdapter);
        recyclerView.layoutManager = GridLayoutManager(this, 2);
    }
}