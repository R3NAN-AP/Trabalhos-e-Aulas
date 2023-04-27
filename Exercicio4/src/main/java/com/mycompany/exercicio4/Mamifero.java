/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

/**
 *
 * @author aluno
 */
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "Terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

   
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}
