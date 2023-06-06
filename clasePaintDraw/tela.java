Atención a las lineas 25 y 26

class Tela extends View {

    public Tela(Context context){
        super(context);
    }

    protected void onDraw(Canvas canvas){

        double aleatorio = Math.random();

        int randomEntero = (int)(Math.random()*(20-10+1));

        String cadena = String.valueOf(aleatorio);



        System.out.println(cadena);



        canvas.drawRGB(155, 255, 255);

        int anchura = canvas.getWidth();
        int altura = canvas.getWidth();

        System.out.println(anchura);

        Paint lapiz = new Paint();

        lapiz.setARGB(255, 255, 0, 0 );

        lapiz.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(anchura/2, altura/2, 5 * 90, lapiz);

        ///canvas.drawRect( 15, 10, anchura-195,50, lapiz );

        lapiz.setARGB(255, 255, 0, 0 );

        lapiz.setStyle(Paint.Style.STROKE);

        System.out.println(randomEntero);
       // canvas.drawRect( 100, 100, anchura-10, 590, lapiz );

        lapiz.setStrokeWidth(25);
        //canvas.drawRect( 10, 120, anchura-500, 150, lapiz );
    }

}
