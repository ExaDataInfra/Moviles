import 'package:flutter/material.dart';

class MostrarAlerta extends StatelessWidget {
   
  const MostrarAlerta({Key? key}) : super(key: key);
  

  void muestraAlerta(BuildContext context){
    
    showDialog(
      barrierDismissible: false,
      context: context,
      builder: (context) {
        return  AlertDialog(
          elevation: 15,
          title: const Text("Mensaje emergente"),
          content: Column( 
            mainAxisSize: MainAxisSize.min,
            children: const [
              Text("Contenido de mi alerta"),
              
            ],
          ),

          actions: [
            TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: const Text('Aceptar')
              ),

              TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: const Text('Ignorar!')
              ),

              TextButton(
              onPressed: (){
                Navigator.pop(context);
              }, 
              child: const Text('Cerrar')
              ),
          
          ],
        );
      });
  }

  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: const Text("Menu de Ayuda"),
        backgroundColor: Colors.blue,

      ),

      body: Center(
        
        child: ElevatedButton(

        onPressed: () => muestraAlerta (context), 

        child:  const Padding(
          padding: EdgeInsets.symmetric(horizontal: 20, vertical: 20),
          child: Text("Mostrar Alertas"),),
          ),
      ),

      floatingActionButton: FloatingActionButton(
      child: const Icon (Icons.close),
        onPressed: () 
        {
          Navigator.pop(context);
        }
    )
    
    );
  }
}