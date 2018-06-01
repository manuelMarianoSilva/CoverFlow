package com.example.yonoc.coverflow;

/**
 * Created by yonoc on 5/22/2018.
 */

public class Pelicula {

    public String titulo, resumen, url;

    public Pelicula(String titulo, String resumen, String url) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public String getUrl() {
        return url;
    }
}
