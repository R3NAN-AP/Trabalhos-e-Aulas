/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

/**
 *
 * @author aluno
 */
public class Bicicleta {
    public String marca;
    public String fabricante;
    public String modelo;
    
    private int quantMarcha;
    private int tamanhoAro;
    private int tamanhoQuadro;
    private boolean freioDisco;
    
    public Bicicleta(String aMarca, String aFabricante, String aModelo){
        this.marca = aMarca; 
        this.fabricante = aFabricante; 
        this.modelo = aModelo; 
}
    
    public void setMarchaAro(int aquantMarcha, int aTamanhoAro){
        this.quantMarcha = aquantMarcha;
        this.tamanhoAro = aTamanhoAro;
       
    } 
    public void setQuadroFreio(int atamanhoQuadro, boolean tipoFreio){
        this.tamanhoQuadro = atamanhoQuadro;
        this.freioDisco = tipoFreio;
    }
    
    public void printBicicleta(){
        System.out.println("Marca da Bicicleta: "+marca);
        System.out.println("Fabricante da Bicicleta: "+fabricante);
        System.out.println("Modelo da Bicicleta: "+modelo);
        System.out.println("Quantidade de Marcha é : "+quantMarcha);
        System.out.println("Tamanho do Aro: "+tamanhoAro);
        System.out.println("Tamanho do Quadro: "+tamanhoQuadro);
        System.out.println("Tem Freio a Disco : "+freioDisco);
    }
}
