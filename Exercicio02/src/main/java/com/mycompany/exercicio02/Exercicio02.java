/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio02;

/**
 *
 * @author aluno
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Caloi", "Caloi", "Mountain Bike");
        bike1.setMarchaAro(6,17);
        bike1.setQuadroFreio(17,true);
        
        Bicicleta bike2 = new Bicicleta("Mormai", "Adidas", "Speed");
        bike2.setMarchaAro(16,7);
        bike2.setQuadroFreio(15,false);
        
        Bicicleta bike3 = new Bicicleta("Tottem", "Tots", "Mountain Bike");
        bike3.setMarchaAro(10,29);
        bike3.setQuadroFreio(20,true);
        
        Bicicleta bike4 = new Bicicleta("Shimano", "Shimano", "BMX");
        bike4.setMarchaAro(7,29);
        bike4.setQuadroFreio(17,false);
        
        for(int i=0;i < 4;i++){
        System.out.println("Primeiro Loop: "+ i);
        bike1.printBicicleta();
        System.out.println("Fim Loop: "+ i);
        bike2.printBicicleta();
    }
        
    }
}
