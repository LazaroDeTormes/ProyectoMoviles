package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private ImageView imgTitulo;
    private LinearLayout pantallaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTitulo = findViewById(R.id.imgTitulo);
        pantallaPrincipal = findViewById(R.id.pantallaTitulo);

        imgTitulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallaPrincipal.setVisibility(View.GONE);
            }
        });

    }
}