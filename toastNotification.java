package com.example.toastnotifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ingresoDatos;
    private String cadena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ingresoDatos = findViewById(R.id.ingresoTexto);

        cadena = "Muestro Dato";

        Toast notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG);

        if(true){

            notificacion.show();
        }


    }


    public void mostrarPopUp(View view){

        String textoIngresado = ingresoDatos.getText().toString();



        Toast notificacion = Toast.makeText(this, textoIngresado, Toast.LENGTH_LONG);
        notificacion.show();


    }
}
