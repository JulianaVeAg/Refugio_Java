/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;


import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Scanner;


public class Refugio{
    LinkedList <Animal> animales = new LinkedList <Animal>();

    Scanner entrada = new Scanner(System.in);
    
     public void entra_animal(){
        int opcion;
        
        System.out.println("Indique que tipo de animal va a entrar en el refugio");
        System.out.println("1.Perro");
        System.out.println("1.Gato");
        System.out.println("Opcion");
        opcion= entrada.nextInt();
        
        switch (opcion){
            case 1 -> entra_perro(); //LLenar Perro
            case 2 -> entra_gato();//Llenar Gato
            default -> System.out.println("Opción incorrecta");
        }
    }

     public void entra_perro(){
        String nombre;
        int edad;
        String raza_perro;
        String especie;
        
        System.out.println("Introduzca el nombre del perro");
        nombre=entrada.next();
        System.out.println("Introduzca la edad del perro");
        edad=entrada.nextInt();
        System.out.println("Introduzca la raza del perro");
        raza_perro= entrada.next();
        System.out.println("Introduzca la especie");
        especie= entrada.next();
        
        Perro perro = new Perro (raza_perro,nombre,edad,especie);
        
        animales.add(perro);
    }
    
        public void entra_gato(){
        String nombre;
        int edad;
        String raza_gato;
        String especie;
      
        
        System.out.println("Introduzca el nombre del gato");
        nombre=entrada.next();
        System.out.println("Introduzca la edad del gato");
        edad=entrada.nextInt();
        System.out.println("Introduzca la raza del gato");
        raza_gato= entrada.next();
        System.out.println("Introduzca la especie");
        especie= entrada.next();
        
        Gato gato = new Gato (raza_gato,nombre, edad,especie);
        
        animales.add(gato);
    }
    
    public void MostrarRefugio (){
        for(Animal ani : animales){
            System.out.println(ani.nombre());
            if(animales.isEmpty()){
                System.out.println("No hay animales en el refugio");
            }
        }
    }
   
    public void Adopta_animal (){
        
        animales.poll();
        System.out.println("Un animal ha sido adoptado");
        MostrarRefugio();
    }
    
    public void Adopta_perro(){
        
     for (int i=0;i<animales.size();i++){
         if ("perro".equals(animales.get(i).getEspecie()));{
         System.out.println("El perro mas antiguo es "+animales.get(i).getNombre());
        
     }break;   
     }
     
     
     
     
     
    }
    
    
    
}

