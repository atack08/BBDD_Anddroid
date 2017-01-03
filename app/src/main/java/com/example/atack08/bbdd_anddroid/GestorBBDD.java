package com.example.atack08.bbdd_anddroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by atack08 on 21/12/16.
 */

public class GestorBBDD extends SQLiteOpenHelper {

    private String consultaCreacion;

    public GestorBBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        consultaCreacion = "CREATE TABLE contactos (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT," +
                "apellidos TEXT," +
                "telefono TEXT)";
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(consultaCreacion);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       // sqLiteDatabase.execSQL("drop");

    }
}
