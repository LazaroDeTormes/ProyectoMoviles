package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class listas extends AppCompatActivity {

    private ListView lista;

    private Adaptador adaptador;

    private ArrayList<Artista> artistas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);


        showCustomUI();

        lista = findViewById(R.id.listaArtistas);


        adaptador = new Adaptador(this, R.layout.row, artistas);

        lista.setAdapter(adaptador);






    }

    private void showCustomUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}