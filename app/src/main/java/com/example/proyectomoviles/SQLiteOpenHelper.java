package com.example.proyectomoviles;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper{

    private String strCreateTable ="CREATE TABLE canciones (codigo INT PRIMARY KEY, nombre TEXT, grupo TEXT, duracion TEXT, genero TEXT, decada INT)";
    Context context;

    public SQLiteOpenHelper(@Nullable Context context,
                            @Nullable String nameOfDatabase,
                            @Nullable SQLiteDatabase.CursorFactory factory,
                            int version) {
        super(context, nameOfDatabase, factory, version);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(strCreateTable);

        try{
            db.execSQL("INSERT INTO canciones (codigo, nombre, grupo, duracion, genero, decada) VALUES (1, 'Bad Company', 'Five Finger Death Punch', '4:22', 'Metal', 2010)");
            db.execSQL("INSERT INTO canciones (codigo, nombre, grupo, duracion, genero, decada) VALUES (2, 'Far From Home', 'Five Finger Death Punch', '3:32', 'Metal', 2010)");

        } catch (Exception e){
            Toast.makeText(context, "ERROR DE INSERCION", Toast.LENGTH_SHORT).show();
            System.out.println(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
