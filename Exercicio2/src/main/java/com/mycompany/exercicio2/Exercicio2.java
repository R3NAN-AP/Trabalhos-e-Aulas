/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Empregado emp = new Empregado("Renan", 1600);
        Gerente ger = new Gerente("Comercial", emp.getNome(), emp.getSalario());
        Vendedor vend= new Vendedor (20, emp.getNome(), emp.getSalario());
        
        System.out.println(emp.toString());
        System.out.println(ger.toString());
        System.out.println(vend.toString());
    }
  
}
