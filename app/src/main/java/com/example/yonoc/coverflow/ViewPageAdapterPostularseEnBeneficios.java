package com.example.yonoc.coverflow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapterPostularseEnBeneficios extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentosDeBeneficios = new ArrayList<>();

    public ViewPageAdapterPostularseEnBeneficios (FragmentManager fm, List<Beneficio> listaDeBeneficios){
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
