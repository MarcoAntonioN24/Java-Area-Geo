package com.example.calculosgeometricos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Losango extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losango);

        Button callos = findViewById(R.id.cal3);
        Button cln3 = findViewById(R.id.limp3);
        Button back3 = findViewById(R.id.voltar3);
        EditText DIAGO = findViewById(R.id.DM);
        EditText diago = findViewById(R.id.Dm);
        TextView resultado3 = findViewById(R.id.resu3);

        cln3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DIAGO.setText("");
                diago.setText("");
                resultado3.setText("");

            }
        });

        callos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((DIAGO.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira o valor da diagonal maior ",Toast.LENGTH_SHORT).show();
                    DIAGO.requestFocus();

                }
                else if ((diago.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(),"Insira o valor da diagonal menor",Toast.LENGTH_SHORT).show();
                    diago.requestFocus();

                }

                else {
                    double DM = Double.parseDouble(DIAGO.getText().toString());
                    double Dm = Double.parseDouble(diago.getText().toString());
                    double calculo3 =( DM*Dm)/2;

                    resultado3.setText("A área do losango é: " + calculo3);

                }
            }
        });

        //BOTÃO PARA VOLTAR PARA A TELA INICIAL
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentback = new Intent(Losango.this,MainActivity.class);
                startActivity(intentback);
            }
        });



    }
}