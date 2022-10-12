package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText etn1;
    private EditText etn2;
    private EditText etn3;
    private EditText etn4;
    private TextView tvresul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1 = (EditText) findViewById(R.id.txt_nota1);
        etn2 = (EditText) findViewById(R.id.txt_nota2);
        etn3 = (EditText) findViewById(R.id.txt_nota3);
        etn4 = (EditText) findViewById(R.id.txt_nota4);
        tvresul = (TextView) findViewById(R.id.txt_resultado);
    }
        public void calcular (View view){

            String nota1_String = etn1.getText().toString();
            String nota2_String = etn2.getText().toString();
            String nota3_String = etn3.getText().toString();
            String nota4_String = etn4.getText().toString();
            int nota1_int = Integer.parseInt(nota1_String);
            int nota2_int = Integer.parseInt(nota2_String);
            int nota3_int = Integer.parseInt(nota3_String);
            int nota4_int = Integer.parseInt(nota4_String);

            int promedio = (nota1_int+nota2_int+nota3_int+nota4_int)/4;

            if (promedio >=2030){
                tvresul.setText("Alumno Aprobado con " + promedio);
            }else if (promedio <= 29){
                tvresul.setText("Alumno Reprobado con " + promedio);
            }
        }
}