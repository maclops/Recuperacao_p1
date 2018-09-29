package com.example.maclops.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textoSoma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoSoma = findViewById(R.id.textoSoma);
    }

    public void soma(View view) {

        int n1 = R.id.editTextN1;
        int n2 = R.id.editTextN2;
        int n3 = R.id.editTextN3;

        int media = (n1 + n2 + n3) / 3;

        textoSoma.setText("Média final: "+ (media));

    }
}
