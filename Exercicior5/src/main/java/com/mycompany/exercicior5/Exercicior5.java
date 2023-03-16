/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicior5;

/**
 *
 * @author Renan
 */
public class Exercicior5 {

     public static void main(String[] args) {
     
      double soma = 0;
        
        PedidoBar pedido1 = new PedidoBar();
        PedidoBar pedido2 = new PedidoBar();
        PedidoBar pedido3 = new PedidoBar();
        PedidoBar pedido4 = new PedidoBar();
        PedidoBar pedido5 = new PedidoBar();
        
            pedido1.parteBebida("Cerveja", 13.00, 6);
            soma += pedido1.valor;
            pedido2.parteComida("Tilapia", 7.50, 3);
            soma += (pedido2.valor * 3);
            pedido3.porMesa(1, 20.50, 12);
            soma += pedido3.valor;
            pedido4.parteBebida("Coca-cola", 5.35, 5);
            soma += pedido4.valor;
            pedido5.porMesa(4, 2.0, 3);
            soma += (pedido5.valor * 4);
           
           
            System.out.println("A soma total dos Pedidos: " + soma);
    
    }
}
