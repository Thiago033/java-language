/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembretesapp;

import java.util.Comparator;

/**
 *
 * @author Felipe Marques
 */
public class Data implements Comparable<Data> {
    private final int dia;
    private final int mes;
    private final int ano;
    private static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                                           "Maio", "Junho", "Julho", "Agosto",
                                           "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    /**
     * Método construtor de inicialização.
     * @param dia 
     * @param mes
     * @param ano
     */
    public Data(int dia, int mes, int ano) { // Considerar validar intervalos e lançar exceções
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    /**
     * Retorna o valor do dia da data.
     * @return Inteiro com o valor do dia.
     */
    public int dia() {
        return dia;
    }
    
    /**
     * Retorna o valor do mes da data.
     * @return Inteiro com o valor do mes.
     */
    public int mes() {
        return mes;
    }
    
    /**
     * Retorna o valor do ano da data.
     * @return Inteiro com o valor do ano.
     */
    public int ano() {
        return ano;
    }
    
    /**
     * Sobrescrita do método toString para retornar a data DIA/MES/ANO.
     * @return String no formato usual de data.
     */
    @Override
    public String toString() {
        return (dia < 10 ? "0"+dia : dia) + "/" + (mes < 10 ? "0"+mes : mes) + "/" + ano;
    }
    
    /**
     * Método para retornar a data por extenso em uma string.
     * @return String com a data por extenso (nomes dos meses).
     */
    public String porExtenso() {
        return (dia < 10 ? "0"+dia : dia) + " de " + nomeDoMes(mes) + " de " + ano;
    }
    
    /**
     * Retorna o nome de um mês a paritr de um número.
     * @param mes Inteiro indicando um dos meses do ano.
     * @return String com o nome do mês.
     */
    public static String nomeDoMes(int mes) {
        if (mes > 0 && mes < 13)
            return meses[mes-1];
        return null;
    }

    /**
     * Sobrescrita do método equals, que compara dois objetos para verificar a
     * igualdade.
     * @param o Referência ao objeto que deve ser comparado com a instância (this).
     * @return Retorna ttue se os objetos são iguais e falso caso contrário.
     */
    @Override
    public boolean equals(Object o) {
       if (this == o) {  
           return true;  
       }  
       if (o instanceof Data) {  
           Data outraData = (Data) o;  
           if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {  
               return true;  
           }  
       }  
       return false;              
    }

    /**
     * Sobrescrita do método compare para compareTo duas datas e determinar qual
     * é maior ou se são iguais.
     * @param data - objeto Data com que a instância (this) será comparada.
     * @return Retorna um valor positivo se data1 for maior que data2, negativo
     * se data1 for menor que data2 e zero se forem iguais.
     */
    @Override
    public int compareTo(Data data) {
        if (this.equals(data))
            return 0;
        if (this.ano == data.ano && this.mes == data.mes)
            return this.dia - data.dia;
        if (this.ano == data.ano)
            return this.mes - data.mes;
        return this.ano - data.ano;
    }
}