package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);

        String[] archivos = fileList();

        if (existe(archivos, "comentarios.txt")) {

            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("comentarios.txt"));
                BufferedReader bufred = new BufferedReader(archivo);
                String linea = bufred.readLine();
                String comantarioInicial = "";

                while (linea != null) {
                    comantarioInicial = comantarioInicial + linea + "\n";
                    linea = bufred.readLine();
                }

                bufred.close();
                archivo.close();
                System.out.println(comantarioInicial);
                et1.setText(comantarioInicial);

            } catch (IOException e) {
            }
        }
    }

        private boolean existe(String[] archivos, String archivoBuscar) {

        for (int f = 0; f < archivos.length; f++) {
            if (archivoBuscar.equals(archivos[f])) {
                return true;
            }
        }
        return false;
    }


    public void grabar(View v) {

        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("comentarios.txt", Activity.MODE_PRIVATE));
            archivo.write(et1.getText().toString());
            //System.out.println("Dato del et1: " + et1.getText().toString());
            //archivo.write("string test");
            archivo.flush();
            archivo.close();
        } catch (IOException e) {
        }

        Toast aviso = Toast.makeText(this, "Los datos se guardaron bien!", Toast.LENGTH_SHORT);
        aviso.show();
        finish();
    }

}
