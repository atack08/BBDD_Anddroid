package com.example.atack08.bbdd_anddroid;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AgendaContactos extends AppCompatActivity {
    
    private GestorBBDD g1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_contactos);
        
        
        g1 = new GestorBBDD(this,"agenda",null,1);
        SQLiteDatabase cn =g1.getReadableDatabase();
        
        
        Cursor cursor = cn.rawQuery("select * from contactos",null);
        
        if(cursor.moveToFirst()){
            
            do{
                String nombre = cursor.getString(1);
                String apell = cursor.getString(2);
                String tel = cursor.getString(3);
                Contacto c = new Contacto(nombre,apell,tel);

                Toast.makeText(this, c.toString(), Toast.LENGTH_SHORT).show();
            }
            while(cursor.moveToNext());
            
        }
        else
            Toast.makeText(this, "Vacio", Toast.LENGTH_SHORT).show();
    }





    
    public void mostrarM (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
