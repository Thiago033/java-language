package Gwent;

import java.util.ArrayList;

public class Player {
    public static final char[] deckChoice = null;
    private String name;
    private ArrayList<Card> playersDeck;

    public Player(String name){
        this.name = name;
        playersDeck = new ArrayList<>();
    }

    public String name(){
        return name;
    }

    public int numberOfCards(){
        return playersDeck.size();
    }

    /*
    public void includeCard(Card card){
        this.playersDeck.add(card);
    }
    */

    public void selectDeckPlayer(ArrayList<Card> selectedDeck){
        playersDeck.addAll(selectedDeck);
    }

    //print players deck
    public void printDeck(){
       for (Card card : playersDeck) {
           System.out.println(card);
       }
    }


}
