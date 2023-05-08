    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {


        private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombreET);

    }
    
    public void acercaDeMiApp(View view){
        String nombreIngresado = nombre.getText().toString();

        if(nombreIngresado.equals("pepe")){

            Intent acerca = new Intent(this, acercaDe.class);
            startActivity(acerca);

        }else{

            Toast error = Toast.makeText(this, "ERROR! No es el nombre correcto", Toast.LENGTH_LONG);
            error.show();
        }



    }
}
