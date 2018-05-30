package com.example.yonoc.coverflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.yonoc.coverflow.CoverFlowClick.PeliculaDetalle;

import java.lang.invoke.MethodType;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class MainActivity extends AppCompatActivity {

    FeatureCoverFlow coverFlow;
    CoverFlowAdapter coverFlowAdapter;
    TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarData();
        coverFlowAdapter = new CoverFlowAdapter(Common.peliculaList, this);
        mTitle = findViewById(R.id.titleTextSwitch);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                TextView textView = (TextView) inflater.inflate(R.layout.layout_title,null);
                return textView;
            }
        });
        coverFlow = findViewById(R.id.coverFlow);
        coverFlow.setAdapter(coverFlowAdapter);

        coverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(Common.peliculaList.get(position).getTitulo());
            }

            @Override
            public void onScrolling() {

            }
        });
        coverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PeliculaDetalle.class);
                intent.putExtra("movie_index", i);
                startActivity(intent);
            }
        });
    }

    public void iniciarData() {
      Pelicula avengers = new Pelicula("Avengers", "Cuando el hermano de Thor, Loki (Tom Hiddleston), logra acceder al poder ilimitado del Cubo Cósmico, Nick Fury (Samuel L. Jackson), director de la agencia para mantener la paz internacional, inicia el reclutamiento de unos superhéroes para vencer una amenaza sin precedente contra la Tierra. Al equipo de ensueño de Fury se unen Iron Man (Robert Downey Jr.), Capitán América (Chris Evans), Hulk (Mark Ruffalo), Thor (Chris Hemsworth), Viuda Negra (Scarlett Johansson) y Ojo de Halcón (Jeremy Renner).", "http://cdn2.dailytrend.mx/media/bi/styles/gallerie/public/images/2018/04/avengers-infinity-war-no-esparaninos.jpg" );
      Common.peliculaList.add(avengers);

        avengers = new Pelicula("Y una mas de Avengers", "Cuando el hermano de Thor, Loki (Tom Hiddleston), logra acceder al poder ilimitado del Cubo Cósmico, Nick Fury (Samuel L. Jackson), director de la agencia para mantener la paz internacional, inicia el reclutamiento de unos superhéroes para vencer una amenaza sin precedente contra la Tierra. Al equipo de ensueño de Fury se unen Iron Man (Robert Downey Jr.), Capitán América (Chris Evans), Hulk (Mark Ruffalo), Thor (Chris Hemsworth), Viuda Negra (Scarlett Johansson) y Ojo de Halcón (Jeremy Renner).","https://prod.media.larepublica.pe/720x405/larepublica/imagen/2018/04/13/noticia-avengers-infinity-war.jpg" );
        Common.peliculaList.add(avengers);

        avengers = new Pelicula("Sólo saben hacer películas de Avengers", "Cuando el hermano de Thor, Loki (Tom Hiddleston), logra acceder al poder ilimitado del Cubo Cósmico, Nick Fury (Samuel L. Jackson), director de la agencia para mantener la paz internacional, inicia el reclutamiento de unos superhéroes para vencer una amenaza sin precedente contra la Tierra. Al equipo de ensueño de Fury se unen Iron Man (Robert Downey Jr.), Capitán América (Chris Evans), Hulk (Mark Ruffalo), Thor (Chris Hemsworth), Viuda Negra (Scarlett Johansson) y Ojo de Halcón (Jeremy Renner).","http://cdn2.dailytrend.mx/media/bi/styles/gallerie/public/images/2018/04/avengers-infinity-war-no-esparaninos.jpg" );
        Common.peliculaList.add(avengers);

        avengers = new Pelicula("Y daaaale con Avengers", "Cuando el hermano de Thor, Loki (Tom Hiddleston), logra acceder al poder ilimitado del Cubo Cósmico, Nick Fury (Samuel L. Jackson), director de la agencia para mantener la paz internacional, inicia el reclutamiento de unos superhéroes para vencer una amenaza sin precedente contra la Tierra. Al equipo de ensueño de Fury se unen Iron Man (Robert Downey Jr.), Capitán América (Chris Evans), Hulk (Mark Ruffalo), Thor (Chris Hemsworth), Viuda Negra (Scarlett Johansson) y Ojo de Halcón (Jeremy Renner).","http://cdn2.dailytrend.mx/media/bi/styles/gallerie/public/images/2018/04/avengers-infinity-war-no-esparaninos.jpg" );
        Common.peliculaList.add(avengers);

        avengers = new Pelicula("Y adivinà què? Otra de Avengers!!!", "Cuando el hermano de Thor, Loki (Tom Hiddleston), logra acceder al poder ilimitado del Cubo Cósmico, Nick Fury (Samuel L. Jackson), director de la agencia para mantener la paz internacional, inicia el reclutamiento de unos superhéroes para vencer una amenaza sin precedente contra la Tierra. Al equipo de ensueño de Fury se unen Iron Man (Robert Downey Jr.), Capitán América (Chris Evans), Hulk (Mark Ruffalo), Thor (Chris Hemsworth), Viuda Negra (Scarlett Johansson) y Ojo de Halcón (Jeremy Renner).","http://cdn2.dailytrend.mx/media/bi/styles/gallerie/public/images/2018/04/avengers-infinity-war-no-esparaninos.jpg" );
        Common.peliculaList.add(avengers);

    }
}
