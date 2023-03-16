/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio01;

/**
 *
 * @author aluno
 */
public class Cerveja {
    public String marca;
    public String tipo;
    public double preco;
    public String teorAlcoolico;
    
    private int codigo;
    private String fabricante;

    public Cerveja(int cCodigo) {
        this.codigo = cCodigo;
    }
    public  void setAtributo(String aMarca, String aTipo, double aPreco, String aFabricante, String ateorAlcoolico){
    this.marca = aMarca;
    this.tipo = aTipo;
    this.teorAlcoolico = ateorAlcoolico;
    this.fabricante = aFabricante;
    }
    public int getCodigo(){
        return this.codigo;
       
    }
    public void printCerveja(){
        System.out.println("Nome da Cerveja"+marca);
        System.out.println("Tipo da Cerveja"+tipo);
        System.out.println("Preço da Cerveja"+preco);
        System.out.println("Teor Alcóolico da Cerveja"+codigo);
        System.out.println("Codigo da Cerveja"+marca);
        System.out.println("Fabricante da Cerveja"+fabricante);
    }
}
