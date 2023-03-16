/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class CadastrarSintoma {
    public boolean dorCabeça;
    public double temperatura;
    public String pressao;
    public String nomeSintoma;
    public boolean cadastrado;
    
    public CadastrarSintoma(boolean aDorCabeça, double aTemperatura, String aPressao, String aNomeSintoma){
    this.dorCabeça = aDorCabeça;
    this.temperatura = aTemperatura;
    this.pressao = aPressao;
    this.nomeSintoma = aNomeSintoma;
    this.cadastrado = true;
    }
    public String getCadastrarSintomas(){
        String retorno = "Com dor de cabeça"+dorCabeça+"e com temperatura"+temperatura+" o paciente tem"+nomeSintoma;
        return retorno;
    }
}
