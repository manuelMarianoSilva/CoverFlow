package com.example.yonoc.coverflow.CoverFlowClick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.yonoc.coverflow.Common;
import com.example.yonoc.coverflow.Pelicula;
import com.example.yonoc.coverflow.R;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

public class PeliculaDetalle extends AppCompatActivity {

    KenBurnsView imagen;
    TextView titulo, sinopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula_detalle);

        imagen = (KenBurnsView) findViewById(R.id.imagenPelicula);
        titulo = findViewById(R.id.textViewTituloEnDetalle);
        sinopsis = findViewById(R.id.textViewSinopsis);

        if (getIntent() != null){

            Integer index = getIntent().getIntExtra("movie_index", -1);

            if (index != -1){
                cargarPeliculaDetalla(index);
            }
        }
    }

    private void cargarPeliculaDetalla(Integer index) {
        Pelicula pelicula = Common.peliculaList.get(index);

        Picasso.with(getBaseContext()).load(pelicula.getUrl()).into(imagen);
        titulo.setText(pelicula.getTitulo());
        sinopsis.setText(pelicula.getResumen());

    }
}
