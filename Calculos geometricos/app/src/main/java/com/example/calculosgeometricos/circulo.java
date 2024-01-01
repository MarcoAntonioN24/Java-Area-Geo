package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);


        Button calcir = findViewById(R.id.cal4);
        Button cln4 = findViewById(R.id.limpar4);
        Button back4 = findViewById(R.id.voltar4);
        EditText r = findViewById(R.id.raio);
        TextView resultado4 = findViewById(R.id.resu4);

        cln4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r.setText("");
                resultado4.setText("");

            }
        });

        calcir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MENSAGEM AO TENTAR CALCULAR SEM O VALOR TER SIDO INSERIDO
                if ((r.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira o valor do raio",Toast.LENGTH_SHORT).show();
                   r.requestFocus();

                }

                else {
                    double raio = Double.parseDouble(r.getText().toString());
                    double calculo4 = 3.14 *(raio * raio);

                    resultado4.setText("A área do círculo é: " + calculo4);
                }

            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(circulo.this,MainActivity.class);
                startActivity(intentback);
            }
        });
    }
}