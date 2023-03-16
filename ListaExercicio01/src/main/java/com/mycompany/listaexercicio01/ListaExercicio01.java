/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaexercicio01;

/**
 *
 * @author aluno
 */
public class ListaExercicio01 {
    
     public static void main(String[] args){
         
        Cerveja cerveja1 =new Cerveja(12345678);
        Cerveja cerveja2 =new Cerveja(99);
        Cerveja cerveja3 =new Cerveja(8989898);
        Cerveja cerveja4 =new Cerveja(7567567);
        Cerveja cerveja5 =new Cerveja(156958659);
     
    
        cerveja1.setAtributo("Sol", "Pilsen", 15.50, " AMBEV","9.0%" );
        cerveja2.setAtributo("Budweiser", "Puro Malte", 16.50, " AMBEV", "10.0%");
        cerveja3.setAtributo("Brahma", "Duplo Malte", 17.50, " AMBEV", "8.6%");
        cerveja4.setAtributo("Sol", "Pilsen", 16.70, " AMBEV", "0.8%");
        cerveja5.setAtributo("Sol", "Chopp", 18.40, " AMBEV", "3.0%");
    
            
        cerveja1.printCerveja();
        cerveja2.printCerveja();
        cerveja3.printCerveja();
        cerveja4.printCerveja();
        cerveja5.printCerveja();
     }
}

