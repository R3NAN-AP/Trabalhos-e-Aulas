/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria{
     private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > 0 && (saldo - valor) >= -limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
