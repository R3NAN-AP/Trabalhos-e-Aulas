/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {
     CadastrarSintoma sintoma1 = new CadastrarSintoma(true,41.6,"12/8","CANCER");
     CadastrarSintoma sintoma2 = new CadastrarSintoma(false,4.6,"19/10","AIDS");
     CadastrarSintoma sintoma3 = new CadastrarSintoma(true,90.6,"21/10","SAUDAVEL");
     
     Paciente paciente1 = new Paciente();
     paciente1.setPaciente("Renan",17,"Masculino","Amil");
     paciente1.setCadastrarSintoma(sintoma1);
     
     Paciente paciente2 = new Paciente();
     paciente2.setPaciente("Luis",72,"Feminino","Unimed");
     paciente2.setCadastrarSintoma(sintoma2);
     
     Paciente paciente3 = new Paciente();
     paciente3.setPaciente("Luana",18,"Masculino","Amil");
     paciente3.setCadastrarSintoma(sintoma3);
     
     Paciente paciente4 = new Paciente();
     paciente4.setPaciente("Mariana",20,"Masculino","Amil");
     paciente4.setCadastrarSintoma(sintoma2);
     
     Paciente paciente5 = new Paciente();
     paciente5.setPaciente("Renan",17,"Masculino","Amil");
     paciente5.setCadastrarSintoma(sintoma3);
     
     Paciente paciente6 = new Paciente();
     paciente6.setPaciente("Renan",17,"Masculino","Amil");
     paciente6.setCadastrarSintoma(sintoma2);
     
    }
}
