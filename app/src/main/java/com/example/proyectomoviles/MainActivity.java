package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private ImageView imgTitulo;
    private LinearLayout pantallaPrincipal;
    private RelativeLayout pantBot;

    private Button btnGen, btnAnho, btnArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCustomUI();

        imgTitulo = findViewById(R.id.imgTitulo);
        pantallaPrincipal = findViewById(R.id.pantallaTitulo);
        pantBot = findViewById(R.id.pantallaBotones);
        btnGen = findViewById(R.id.btnGeneros);
        btnAnho = findViewById(R.id.btnAños);
        btnArt = findViewById(R.id.btnArtistas);


        imgTitulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallaPrincipal.setVisibility(View.GONE);
                pantBot.setVisibility(View.VISIBLE);
            }
        });

        btnGen.setOnClickListener(this);
        btnAnho.setOnClickListener(this);
        btnArt.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Class clase;

        switch(v.getId()){
            case R.id.btnArtistas:
                clase = listas.class;
                cargarPantalla(clase);
                break;
            case R.id.btnAños:
                clase = pantallaAnhos.class;
                cargarPantalla(clase);
                break;
            case R.id.btnGeneros:
                clase = pantallaGeneros.class;
                cargarPantalla(clase);
                break;
        }

    }

    public void cargarPantalla(Class clase){
        Intent i = new Intent(this, clase);
        startActivity(i);
    }

    private void showCustomUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}