
public class InverteVetor 
{
    public static void main (String[] args){
        int[] vetor = {1, 2, 3};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        inverte(vetor);
        System.out.println("--------------");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void inverte(int[] vetor1){
        int[] w = new int[vetor1.length];

        for(int i = 0; i < vetor1.length; i++) {
            w[vetor1.length-i-1] = vetor1[i];
        }

        vetor1 = w;
    }
}