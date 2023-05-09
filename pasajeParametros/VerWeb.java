package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class VerWeb extends AppCompatActivity {

    WebView paginaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_web);

        paginaWeb = findViewById(R.id.webView);

        Bundle paquete = getIntent().getExtras();

        String datoURL = paquete.getString("direccion");

        paginaWeb.loadUrl("https://" + datoURL);
    }


    public void salir(View v){
        finish();

    }
}
