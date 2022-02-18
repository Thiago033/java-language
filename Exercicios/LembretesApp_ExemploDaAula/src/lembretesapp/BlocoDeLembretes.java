/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembretesapp;

/**
 * Classe BlocoDeLembretes definida no enunciado do exercício 2.
 * @author Felipe Marques
 */
public class BlocoDeLembretes {
    private Lembrete[] lista;
    private int numeroDeLembretes;
    
    /**
     * Exercício 2 - Contrutor padrão, instanciando um vetor com 10 posições.
     */ 
    public BlocoDeLembretes() {
        lista = new Lembrete[10];
        numeroDeLembretes = 0;
    }
    
    /**
     * Exercício 3.a - Método de inserção, que recebe um objeto
     * Lembrete como parâmetro e o adiciona no array, sempre na última posição 
     * da lista.
     * @param l - Lembrete que deve ser inserido na lista.
     */
    public void incluirLembrete(Lembrete l) {
        if (numeroDeLembretes < lista.length)
            lista[numeroDeLembretes++] = l;
    }
    
    /**
     * Exercício 3.b - Método para retornar o número de lembretes armazanados
     * na lista.
     * @return Inteiro com o número de lembretes armazenados na lista.
     */
    public int numeroDeLembretes() {
        return numeroDeLembretes;
    }
    
    /**
     * Exercício 4 - Método para remover um lembrete a partir do seu índice da lista.
     * @param indice - Indice do lembrete a ser removido.
     */
    public void removerLembrete(int indice) {
        if (indice >= 0 && indice < lista.length) {
            int i;
            for (i = indice; i < numeroDeLembretes-1; i++)
                lista[i] = lista[i+1];
            numeroDeLembretes--;
        }
    }
    
    /**
     * Exercício 5 - Imprime todos os lembretes da lista.
     */
    public void listarLembretes() {
        int i;
        for (i = 0; i < numeroDeLembretes; i++)
            lista[i].imprimir();
    }
    
    /**
     * Exercício 6 - Imprimir lista de lembretes para uma determinada data.
     * @param d - Data para selecionar os lembretes.
     */
    public void buscarLembretesPorData(Data d) {
        int i;
        for (i = 0; i < numeroDeLembretes; i++)
            if (lista[i].data().equals(d))
                lista[i].imprimir();
    }
    
    /**
     * Exercício 7 - Imprimir lista de lembretes que contenham uma determinda 
     * substring.
     * @param sub - Substring para ser encontrada no nome do lembrete.
     */
    public void buscarLembretesPorNome(String sub) {
        int i;
        for (i = 0; i < numeroDeLembretes; i++)
            if (lista[i].nome().contains(sub))
                lista[i].imprimir();
    }
}
