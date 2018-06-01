package com.example.yonoc.coverflow.DetallePelicula;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.yonoc.coverflow.Support.Pelicula;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yonoc on 5/30/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> listaParaViewPager = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, List<Pelicula> listaDePeliculas) {
        super(fm);

        for (Pelicula unaPelicula : listaDePeliculas) {
            listaParaViewPager.add(new FragmentDetallePelicula().crearFragmentPelicula(unaPelicula));
        }
    }



    @Override
    public Fragment getItem(int position) {
        return listaParaViewPager.get(position);
    }



    @Override
    public int getCount() {
        return listaParaViewPager.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        FragmentDetallePelicula pelicula = (FragmentDetallePelicula) listaParaViewPager.get(position);
        return pelicula.getTituloFinal();
    }
}
