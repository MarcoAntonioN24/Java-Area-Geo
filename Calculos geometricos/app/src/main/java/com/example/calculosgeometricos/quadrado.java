package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class quadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);

        Button calquad = findViewById(R.id.cal2);
        Button cln2 = findViewById(R.id.limp2);
        Button back2 = findViewById(R.id.voltar2);
        EditText l = findViewById(R.id.lado);
        TextView resultado2 = findViewById(R.id.resu2);



        // BOTÃO PARA LIMPAR OS CAMPOS DE TEXTO !!
        cln2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("");

                resultado2.setText("");
            }
        });

        // BOTÃO CALCULAR AREA QUADRADO
        calquad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //MENSAGEM AO TENTAR CALCULAR SEM O VALOR TER SIDO INSERIDO !!
                if ((l.getText().toString().trim().isEmpty())){
                    Toast.makeText(getApplicationContext(),"Insira o valor do lado",Toast.LENGTH_SHORT).show();
                    l.requestFocus();
                }

                else {
                    double lado = Double.parseDouble(l.getText().toString());
                    double calculo2 = lado * lado;

                    resultado2.setText("A área do quadrado é: " + calculo2);

                }


            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(quadrado.this,MainActivity.class);
                startActivity(intentback);
            }
        });

    }
}