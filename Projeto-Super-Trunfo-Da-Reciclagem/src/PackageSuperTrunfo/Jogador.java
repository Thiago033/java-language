package PackageSuperTrunfo;
import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class Jogador {
    private String nome;
    private ArrayList<Carta> baralhoJogador;


    public Jogador(String nome){
        this.nome = nome;
        baralhoJogador = new ArrayList<>();
    }

    //==========================================================================================//
    //LISTAR CARTAS PARA TESTE
    public void listarCartas(){
        for (Carta carta : baralhoJogador) {
            System.out.println(carta);
        }
    }
    //==========================================================================================//

    public String nome(){
        return nome;
    }

    //Retornar o numero de cartas do jogador
    public int numeroDeCartas(){
        return baralhoJogador.size();
    }

    //Adiciona uma carta na ultima posicao do baralho
    public void incluir(Carta carta){
        baralhoJogador.add(carta);
    }

    //Remove a primeira carta do baralho e retorna essa carta
    public Carta excluir(){
        return baralhoJogador.remove(0);
    }

    //Retorna true se jogador tem cartas, caso contrario false
    public boolean temCartas(){
        if (baralhoJogador.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
