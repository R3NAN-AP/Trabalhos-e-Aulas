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
        banda.add("The Beatles");
        
        
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Lista de Bandas!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Mostrar Lista");
        System.out.println("2 - Adiconar uma Banda!");
        System.out.println("3 - Remover uma banda");
        System.out.println("4 - Excluir todos os nomes!");
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
                
                System.out.println("Banda Adicionada com Sucesso!");
                System.out.println("-------------------------------------------------");
                System.out.println("1 - Deseja visualizar a Lista novamente");
                System.out.println("2 - Sair");
                
                int mostra = Integer.parseInt(teclado.nextLine());
                    switch(mostra){
                        case 1:
                            for(String b : banda){      
                            System.out.println(b); 
                            }break;
                        case 2:
                            System.out.println("Você escolheu Sair!"); 
                            break;  
                    }break;
                      
                  
            case 3:
                System.out.println("Você Escolheu Remover uma banda");
                System.out.println("-------------------------------------------------");
                System.out.println("Digite o número da banda que deseja remover começando da posição 0:");
                int indBanda;
                indBanda = teclado.nextInt();
                banda.remove(indBanda);
                System.out.println("Banda Removida com Sucesso!");
                System.out.println("-------------------------------------------------");
                System.out.println("-------------------------------------------------");
                System.out.println("Essa é a Lista Agora!");
                for(String b : banda){      
                            System.out.println(b); 
                            }break;
                                  
            case 4:
                System.out.println("Você Escolheu Excluir todos os nomes");
                banda.clear();
                System.out.println("Lista Deletada com Sucesso!");
                    System.out.println("-------------------------------------------------");
                    System.out.println("1 - Deseja visualizar a Lista novamente");
                    System.out.println("2 - Sair");
                    
                    int listadeletada = Integer.parseInt(teclado.nextLine()); 
                    switch(listadeletada){
                        case 1:
                                System.out.println("Sem Lista Disponivel!");
                            break;
                        case 2:
                            System.out.println("Você escolheu Sair!"); 
                            break;  
                    }break;  
        }
    }
}
