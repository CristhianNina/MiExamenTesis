package com.example.miexamen;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tittle;
    private Button start;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tittle = findViewById(R.id.main_tittle);
        start = findViewById(R.id.ma_starB);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        tittle.setTypeface(typeface);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intent);

            }
        });

    }
    public void Examen(View view){
        Intent examen = new Intent(this, ExamenActivity.class);
        startActivity(examen);

    }

    public void Adivinalo(View view){
        Intent adivinalo = new Intent(this, Inicio.class);
        startActivity(adivinalo);

    }

    public void Acerca(View view){
        Intent acerca = new Intent(this, Acerca.class);
        startActivity(acerca);

    }

    public void Unidades(View view){
        Intent unidades = new Intent(this, Unidades.class);
        startActivity(unidades);

    }



}