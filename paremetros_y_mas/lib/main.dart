
import 'package:flutter/material.dart';
import 'package:paremetros_y_mas/resultados.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    

    return const MaterialApp(
      title: 'Material App',
      home: Home(),
    );
  }
}

class Home extends StatelessWidget {
  const Home({
    Key? key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {


    TextEditingController textoDelForm = TextEditingController(text: '');
    TextEditingController textoDelForm2 = TextEditingController(text: '');
    TextEditingController numero = TextEditingController(text: '' );
    
    return Scaffold(
      appBar: AppBar(
        title: const Text('Material App Bar'),
      ),
      body: Column(
        children: [
          Container(
            padding: const EdgeInsets.all(20.0),
            child: TextField(
              controller: textoDelForm,
              decoration: const InputDecoration (
                fillColor: Colors.amber),
            )
            ),

            Container(
            padding: const EdgeInsets.all(20.0),
            child: TextField(
  
              controller: textoDelForm2,
              decoration: const InputDecoration (labelText: 'Ingrese un numero',
                hintText: 'Para el appBar',
                fillColor: Colors.amber),
                //keyboardType: TextInputType.number,
            )
            ),

             Container(
            padding: const EdgeInsets.all(20.0),
            child: TextField(
  
              controller: numero,
              decoration: const InputDecoration (
                hintText: 'Numero',
                fillColor: Colors.amber),
                keyboardType: TextInputType.number,
            )
            ),

          ElevatedButton(
            onPressed: () {
              Navigator.push(context, MaterialPageRoute(builder: ((context) => Resultados(textoDelForm.text, textoDelForm2.text, int.parse(numero.text)))));
            }, 
            child: const Text('Enviar'))
        ],
      )
    );
  }
}