package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =findViewById(R.id.txtNumero1);
        num2 = findViewById(R.id.txtNumero2);
        resultado = findViewById(R.id.txtResultado);
    }

    public void suma(View vista){
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int suma = num1 + num2;
        String total = String.valueOf(suma);
        resultado.setText(total);

    }
}
