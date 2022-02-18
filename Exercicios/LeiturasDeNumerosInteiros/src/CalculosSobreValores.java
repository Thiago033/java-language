/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leiturasdenumerosinteiros;

/**
 *
 * @author Felipe Marques
 */
public class CalculosSobreValores {
    private int soma;
    private int quantidade;
    private int percentualDePositivos;
    private int percentualDeNegativos;
    private int maior;
    private int menor;
    private int numerosPares;
    private int somaPares;
    
    
    public CalculosSobreValores() {
        soma = 0;
        quantidade = 0;
        percentualDePositivos = 0;
        percentualDeNegativos = 0;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
        numerosPares = 0;
        somaPares = 0;
    }
    
    private void soma(int valor) {
        soma += valor;
    }

    private void incrementaQuantidade() {
        quantidade++;
    }
    
    public int quantidade() {
        return quantidade;
    }
    
    private void ehPositivo(int valor) {
        if (valor > 0)
            percentualDePositivos++;
    }

    private void ehNegativo(int valor) {
        if (valor < 0)
            percentualDeNegativos++;
    }
    
    private void ehMaior(int value) {
        if (value > maior)
            maior = value;
    }

    private void ehMenor(int value) {
        if (value < menor)
            menor = value;
    }
    
    private void ehPar(int value) {
        if (value % 2 == 0) {
            numerosPares++;
            somaPares += value;
        }
    }
    
    public void testaValor(int valor) {
        this.soma(valor);
        this.incrementaQuantidade();
        this.ehPositivo(valor);
        this.ehNegativo(valor);
        this.ehMaior(valor);
        this.ehMenor(valor);
        this.ehPar(valor);
    }
    
    public void imprimir() {
        System.out.println("Soma: " + soma);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Média: " + (double) soma/quantidade);
        System.out.println("Percentual de Números Positivos: " + percentualDePositivos/quantidade*100 + "%");
        System.out.println("Percentual de Números Negativos: " + (double) percentualDeNegativos/quantidade*100 + "%");
        System.out.println("Maior Número: " + maior);
        System.out.println("Menor Número: " + menor);
        System.out.println("Média dos Números Pares: " + (double) somaPares/numerosPares);
    }
}
