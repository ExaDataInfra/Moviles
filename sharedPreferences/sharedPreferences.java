package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.etEmail);

        SharedPreferences pref = getSharedPreferences("datos", Context.MODE_PRIVATE);
        email.setText(pref.getString("mail",""));
    }

    public void guardar(View v){

        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail", email.getText().toString());

        System.out.println( preferencias.getString("mail", "No se encontro"));

        editor.commit();
        //finish();

    }

    public void verDatos(View v){
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        System.out.println( preferencias.getString("mail", "No se encontro"));
    }
}
