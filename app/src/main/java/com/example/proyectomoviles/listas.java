package com.example.proyectomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class listas extends AppCompatActivity {

    private ListView lista;

    private Adaptador adaptador;

    private ArrayList<Artista> artistas;

    private SQLiteDatabase sqldb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);

        SQLiteOpenHelper openHelper =
                new SQLiteOpenHelper(this, "BBDD_Canciones", null, 1);

        sqldb = openHelper.getReadableDatabase();

        showCustomUI();

        lista = findViewById(R.id.listaArtistas);



        Cursor cursor2 = sqldb.rawQuery("SELECT * FROM canciones", null);




        int codigo = cursor2.getInt(0);
        String nombre = cursor2.getString(2);

        artistas.add(new Artista(nombre));

        cursor2.close();//siempre hay que cerrar el cursor...




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