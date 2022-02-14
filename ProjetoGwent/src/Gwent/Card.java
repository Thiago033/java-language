package Gwent;

public class Card {
    int code;
    String faction;
    String name;
    int strengh;
    String cardAbilities;
    String type;


    public Card(int code, String faction, String name, int strengh, String cardAbilities, String type) {
        this.code = code;
        this.faction = faction;
        this.name = name;
        this.strengh = strengh;
        this.cardAbilities = cardAbilities;
        this.type = type;
    }

    //print card status
    @Override
    public String toString() {
        return code+ " " +faction+ " " +name+ " " +strengh+ " " +cardAbilities+ " " +type;
    }

    public void testCardAbilities(){

    }
}


//cardAbilities (Medic,Morale,Scorch,Spy,Bond,Agile,Muster)
//type (hero or normal)