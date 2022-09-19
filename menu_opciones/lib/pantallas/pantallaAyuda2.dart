import 'package:flutter/material.dart';

class PantallaAyuda2 extends StatelessWidget {
   
  const PantallaAyuda2({Key? key}) : super(key: key);
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
         child: RichText(
            text: TextSpan(
              style: DefaultTextStyle.of(context).style,
              children: <TextSpan>[
                TextSpan(
                  text: "You don't have the votes.\n",
                  style: TextStyle(color: Colors.black.withOpacity(0.6)),
                ),
                TextSpan(
                  text: "You don't have the votes!\n",
                  style: TextStyle(color: Colors.black.withOpacity(0.8)),
                ),
                TextSpan(
                  text: "You're gonna need congressional approval and you don't have the votes!\n",
                  style: TextStyle(color: Colors.black.withOpacity(1.0)),
                ),
              ],
    ),
  ),
        ),
      );
    }
  }