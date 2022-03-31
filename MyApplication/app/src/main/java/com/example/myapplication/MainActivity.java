package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double res, n1, n2;
    public EditText num1, num2;
    public TextView result;
    private Button soma, sub, div, mult, sair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etn1);
        num2 = (EditText) findViewById(R.id.etn2);
        soma = (Button) findViewById(R.id.btnSomar);
        sub = (Button) findViewById(R.id.btnSub);
        mult = (Button) findViewById(R.id.btnMult);
        div = (Button) findViewById(R.id.btnDiv);
        result = (TextView) findViewById(R.id.result);
        sair = (Button) findViewById(R.id.btnSair);


        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               converter();
                somar();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                subtrair();
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                multiplicar();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                dividir();
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

        public void converter(){
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
        }
        public void somar(){
            res = (n1 + n2);
            result.setText("" + res);
        }

        public void subtrair(){
            res = (n1 - n2);
            result.setText("" + res);
        }

        public void multiplicar(){
            res = (n1 * n2);
            result.setText("" + res);
        }

        public void dividir(){
            res = (n1 / n2);
            result.setText("" + res);
        }



}