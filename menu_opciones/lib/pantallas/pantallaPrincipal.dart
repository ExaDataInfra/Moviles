import 'package:flutter/material.dart';
import 'package:menu_opciones/pantallas/inputEnFlutter.dart';
import 'package:menu_opciones/pantallas/menuAyuda.dart';
import 'package:menu_opciones/pantallas/mostrarAlerta.dart';
//import 'package:menu_opciones/pantallas/menuAyuda.dart';

class PantallaPrincipal extends StatelessWidget {
   
  const PantallaPrincipal({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      drawer:  Drawer(
        child: Container(
         padding: const EdgeInsets.all(0),
          color: Colors.white,
          child: Column(
              children: [
                const SizedBox (
                  width: 120,
                  height: 180,
                    child: CircleAvatar(
                    minRadius: 40,
                    backgroundImage: NetworkImage("https://elcomercio.pe/resizer/qxhTjSWLZSvEATPaD2fqSkeVp7o=/1200x900/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/272MPGXCHJGHFAPTENB7K6Q4LY.jpg"),
                  )
                 // 
                
                  
                ),
                //Image.network("https://static.wikia.nocookie.net/hitlerparody/images/a/ab/Homer-simpson.jpg/revision/latest?cb=20180412155103&path-prefix=es"),
                const Text("Kingdom of Dram´s App", style: TextStyle(fontWeight: FontWeight.bold, fontSize: 25),),
                
                const Divider(color: Colors.blue),
                
                ListTile(
                  subtitle: const Text("Esto es un subtitulo"),
                  leading: const Icon(Icons.ac_unit),
                  title: const Text("Home"),
                  onTap:() {
            
                      //Contx es como una memoria de como esta armada la app
                      Navigator.pop(context);
                      Navigator.push(context, MaterialPageRoute(builder: (context) => const MenuAyuda()));

                   },
                ),

                const Divider(color: Colors.black54),

                
                ListTile(
                  leading: const Icon(Icons.add_alert),
                  title: const Text("Mostrar Alerta"),
                  onTap: () {

                      Navigator.pop(context);
                      Navigator.push(context, MaterialPageRoute(builder: (context) => const MostrarAlerta()));

                  },
                ),

                const Divider(color: Colors.black54),

                ListTile(
                  leading: const Icon(Icons.fire_extinguisher),
                  title: const Text("Go to Inferno"),
                  onTap: () {

                      Navigator.pop(context);
                      Navigator.push(context, MaterialPageRoute(builder: (context) => const InputEnFlutter(),));
                  },
                ),
              ]
            )
          ),   
      ),

      

      appBar: AppBar(
        title: const Text("Mi aplicacion"),
        //backgroundColor: const Color.fromARGB(255, 152, 249, 155),
      ),

      body: 
      Row(

        crossAxisAlignment: CrossAxisAlignment.center,

        children:  [

          Column(
            children:[
              
              const Padding(

                padding: EdgeInsets.all(16.0),
                //child: Text('Hello World!'),
              ),

              const Text("Kingdom of Dram´s App", style: TextStyle(fontWeight: FontWeight.bold, fontSize: 40),),

              const Divider(color: Colors.black54),
              
              SizedBox(
                width: 540,
                height: 480,
                child: Image.network("https://www.telam.com.ar/thumbs/bluesteel/advf/imagenes/2022/08/62ec2293d965e_900.jpg"),
              ),
              
             
            ],
              
          )
          
        ],
      ),

      floatingActionButton: FloatingActionButton(
      tooltip: 'Esto es una prueba',
      child: const Icon (Icons.close),
        onPressed: () 
        {
        print("SE CERRO LA APP");
        }
    )
       /*body: const Center(
          child: Text("Kingdom of Dram´s App", style: TextStyle(fontWeight: FontWeight.bold, fontSize: 40),), 
        )*/
          
        );
  }
}