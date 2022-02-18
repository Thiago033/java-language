package DobrarVetor;

public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor1 = new Vetor(2);

        vetor1.insert("jorge");
        vetor1.insert("marcos");
        vetor1.insert("janaina");
        vetor1.insert("cristianoronaldo");
        vetor1.insert("cristianoronaldo2");
        vetor1.insert("cristianoronaldo3");

        for (int i = 0; i < vetor1.lista.length; i++) {
            System.out.println(vetor1.lista[i]);
        }

        vetor1.get(9);
        vetor1.size();
    }
}
