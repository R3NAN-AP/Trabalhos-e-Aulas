/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria("João Silva", 1001, 1500.0f);
        ContaPoupanca conta2 = new ContaPoupanca("Maria Santos", 2002, 3000.0f, 15);
        ContaEspecial conta3 = new ContaEspecial("Pedro Souza", 3003, 2000.0f, 1000.0f);

        conta1.sacar(500.0f);
        conta1.depositar(1000.0f);

        conta2.calcularNovoSaldo(0.5f);

        conta3.sacar(2500.0f);
        conta3.sacar(1000.0f);
        conta3.depositar(500.0f);

    }
}
