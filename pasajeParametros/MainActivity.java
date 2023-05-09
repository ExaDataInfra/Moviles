package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.urlTV);


    }


    public void verWeb(View view){

        Intent verPaginaWeb = new Intent(this, VerWeb.class);
        verPaginaWeb.putExtra("direccion", url.getText().toString());
        startActivity(verPaginaWeb);
    }
}
