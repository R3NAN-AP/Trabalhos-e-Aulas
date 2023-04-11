/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class Desafio {
 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> banda = new ArrayList<String>();
        banda.add("Queen");
        banda.add("Bon jovi");
        banda.add("Coldplay");
        banda.add("Nazareth");
        banda.add("");
        banda.add("Nazareth");
        for(String b : banda){
             System.out.println(b);
        }
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Lista de Bandas!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Mostrar Lista");
        System.out.println("2 - Adiconar uma Banda!");
        System.out.println("3 - Excluir todos os nomes!");
        System.out.println("-------------------------------------------------");
         int opcao = Integer.parseInt(teclado.nextLine());
        
        switch(opcao){
            case 1:
                System.out.println("Você Escolheu Mostrar Lista");
                    for(String b : banda){
                        
             System.out.println(b);
        }
                break;
            case 2:
                System.out.println("Você Escolheu Adicionar uma Banda");
                
                System.out.println("Escreva o nome da banda:");
                String nomeBanda;
                nomeBanda = teclado.nextLine();
                banda.add(nomeBanda);
                for(String b : banda){
                        
             System.out.println(b);
        }
                break;
            case 3:
                System.out.println("Você Escolheu Excluir todos os nomes");
                banda.clear();
                System.out.println(banda);
                break;
                
        }
    }
}
