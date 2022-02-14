package Gwent;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPopupMenu;

import java.util.Random;
import java.util.Scanner;

public class App {
    private static Player[] players = new Player[2];

    Scanner scanner;

    int currentPlayer;

    int deckChoice;

    Deck gameDeck = new Deck();
    boolean game = true;

    public static void main(String[] args) throws Exception {
        App gwent = new App();

        gwent.Menu();

        gwent.Play();

    }

    public void Play() {

        //random what player i'll start
        int firstPlayer, secondPlayer;

        
        


currentPlayer = ThreadLocalRandom.current().nextInt(2);
        System.out.println(currentPlayer);

        //while (game == true) {
            
            System.out.println(players[currentPlayer].name() + "Deck \n");
            players[currentPlayer].printDeck();

            //players[currentPlayer] select a card
            //players[currentPlayer].selectCard(currentPlayer);
            


        //}
        
    }

    public void Menu() {
        players[0] = new Player("jorge");
        players[0].selectDeckPlayer(gameDeck.selectDeck(1));

        players[1] = new Player("marcelo");
        players[1].selectDeckPlayer(gameDeck.selectDeck(2));
    }

    /*
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
    */
}
