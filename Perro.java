/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;


public class Perro  extends Animal{
    
    protected String raza_perro;

    public Perro(String raza_perro, String nombre, int edad) {
        super(nombre, edad, "perro");
        this.raza_perro = raza_perro;
    } 
   
  
    public String getRaza_perro() {
        return raza_perro;
    }

    
    @Override
     public  String nombre() {
        return "Perro: nombre: "+ nombre;
    }
}
