package Gwent;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static Player[] players = new Player[2];

    Random random = new Random();

    Scanner scanner;

    int deckChoice;

    

    public static void main(String[] args) throws Exception {
        App gwent = new App();

        gwent.menu();
        
    }

    public void menu(){
        String name;

        //cria o objeto do Scanner
        scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro jogador:");
        name = scanner.nextLine();
        players[0] = new Player(name);

        //escolha do baralho
        System.out.println("Ira jogar com qual baralho?");
        System.out.println("[1] Nilfgaard deck \n [2] Monsters deck");
        deckChoice = scanner.nextInt();

        System.out.println("Digite o nome do segundo jogador:");
        name = scanner.nextLine();
        players[1] = new Player(name);

        //escolha do baralho
        System.out.println("Ira jogar com qual baralho?");
        System.out.println("[1] Nilfgaard deck \n [2] Monsters deck");
        deckChoice = scanner.nextInt();
    }

    public void DistributeDeck(){
        Card distributeCard;


    }
}
