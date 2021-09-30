/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;

import java.util.Scanner;

public class Main {
    
    public static void main ( String [] args){
        
    Refugio peludos= new Refugio();
    Scanner entrada = new Scanner (System.in);
    char opcion;
 
    
    do{
        peludos.entra_animal();
        System.out.println("Desea dejar algún animal más");
        opcion= entrada.next().charAt(0);
    }while(opcion == 's' || opcion== 'S');
   
  

   
    peludos.MostrarRefugio();
    System.out.println("---------------");
    peludos.Adopta_animal();
    
    System.out.println("---------------");
    peludos.Adopta_perro();
   
    
    

 
  
    
    
    
    
        
        
        
    }

    private static void entra_animal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
