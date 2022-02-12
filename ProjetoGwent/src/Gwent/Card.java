package Gwent;

public class Card {
    String name;
    int strengh;
    String cardAbilities;
    String type;


    public Card(String name, int strengh, String cardAbilities, String type) {
        this.name = name;
        this.strengh = strengh;
        this.cardAbilities = cardAbilities;
        this.type = type;
    }

    public void testCardAbilities(){

    }  
}


//cardAbilities (Medic,Morale,Scorch,Spy,Bond,Agile,Muster)
//type (hero or normal)