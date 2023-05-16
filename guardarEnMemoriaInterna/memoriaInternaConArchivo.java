package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText etFecha, etNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFecha = findViewById(R.id.etFechas);
        etNotas = findViewById(R.id.etNotas);
    }

    public void grabar(View view){

        String nombreArchivo = etFecha.getText().toString();
        try{
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(nombreArchivo, Activity.MODE_PRIVATE));
            archivo.write(etNotas.getText().toString());
            archivo.flush();
            archivo.close();

            etNotas.setText("");
            etFecha.setText("");

        }catch (IOException e){


        }
    }

    public void recuperar(View view){

        String nombreArchivo = etFecha.getText().toString();
        boolean encontrado = false;
        String[] archivos = fileList();


        for (int f = 0; f < archivos.length; f++){
            if(nombreArchivo.equals(archivos[f])){
                encontrado = true;
            }
        }

        if(encontrado == true){
            try{
                InputStreamReader archivo = new InputStreamReader(openFileInput(nombreArchivo));
                BufferedReader buffRed = new BufferedReader(archivo);
                String linea = buffRed.readLine();
                String acumulador = "";

                while(linea != null){
                    acumulador = acumulador + linea + "\n";
                    linea = buffRed.readLine();
                }

                buffRed.close();
                archivo.close();

                etNotas.setText("");
                etNotas.setText(acumulador);


            }catch (IOException e){


            }
        }else{
            Toast.makeText(this, "No hay datos almacenados", Toast.LENGTH_SHORT).show();
        }
    }

}
