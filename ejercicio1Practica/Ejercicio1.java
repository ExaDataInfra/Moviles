package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private TextView condicion, promedio;
    private EditText alumno, notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alumno = findViewById(R.id.etAlumno);
        notas = findViewById(R.id.etNotas);

        condicion = findViewById(R.id.tvCondicion);
        promedio = findViewById(R.id.tvPromedio);
    }

    public void guardarNotas(View view){
        String nombreAlumno = alumno.getText().toString();
        nombreAlumno = nombreAlumno.replace('/','-');

        try{
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(nombreAlumno, Activity.MODE_PRIVATE));
            archivo.write(notas.getText().toString());
            archivo.flush();
            archivo.close();
            Toast t = Toast.makeText(this, "Las notas fueron grabadas", Toast.LENGTH_SHORT);
            t.show();
            alumno.setText("");
            notas.setText("");
        }catch (IOException e){
            Toast t = Toast.makeText(this, "Ocurrió un error al grabar", Toast.LENGTH_SHORT);
            t.show();
        }

    }

    public void mostrarNotas(View v){
        String nombreAlumno = alumno.getText().toString();
        nombreAlumno = nombreAlumno.replace('/','-');

        boolean encontrado = false;
        String[] archivos = fileList();
        for (int f = 0; f < archivos.length; f++) {
            if (nombreAlumno.equals(archivos[f])) {
                encontrado = true;
            }
        }

        if(encontrado == true){
            try{
                InputStreamReader archivo = new InputStreamReader(openFileInput(nombreAlumno));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String nota = "";
                int cantNotas = 0;
                int notaAcumulada = 0;

                while (linea != null) {
                    int notaConvertida = Integer.parseInt(linea);
                    notaAcumulada = notaAcumulada + notaConvertida;
                    nota = nota + linea + "\n";
                    cantNotas++;
                    linea = br.readLine();
                }

                int promedioNotas = notaAcumulada/cantNotas;

                br.close();
                archivo.close();
                notas.setText(nota);
                promedio.setText(String.valueOf(promedioNotas));
                if(promedioNotas >= 4){
                    condicion.setText("APROBADO");
                }else{
                    condicion.setText("DESAPROBADO");
                }
            }catch (IOException e){

                Toast t = Toast.makeText(this, "Ocurrió un error al mostrar", Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
}
