/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dipoo.velasquezjuliana;

import java.util.Scanner;

public class Main {
    
    public static void main ( String [] args){
        
	    Refugio peludos= new Refugio();
	    peludos.MostrarRefugio();
	    
	    Scanner entrada = new Scanner (System.in);
	    char opcion;
	 
	    
	    do{
	        peludos.entra_animal();
	        System.out.println("Desea dejar algun animal mas");
	        opcion= entrada.next().charAt(0);
	    }while(opcion == 's' || opcion== 'S');
	   
	  
	
	   
	    peludos.MostrarRefugio();
	    System.out.println("---------------");
	    peludos.Adopta_animal();
	    
	    peludos.MostrarRefugio();
	    
	    System.out.println("---------------");
	    peludos.Adopta_perro();
	   
	    
	    peludos.MostrarRefugio();
        
        
        
    }

  
    
}
