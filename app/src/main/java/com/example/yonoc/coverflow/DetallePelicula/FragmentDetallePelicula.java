package com.example.yonoc.coverflow.DetallePelicula;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yonoc.coverflow.Support.Pelicula;
import com.example.yonoc.coverflow.R;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetallePelicula extends Fragment {

    private KenBurnsView imagen;
    private TextView titulo, sinopsis;
    private String tituloFinal;



    public FragmentDetallePelicula() {
        // Required empty public constructor
    }


    static public FragmentDetallePelicula crearFragmentPelicula (Pelicula pelicula){

        FragmentDetallePelicula fragmentDetallePelicula = new FragmentDetallePelicula();
        Bundle bundle = new Bundle();

        String titulo = pelicula.getTitulo();
        String resumen = pelicula.getResumen();
        String url = pelicula.getUrl();

        bundle.putString("titulo", titulo);
        bundle.putString("resumen", resumen);
        bundle.putString("url", url);

        fragmentDetallePelicula.setArguments(bundle);

        return fragmentDetallePelicula;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_view_pager_pelicula, container, false);

        Bundle bundle = getArguments();

        tituloFinal = bundle.getString("titulo");
        String resumen = bundle.getString("resumen");
        String url = bundle.getString("url");


        imagen = view.findViewById(R.id.imagenPelicula);
        titulo = view.findViewById(R.id.textViewTituloEnDetalle);
        sinopsis = view.findViewById(R.id.textViewSinopsis);

        Picasso.with(getContext()).load(url).into(imagen);
        titulo.setText(tituloFinal);
        sinopsis.setText(resumen);

        return view;
    }

    public String getTituloFinal() {
        return getArguments().getString("titulo");
    }
}
