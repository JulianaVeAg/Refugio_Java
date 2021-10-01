/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;


public class Gato extends Animal{
    
   protected String raza_gato;
   // protected final String especie="gato";
   // No tiene sentido volver a declararla aqui

    public Gato(String raza_gato, String nombre, int edad) {
    	// Lo que hacemos es pasar el valor de Gato directamente a la clase padre
        super(nombre, edad, "gato");
        this.raza_gato = raza_gato;
    }

    public String getRazaGato() {
        return raza_gato;
    }

// La funcion es la misma que en la padre, no es necesaria
//   @Override
//    public String getEspecie() {
//        return especie;
//    }

     
    @Override
     public  String nombre() {
        return "Gato: nombre "+ nombre + " edad: "+edad+ "raza: " + raza_gato;
    }
    

 

 
    
    
}
