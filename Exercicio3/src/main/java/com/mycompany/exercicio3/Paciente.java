/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class Paciente {
    private String nome;
    private int idade;
    private String sexo;
    private String convenio;
    public CadastrarSintoma sintoma; 
    
  
    
   public void setPaciente(String aNome, int aIdade, String aSexo, String aConvenio){
       this.nome = aNome;
       this.idade = aIdade;
       this.sexo = aSexo;
       this.convenio = aConvenio;
}
   
    public void setCadastrarSintoma(CadastrarSintoma aSintoma){
        this.sintoma = aSintoma;
    }

}

