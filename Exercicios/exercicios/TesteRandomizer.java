import java.util.concurrent.ThreadLocalRandom;



public class TesteRandomizer {
    

    public static void main(String[] args) {
        int currentPlayer;


        currentPlayer = ThreadLocalRandom.current().nextInt(2);
        System.out.println(currentPlayer);
    }
}
