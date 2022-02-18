/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembretesapp;

import java.util.Scanner;

/**
 * Classe principal do projeto e deve prover métodos para entrada e saída de
 * dados relativos a um bloco de lembretes.
 * @author Felipe Marques
 */
public class LembretesApp {
    public BlocoDeLembretes bloco;
    
    /**
     * Método construtor
     */
    public LembretesApp() {
        bloco = new BlocoDeLembretes();
    }
    
    /**
     * Exercício 10 - Menu principal da aplicação, dando ao usuário a chance de
     * escolher uma das opções.
     * @return Retorna um inteiro com a opção escolhida pelo usuário.
     */
    private int menu() {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("###  Lembretes App - A lista contém " + bloco.numeroDeLembretes() + " lembretes ###");
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1- Adicionar novo lembrete");
            System.out.println("2- Remover lembrete");
            System.out.println("3- Listar");
            System.out.println("4- Busca por data");
            System.out.println("5- Busca por nome");
            System.out.println("6- Sair");
            
            opcao = sc.nextInt();
        } while(opcao < 1 && opcao > 6);
        return opcao;    
    }
    
    /**
     * Método auxiliar para ler dados de um lembrete.
     */
    private Lembrete lerDadosDoLembrete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("# Dados do Lembrete #");
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o assunto do lembrete: ");
        String nome = sc.nextLine();
        System.out.print("Digite a descrição do lembrete: ");
        String descricao = sc.nextLine();
        return new Lembrete(nome, descricao, new Data(dia, mes, ano));
    }
   
    /**
     * Exercício 11 - Método principal com laço para o menu.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LembretesApp app = new LembretesApp();
        int opcao;
        Scanner sc = new Scanner(System.in);    
        
        do {
            opcao = app.menu();
            
            switch(opcao) {
                case 1 :
                    app.bloco.incluirLembrete(app.lerDadosDoLembrete());
                    break;
                case 2 :
                    System.out.print("Índice do lembrete a ser removido: ");
                    app.bloco.removerLembrete(sc.nextInt());
                    break;
                case 3 :
                    app.bloco.listarLembretes();
                    break;
                case 4 :
                    System.out.println("# Buscar por data #");
                    int d, m ,a;
                    System.out.print("Qual o dia? ");
                    d = sc.nextInt();
                    System.out.print("Qual o mes? ");
                    m = sc.nextInt();
                    System.out.print("Qual o ano? ");
                    a = sc.nextInt();
                    app.bloco.buscarLembretesPorData(new Data(d, m, a));
                    break;
                case 5 : 
                    System.out.print("Buscar por nome: ");
                    app.bloco.buscarLembretesPorNome(sc.nextLine());
                    break;
            }
        } while(opcao != 6);
    }
    
}
