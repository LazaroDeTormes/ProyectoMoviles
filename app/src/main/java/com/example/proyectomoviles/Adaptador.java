package com.example.proyectomoviles;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adaptador extends ArrayAdapter {

    private Activity contexto;
    private ArrayList<Artista> artistas;


    public Adaptador(@NonNull Activity contexto,
                     int layoutPersonalizado,
                     @NonNull ArrayList<Artista> artistas){
        super(contexto, layoutPersonalizado, artistas);
        this.contexto = contexto;
        this.artistas = artistas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View fila = convertView;
        ViewHolder vh;

        if (fila == null){
            LayoutInflater inflador = contexto.getLayoutInflater();
            fila = inflador.inflate(R.layout.row, null);
            vh = new ViewHolder();

            vh.nombre = fila.findViewById(R.id.nombreArtista);
            vh.imagen = fila.findViewById(R.id.imgArtista);

            fila.setTag(vh);

        } else {
            vh = (ViewHolder) fila.getTag();
        }

        TextView nombre = fila.findViewById(R.id.nombreArtista);
        ImageView imagen = fila.findViewById(R.id.imgArtista);

        nombre.setText(artistas.get(position).getNombre());
        imagen.setImageResource(R.drawable.ffdp);



        return fila;
    }


    public class ViewHolder{
        private ImageView imagen;
        private TextView nombre;
    }
}
