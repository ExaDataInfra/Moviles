package com.example.textoconvalidacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText usuario, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        clave = findViewById(R.id.clave);

    }

    public void login(View view){

        String claveString = clave.getText().toString();

        if(claveString.length() == 0){

            Toast claveVacia = Toast.makeText(this, "Ingrese una calave!!", Toast.LENGTH_LONG);
            claveVacia.show();

        }else{

            Toast claveVacia = Toast.makeText(this, "TODO OK!", Toast.LENGTH_LONG);
            claveVacia.show();

        }

    }
}
