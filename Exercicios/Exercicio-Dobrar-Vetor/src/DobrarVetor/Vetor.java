package DobrarVetor;

public class Vetor {
    String[] lista;
    int numeroDeElementos;

    public Vetor(int tamanhoDaLista){
        lista = new String[tamanhoDaLista];
        numeroDeElementos = 0;
    }

    public void insert(String elemento){
        if (numeroDeElementos < lista.length) {
            lista[numeroDeElementos++] = elemento;
        } 
        else{
            String[] novaLista = new String[lista.length * 2];
            for (int i = 0; i < numeroDeElementos; i++) {
                novaLista[i] = lista[i];    
            }

            lista = novaLista;

            lista[numeroDeElementos++] = elemento;
        }
    }

    public String get(int posicao){
        if (posicao >= 0 && posicao <= numeroDeElementos) {
            System.out.println(lista[posicao-1]);
            return lista[posicao-1];
        }

        return null;
    }
    
    public int size(){
        System.out.println("\n\n"+numeroDeElementos);
        return numeroDeElementos;
    }
}
