package Gwent;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> nilfgaardDeck;
    private ArrayList<Card> monstersDeck;

    public Deck(){
        nilfgaardDeck = new ArrayList<>();
        monstersDeck = new ArrayList<>();
        //readArchive();

        //--------------CRIANDO DECK MANUALMENTE-------------------
        nilfgaardDeck.add(new Card(1, "nilfgaard", "teste1", 10 , "none", "hero"));
        nilfgaardDeck.add(new Card(2, "nilfgaard", "teste2", 5, "none", "normal"));
        monstersDeck.add(new Card(3, "monsters", "teste3", 10, "none", "hero"));
        monstersDeck.add(new Card(4, "monsters", "teste4", 5, "none", "normal"));
        //---------------------------------------------------------
    }

    public ArrayList<Card> selectDeck(int playersChoice) {
        if (playersChoice==1) {
            return nilfgaardDeck;
        } else {
            return monstersDeck;
        }
    }

    //private void readArchive() {}









}