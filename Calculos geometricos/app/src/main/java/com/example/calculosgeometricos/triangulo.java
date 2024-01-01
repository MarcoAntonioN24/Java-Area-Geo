package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);




        Button caltrian = findViewById(R.id.cal6);
        Button cln6 = findViewById(R.id.limp6);
        Button back6 = findViewById(R.id.voltar6);
        EditText basetrian = findViewById(R.id.basetria);
        EditText alttrian = findViewById(R.id.alttria);
        TextView resultado6 = findViewById(R.id.resu6);

        cln6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basetrian.setText("");
                alttrian.setText("");
                resultado6.setText("");
            }
        });

        caltrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((basetrian.getText().toString().trim().isEmpty())){
                    Toast.makeText(getApplicationContext(),"Insira a base",Toast.LENGTH_SHORT).show();
                    basetrian.requestFocus();

                }

                else if ((alttrian.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira a altura",Toast.LENGTH_SHORT).show();
                  alttrian.requestFocus();

                }

                else {
                    double base = Double.parseDouble(basetrian.getText().toString());
                    double altura = Double.parseDouble(alttrian.getText().toString());
                    double calculo6 = (base * altura)/2;

                    resultado6.setText("A área do triangulo é: " + calculo6);

                }

            }
        });

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(triangulo.this,MainActivity.class);
                startActivity(intentback);
            }
        });

    }
}