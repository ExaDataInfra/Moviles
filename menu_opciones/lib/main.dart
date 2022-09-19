import 'package:flutter/material.dart';
import 'package:menu_opciones/pantallas/menuAyuda.dart';
import 'package:menu_opciones/pantallas/pantallaPrincipal.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Main',
      initialRoute: 'principal',
      //home: const PantallaPrincipal(),
      routes:{
        'principal': (BuildContext contex) => const PantallaPrincipal(),
        'menuAyuda': (BuildContext context) => const MenuAyuda()
      }
      
    );
  }
}