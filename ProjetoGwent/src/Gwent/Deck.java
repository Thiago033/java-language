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
        nilfgaardDeck.add(new Card("nilfgaard", "teste1", 1, "none", "hero"));
        nilfgaardDeck.add(new Card("nilfgaard", "teste2", 2, "none", "normal"));
        monstersDeck.add(new Card("monsters", "teste3", 3, "none", "hero"));
        monstersDeck.add(new Card("monsters", "teste4", 4, "none", "normal"));
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