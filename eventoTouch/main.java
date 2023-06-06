package com.example.myapplication;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    public int coordenadaX, coordenadaY;
    private Tela fondoApp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordenadaX = 100;
        coordenadaY = 100;

        ConstraintLayout  layout1 = findViewById(R.id.idFondo);

        fondoApp = new Tela(this);
        fondoApp.setOnTouchListener(this);
        layout1.addView(fondoApp);

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {

        coordenadaX = (int) event.getX();
        coordenadaY = (int) event.getY();
        fondoApp.invalidate();
        return true;
    }

    class Tela extends View {

        public Tela(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){

            double aleatorio = Math.random();

            int randomEntero = (int)(Math.random()*(20-10+1));

            String cadena = String.valueOf(aleatorio);



            System.out.println(cadena);



            canvas.drawRGB(255, 255, 255);

            int anchura = canvas.getWidth();
            int altura = canvas.getWidth();

            System.out.println(anchura);

            Paint lapiz = new Paint();

            lapiz.setARGB(255, 255, 0, 0 );

            lapiz.setStyle(Paint.Style.STROKE);
            lapiz.setStrokeWidth(5);
            canvas.drawCircle(coordenadaX, coordenadaY, 20, lapiz);


        }

    }
}
