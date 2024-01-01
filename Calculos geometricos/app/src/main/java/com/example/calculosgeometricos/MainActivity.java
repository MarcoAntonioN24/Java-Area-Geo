package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button retan = findViewById(R.id.reta);
        Button quadr = findViewById(R.id.quad);
        Button losan = findViewById(R.id.losa);
        Button circu = findViewById(R.id.circ);
        Button trian = findViewById(R.id.tria);
        Button trape = findViewById(R.id.trap);







        //BOTÃO RETANGULO

        retan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,retangulo.class);
                startActivity(intentreta);

            }
        });

        //BOTÃO QUADRADO
        quadr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,quadrado.class);
                startActivity(intentreta);
            }
        });

        //BOTÃO LOSANGO
        losan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,Losango.class);
                startActivity(intentreta);
            }
        });

        //BOTÃO CÍRCULO
        circu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,circulo.class);
                startActivity(intentreta);
            }
        });

        //BOTÃO TRAPÉZIO
        trape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,trapezio.class);
                startActivity(intentreta);
            }
        });


        //BOTÃO TRIANGULO
        trian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreta = new Intent(MainActivity.this,triangulo.class);
                startActivity(intentreta);
            }
        });


    }
    }