package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtresultado=findViewById(R.id.txtResultado);
        EditText n1=findViewById(R.id.txn1);
        EditText n2=findViewById(R.id.txtn2);
        Button sumar=findViewById(R.id.btnSuma);
        Button restar=findViewById(R.id.btnResta);
        Button dividir=findViewById(R.id.btnDivision);
        Button multiplicar=findViewById(R.id.btnMultiplicacion);




        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                int resultado= numero1 + numero2;

                txtresultado.setText("El resultado es:" + resultado);
            }
        });



        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                int resultado= numero1 - numero2;

                txtresultado.setText("El resultado es:" + resultado);
            }
        });


        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                int resultado= numero1 / numero2;

                txtresultado.setText("El resultado es:" + resultado);
            }
        });


        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                int resultado= numero1 * numero2;

                txtresultado.setText("El resultado es:" + resultado);
            }
        });
    }
}