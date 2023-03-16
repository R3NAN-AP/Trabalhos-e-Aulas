/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicior5;

/**
 *
 * @author Renan
 */
public class PedidoBar {
    
    public double valor;
    public int numMesa;
    public String bebida;
    public String comida;
    public int numPedido;
    
    

 
public void porMesa(int anumPedido, double valor, int anumMesa){
    this.valor = valor;   
    this.numMesa = anumMesa;
    this.numPedido = anumPedido;
    }
public void parteComida(String acomida, double avalor, int anumMesa){
    this.comida = acomida;
    this.valor = avalor;
    this.numMesa = anumMesa;
    } 
    public void parteBebida(String abebida, double avalor, int anumMesa){
    
    this.bebida = abebida;
    this.valor = avalor;   
    this.numMesa = anumMesa;

    } 
}
