/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class IngressoVIP extends Ingresso{
    public float valorAdicional;
    
    public IngressoVIP(float valor, float valorAdicional){
      super(valor);   
      this.valorAdicional = valorAdicional;
    }
    
    public String toString() {
        return "IngressoVIP é: " + (valorAdicional + this.getValor());
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    
}
