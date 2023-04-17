package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class artistas extends AppCompatActivity {

    private ListView lista;

    private Adaptador adaptador;

    private ArrayList<Artista> artistas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);

        lista = findViewById(R.id.listaArtistas);


        adaptador = new Adaptador(this, R.layout.row, artistas);

        lista.setAdapter(adaptador);






    }
}