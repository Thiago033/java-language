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
public class Pessoa extends SerVivo {
    private String nome;
    private String cpf;
    
    public Pessoa(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade() + " - " + (estaVivo() ? "Está vivo.":"Está morto."));
    }
}
