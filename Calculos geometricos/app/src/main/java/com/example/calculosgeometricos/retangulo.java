package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class retangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);

        Button calreta = findViewById(R.id.cal1);
        Button cln1 = findViewById(R.id.limp1);
        Button back1 = findViewById(R.id.voltar1);
        EditText b1 = findViewById(R.id.base1);
        EditText a1 = findViewById(R.id.alt1);
        TextView resultado1 = findViewById(R.id.resu1);


        // BOTÃO PARA LIMPAR OS CAMPOS DE TEXTO !!
        cln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                a1.setText("");
                resultado1.setText("");

            }
        });

        //BOTÃO PARA CALCULAR A ÁREA  !!

        calreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //MENSAGEM AO TENTAR CALCULAR SEM O VALOR TER SIDO INSERIDO
                if ((b1.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira o valor da base",Toast.LENGTH_SHORT).show();
                    b1.requestFocus();

                }
                else if ((a1.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira o valor da altura",Toast.LENGTH_SHORT).show();
                    a1.requestFocus();

                }

                else {
                    double basereta = Double.parseDouble(b1.getText().toString());
                    double altureta = Double.parseDouble(a1.getText().toString());
                    double calculo1 = basereta * altureta;


                    resultado1.setText("A área do retangulo é: " + calculo1);


                }

            }
        });

                    //BOTÃO PARA VOLTAR PARA A TELA INICIAL
                    back1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    Intent intentback = new Intent(retangulo.this,MainActivity.class);
                    startActivity(intentback);
            }
        });




    }
}