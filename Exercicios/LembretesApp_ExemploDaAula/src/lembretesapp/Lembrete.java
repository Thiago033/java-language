/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembretesapp;

/**
 *
 * @author Felipe Marques
 */
public class Lembrete {
    private Data notificacao;
    private String nome;
    private String descricao;
    
    /**
     * Exercício 1 - Construtor de inicialização.
     */ 
    public Lembrete(String nome, String descricao, Data notificacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.notificacao = notificacao;
    }
    
    /**
     * Exercício 1 - Método para impressão.
     */
    public void imprimir() {
        System.out.println("| Data: " + notificacao + " | Lembrete: " + nome + " | Descrição: " + descricao);
    }
    
    /**
     * Retorna a data do lembrete.
     * @return Referência com a instância da data do lembrete.
     */
    public Data data() {
        return notificacao;
    }

    /**
     * Retorna o nome do lembrete.
     * @return String com o nome do lembrete.
     */
    public String nome() {
        return nome;
    }

}
