import 'package:flutter/material.dart';

class InputEnFlutter extends StatelessWidget {

  const InputEnFlutter({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Formulario"),
      ),

      body: SingleChildScrollView(

        child: Padding(

          padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 20),

          child: Column(
            children: [

              TextFormField(
                autofocus: true,
                initialValue: '',
                onChanged: (nombre) {
                  print(nombre);
                },

                validator: (nombre) {
                  if (nombre == null) {
                    return 'El valor es requerido!';
                  }
                  return nombre.length < 3 ? 'No pasa la validación' : 'Esta OK!';
                      
                     
                },
                autovalidateMode: AutovalidateMode.onUserInteraction,

                decoration: const InputDecoration(
                  hintText: 'Hola soy un hint!', 
                  labelText: 'Soy el de ARRIBAAA',
                  helperText: 'Ayuda',
                  suffixIcon: Icon(Icons.abc),
                  border: OutlineInputBorder()
                ),
                
              ),
              
              const Divider(color: Color.fromARGB(88, 0, 0, 0)),

              TextFormField(
                autofocus: false,
                initialValue: '',
                keyboardType: TextInputType.visiblePassword,
                obscureText: true,
                onChanged: (valor2) {
                  print(valor2);
                },
                validator: (valor2) {
                  if (valor2 == null) {
                    return 'Se requiere!';
                  }
                  return valor2.length < 3
                      ? 'No pasa la validación'
                      : 'Esta OK!';
                },
                autovalidateMode: AutovalidateMode.onUserInteraction,
                decoration: const InputDecoration(
                hintText: 'Escribí!', labelText: 'Apellido',
                helperText: 'Ayuda',
                suffixIcon: Icon(Icons.abc),
                border: OutlineInputBorder()
                ),
                
              ),

              TextFormField(
                autofocus: false,
                initialValue: '',
                keyboardType: TextInputType.url ,
                onChanged: (valor2) {
                  print(valor2);
                },

                validator: (valor2) {
                  if (valor2 == null) {
                    return 'Se requiere!';
                  }
                  return valor2.length < 3
                      ? 'No pasa la validación'
                      : 'Esta OK!';
                },
                
                autovalidateMode: AutovalidateMode.onUserInteraction,
                decoration: const InputDecoration(
                hintText: 'Escribí!', labelText: 'Correo',
                helperText: 'Ayuda',
                suffixIcon: Icon(Icons.abc),
                border: OutlineInputBorder()
                ),
                
              ),


              ElevatedButton(
                onPressed: () {

                  FocusScope.of(context).requestFocus(FocusNode());

                }, 
                child: const  SizedBox(
                  child: Center(
                    child: Text('Grabar')
                    )
                  )
                ),
              
               ElevatedButton(
                onPressed: () {}, 
                child: const  SizedBox(
                  child: Center(
                    child: Text('Salir')
                    )
                  )
                )
            ],
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
          onPressed: () => Navigator.pop(context),
          child: const Icon(Icons.close)),
    );
  }
}
