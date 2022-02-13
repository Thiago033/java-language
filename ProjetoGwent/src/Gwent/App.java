package Gwent;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static Player[] players = new Player[2];

    Random random = new Random();

    Scanner scanner;

    int deckChoice;

    Deck gameDeck = new Deck();

    public static void main(String[] args) throws Exception {
        App gwent = new App();

        gwent.Menu();

        gwent.Play();

    }

    public void Play() {

        System.out.println("PLAYER 1 DECK:\n");
        players[0].printDeck();
        System.out.println("PLAYER 2 DECK:\n");
        players[1].printDeck();
        
    }

    public void Menu(){
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
        players[0].selectDeckPlayer(gameDeck.selectDeck(deckChoice));

        

        scanner.nextLine();

        System.out.println("Digite o nome do segundo jogador:");
        name = scanner.nextLine();
        players[1] = new Player(name);

        //escolha do baralho
        System.out.println("Ira jogar com qual baralho?");
        System.out.println("[1] Nilfgaard deck \n [2] Monsters deck");
        deckChoice = scanner.nextInt();
        players[1].selectDeckPlayer(gameDeck.selectDeck(deckChoice));
    }
}
