package com.example.yonoc.coverflow.DetallePelicula;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yonoc.coverflow.Support.Common;
import com.example.yonoc.coverflow.Support.Pelicula;
import com.example.yonoc.coverflow.R;


import java.util.List;

public class ActivityPeliculaDetalle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula_detalle);


        Bundle bundle = getIntent().getExtras();
        Integer posicion = bundle.getInt("movie_index");

        FragmentManager fragmentManager = getSupportFragmentManager();

        List<Pelicula> listaPeliculasParaViewPager = Common.peliculaList;

        ViewPagerAdapter adapter = new ViewPagerAdapter(fragmentManager,listaPeliculasParaViewPager);

        ViewPager viewPager = findViewById(R.id.viewPagerDetallePeliculas);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(posicion);

    }
}
