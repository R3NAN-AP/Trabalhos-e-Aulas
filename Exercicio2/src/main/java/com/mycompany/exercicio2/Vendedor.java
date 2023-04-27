/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado{
    
    private float percentualdeComissao;
    
    public Vendedor(float percentualdeComissao, String nome, float salario){
        super(nome, salario);
        this.percentualdeComissao = percentualdeComissao;
                }

    public float getPercentualdeComissao() {
        return percentualdeComissao;
    }

    public void setPercentualdeComissao(float percentualdeComissao) {
        this.percentualdeComissao = percentualdeComissao;
    }
    public float CalcularSalario(){
      float percentual = (this.getPercentualdeComissao()/10);
      
      float per = percentual * getSalario();
      
      return per;
    }
    
}
