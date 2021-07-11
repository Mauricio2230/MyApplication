package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int suma = n1 + n2;
        String total = String.valueOf(suma);
        resultado.setText(total);


        Toast.makeText(this,"El resultado: "+total,Toast.LENGTH_LONG).show();
        Toast.makeText(this,"El resultado2: "+total,Toast.LENGTH_LONG).show();
        Toast.makeText(this,"El resultado3: "+total,Toast.LENGTH_LONG).show();
        Toast.makeText(this,"El resultado4: "+total,Toast.LENGTH_LONG).show();



    }
}
