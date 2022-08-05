package lembretesapp;

import java.util.Scanner;

public class LembretesApp {

    public BlocoDeLembretes blocoDeLembretes;

    //METODO CONSTRUTOR
    public LembretesApp(){
        blocoDeLembretes = new BlocoDeLembretes();
    }

    //METODO PARA IMPRIMIR O MENU E SCANEAR A OPCAO DO USUARIO
    private int menu() {
        
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Lembretes App - A lista contém " + blocoDeLembretes.TotalDeLembretes() + " lembretes \n");
            System.out.println("Escolha uma das seguintes opções: \n");
            System.out.println("1- Adicionar novo lembrete");
            System.out.println("2- Remover lembrete");
            System.out.println("3- Listar");
            System.out.println("4- Busca por data");
            System.out.println("5- Busca por nome");
            System.out.println("6- Sair");
            
            opcao = scanner.nextInt();
        } while(opcao < 1 && opcao > 6);

        blocoDeLembretes.limparTela();

        return opcao;
    }
    
    // CASO 1 (INCLUIR LEMBRETE)
    //METODO PARA LER OS DADOS DO LEMRETE
    Lembrete LerDadosDoLembrete(){
        //int data = 1;
        String nome;
        String descricao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lembrete: ");
        nome = scanner.nextLine();
        System.out.println("Digite a descricao do lembrete: ");
        descricao = scanner.nextLine();

        blocoDeLembretes.limparTela();

        return(new Lembrete(nome, descricao));
    }

    public static void main(String[] args) throws Exception {

        LembretesApp app = new LembretesApp();
        
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            opcao = app.menu();

            switch (opcao) {
                case 1:
                    app.blocoDeLembretes.IncluirLembrete(app.LerDadosDoLembrete());
                    break;
                
                case 2:
                    app.blocoDeLembretes.ListarLembretes();
                    System.out.println("Digite o indice do lembrete a ser removido: ");
                    app.blocoDeLembretes.RemoverLembrete(scanner.nextInt());
                    break;
                
                case 3:
                    app.blocoDeLembretes.ListarLembretes();
                    break;

                case 4:
                    System.out.println("Digite o nome do lembrete: ");
                    app.blocoDeLembretes.BuscarLembretePorNome(scanner.nextLine());
                    break;
                default:

                break;
            }  
        } while (opcao != 6);
    }
}
