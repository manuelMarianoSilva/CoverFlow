package com.example.yonoc.coverflow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yonoc on 5/22/2018.
 */

public class CoverFlowAdapter extends BaseAdapter{

    List<Pelicula> peliculaList;
    Context context;

    public CoverFlowAdapter(List<Pelicula> peliculaList, Context context) {
        this.peliculaList = peliculaList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return peliculaList.size();
    }

    @Override
    public Object getItem(int i) {
        return peliculaList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View rootView = view;

        if (rootView == null) {

            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View itemView = layoutInflater.inflate(R.layout.layout_item,null);
            TextView name = (TextView) itemView.findViewById(R.id.label);
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);

            Picasso.with(context).load(peliculaList.get(i).getUrl()).into(imageView);
            name.setText(peliculaList.get(i).getTitulo());

            return itemView;
        }



        return rootView;
    }
}
