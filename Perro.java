/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;


public class Perro  extends Animal{
    
    protected String raza_perro;
    protected final String especie= "perro";

    public Perro(String raza_perro, String nombre, int edad, String especie) {
        super(nombre, edad, especie);
        this.raza_perro = raza_perro;
    }

    


  
   
  
    public String getRaza_perro() {
        return raza_perro;
    }

    @Override
    public String getEspecie() {
        return especie;
    }
    
    
    
    
    @Override
     public  String nombre() {
        return "Perro: nombre: "+ nombre + " edad: " + edad + "raza: " + raza_perro;
    }
   
    
    
}
