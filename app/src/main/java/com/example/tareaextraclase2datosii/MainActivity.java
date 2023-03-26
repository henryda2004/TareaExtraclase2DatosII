package com.example.tareaextraclase2datosii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    EditText input1;
    EditText input2;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.text);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        boton = findViewById(R.id.boton);

        texto.setTextSize(25);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText(input1.getText().toString() + input2.getText().toString());
            }
        });

    }
}