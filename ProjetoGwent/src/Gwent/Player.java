package Gwent;

import java.util.ArrayList;

public class Player {
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

    public void includeCard(Card card){

    }


}
