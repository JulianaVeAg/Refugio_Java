/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;


public class Gato extends Animal{
    
   protected String raza_gato;
   protected final String especie="gato";

    public Gato(String raza_gato, String nombre, int edad, String especie) {
        super(nombre, edad, especie);
        this.raza_gato = raza_gato;
    }

   
    


    public String getRaza_gato() {
        return raza_gato;
    }

   @Override
    public String getEspecie() {
        return especie;
    }

    
    
    @Override
     public  String nombre() {
        return "Gato: nombre "+ nombre + " edad: "+edad+ "raza: " + raza_gato;
    }
    

 

 
    
    
}
