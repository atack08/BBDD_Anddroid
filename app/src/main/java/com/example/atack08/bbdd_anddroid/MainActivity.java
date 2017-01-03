package com.example.atack08.bbdd_anddroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void linkAgendaContactos(View v){

        Intent intent = new Intent(this,AgendaContactos.class);
        startActivity(intent);

    }

    public void linkBBDDLibros(View v){

    }

}
