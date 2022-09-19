import 'package:flutter/material.dart';

class MenuAyuda extends StatelessWidget {
   
  const MenuAyuda({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      appBar: AppBar(
        title: const Text("Menu de Ayuda"),
        backgroundColor: Colors.blue,

      ),
      body: const Center(
        child: ElevatedButton(

        onPressed: null,

        child: Padding(
          padding: EdgeInsets.symmetric(horizontal: 20, vertical: 20),
          child: Text("Mostrar Alerta"),),
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