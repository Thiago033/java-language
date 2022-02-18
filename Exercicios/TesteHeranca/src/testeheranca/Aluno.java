/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

/**
 *
 * @author Felipe Marques
 */
public class Aluno extends Pessoa {
    private int matricula;
    
    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    public void imprimir() {
        System.out.println("Matrícula: " + matricula);
        super.imprimir();
    }
}
