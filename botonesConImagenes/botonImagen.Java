package com.example.botonescopados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView muestraSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        muestraSonido = findViewById(R.id.muestraSonido);
    }


    public void patito(View view){

        muestraSonido.setText("Cuack...Cuack...Cuack");

    }
}
