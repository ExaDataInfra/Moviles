package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText etArchivo, etNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etArchivo = findViewById(R.id.etArchivo);
        etNotas = findViewById(R.id.etNotas);

    }


    public void guardar(View view){
        String nombreArchivo = etArchivo.getText().toString();
        String notas = etNotas.getText().toString();

        try {
            File file = new File(getExternalFilesDir(null), nombreArchivo);
            OutputStreamWriter outpuWriter = new OutputStreamWriter(new FileOutputStream(file));
            outpuWriter.write(notas);
            outpuWriter.flush();
            outpuWriter.close();

            etNotas.setText("");
            etArchivo.setText("");

            Toast.makeText(this, "La informacion se grabo bien!", Toast.LENGTH_SHORT).show();

        }catch (IOException ioe){

            Toast.makeText(this, "No ha sido posible grabar la informacion", Toast.LENGTH_SHORT).show();
        }
    }

   public void recuperar(View view){

        File file = new File(getExternalFilesDir(null), etArchivo.getText().toString());
        try{
            FileInputStream fileInStr = new FileInputStream(file);
            InputStreamReader archivo = new InputStreamReader(fileInStr);
            BufferedReader buffRed = new BufferedReader(archivo);
            String nline = buffRed.readLine();
            String notasGuardadas = "";

            while(nline != null){
                notasGuardadas = notasGuardadas + nline + "\n";
                nline = buffRed.readLine();
            }

            buffRed.close();
            archivo.close();

            etNotas.setText(notasGuardadas);

            Toast.makeText(this, "La informacion se recupero correctamente", Toast.LENGTH_SHORT).show();

        }catch (IOException e){

            Toast.makeText(this, "No ha sido posible recuperar la informacion", Toast.LENGTH_SHORT).show();
        }
   }
}

//clase1 dato de clase 1
//clase2 2 dato de clase 2
