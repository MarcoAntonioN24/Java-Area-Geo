package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class trapezio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezio);


        Button caltrap = findViewById(R.id.cal5);
        Button cln5 = findViewById(R.id.limp5);
        Button back5 = findViewById(R.id.voltar5);
        EditText BASE = findViewById(R.id.BB);
        EditText base = findViewById(R.id.Bb);
        EditText alttrap = findViewById(R.id.alt5);
        TextView resultado5 = findViewById(R.id.resu5);

        // BOTÃO PARA LIMPAR OS CAMPOS DE TEXTO !!
        cln5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BASE.setText("");
                base.setText("");
                alttrap.setText("");
                resultado5.setText("");
            }
        });

        // BOTÃO CALCULAR AREA DO TRAPÉZIO
        caltrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((BASE.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira a base maior",Toast.LENGTH_SHORT).show();
                    BASE.requestFocus();

                }
                else if ((base.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira a base menor",Toast.LENGTH_SHORT).show();
                    base.requestFocus();

                }

                else if ((alttrap.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira a altura",Toast.LENGTH_SHORT).show();
                    alttrap.requestFocus();

                }

                else{
                    double B= Double.parseDouble(BASE.getText().toString());
                    double b = Double.parseDouble(base.getText().toString());
                    double a = Double.parseDouble(alttrap.getText().toString());
                    double calculo5 = ((B + b)* a)/2;

                    resultado5.setText("A área do trapézio é :" + calculo5);

                }

            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(trapezio.this,MainActivity.class);
                startActivity(intentback);
            }
        });

    }
}