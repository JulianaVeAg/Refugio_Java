/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;

import java.util.ArrayList;
import java.util.List;

public abstract class  Animal {

    protected String nombre;
    protected int edad;
    protected String especie;
    protected List<Dosis> historialVacunacion;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.historialVacunacion = new ArrayList<Dosis>();
    }

  

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract String nombre();
   
    
    public void addDosis(Dosis dosis) {
    	this.historialVacunacion.add(dosis);
    }
    
    public void addVacuna(Vacuna vacuna) {
    	Dosis dosis = new Dosis(vacuna);
    	this.historialVacunacion.add(dosis);
    }
       
    public void imprimirHistorialVacunacion() {
    	System.out.println("Historico de Vacunacion de " + this.nombre());
    	for(Dosis aux: this.historialVacunacion) {
    		System.out.println(aux);
    	}
    	System.out.println("---------------");
    }
    
}
