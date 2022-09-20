

import 'package:flutter/material.dart';

class Resultados extends StatelessWidget {

  final String textoTraido;
  final String textoTraido2;
  final int numero;

  const Resultados(this.textoTraido, this.textoTraido2, this.numero, {super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(textoTraido2)
        
        ),
        body: Center(
          child: muestra(numero)
          )
      );
  }
}

Widget muestra(numeroP){
numeroP = numeroP + 15;
print(numeroP);
  if(numeroP == 5){
  
    return const Text('Es un texto A');
  }else{
    return const Text('Es un texto B. Numero es igual.');
    
  }
  

}