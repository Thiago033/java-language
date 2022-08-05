package lembretesapp;

public class BlocoDeLembretes {
    Lembrete[] listaDeLembretes;
    int numeroDeLembretes;

    public BlocoDeLembretes(){
        listaDeLembretes = new Lembrete[2];
        numeroDeLembretes = 0;
    }

    public void IncluirLembrete(Lembrete lembrete){
        //DOBRAR VETOR DE LEMBRETES CASO NAO TENHA MAIS ESPACO
        if (numeroDeLembretes >= listaDeLembretes.length){
            Lembrete[] novaListaDeLembretes = new Lembrete[listaDeLembretes.length * 2];

            for (int i = 0; i < numeroDeLembretes; i++) {
                novaListaDeLembretes[i] = listaDeLembretes[i];
            }

            listaDeLembretes = novaListaDeLembretes;
        }
        else{
            listaDeLembretes[numeroDeLembretes++] = lembrete;
        }
    }

    public void ListarLembretes(){
        int i;
        
        limparTela();
        System.out.println("-------------------------");
        for (i = 0; i < numeroDeLembretes; i++) {
            System.out.print("Lembrete: " + i);
            listaDeLembretes[i].ImprimirLembrete();
        }
        System.out.println("-------------------------\n");
    }

    //METODO PARA LIMPAR O CONSOLE
    public void limparTela() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }  

    public int TotalDeLembretes(){
        return numeroDeLembretes;
    }

    public void RemoverLembrete(int indice){
        int i;

        if (indice >= 0 && indice < listaDeLembretes.length) {
            
            for (i = indice; i < numeroDeLembretes; i++) {
                listaDeLembretes[i] = listaDeLembretes[i+1];
            }
            numeroDeLembretes--;
        /*} else {
            
        }*/
        }
    }

    public void BuscarLembretePorNome(String nomePassado){
        int i;

        for (i = 0; i < numeroDeLembretes; i++) {
            if (listaDeLembretes[i].NomeDoLembrete().contains(nomePassado)) {
                listaDeLembretes[i].ImprimirLembrete();
            }
        }
    }
}