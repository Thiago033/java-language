package PackageSuperTrunfo;
/**
 *
 * @author thiag
 */
abstract public class Carta {
    private String codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private Cor cor;
    private double decomposicao;
    private int ataque;


    public Carta(String codigo, String nome, String descricao, String tipo, Cor cor, double decomposicao, int ataque) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cor = cor;
        this.decomposicao = decomposicao;
        this.ataque = ataque;
    }
    
    @Override
    public String toString(){
        return 
            "---------------------------------------------------------------------------------------------\n" 
            + descricao + "\n\n"
            + codigo + "\n"
            + cor  + "\n"
            + nome + "\n\n"
            + "TIPO:                           " + tipo + "\n"
            + "DECOMPOSICAO:                   " + decomposicao + "\n"
            + "RECICLAVEL:                     " + this.reciclavelToString() + "\n"
            + "ATAQUE:                         " + ataque + "\n"
            + "---------------------------------------------------------------------------------------------";
    }

    abstract public boolean ehReciclavel();
    
    abstract public String reciclavelToString();
   
    //Compara o valor da cor das cartas
    public int compararCor(Carta carta){
        //Comparando cartas iguais ou cartas com cores que empatam uma com a outra
        if (this.cor.equals(carta.cor) || 
                (this.cor == Cor.VERDE && carta.cor == Cor.LARANJA) || 
                (this.cor == Cor.LARANJA && carta.cor == Cor.VERDE) || 
                (this.cor == Cor.AZUL && carta.cor == Cor.CINZA) || 
                (this.cor == Cor.CINZA && carta.cor == Cor.AZUL) || 
                (this.cor == Cor.VERMELHO && carta.cor == Cor.PRETO) || 
                (this.cor == Cor.PRETO && carta.cor == Cor.VERMELHO) || 
                (this.cor == Cor.AMARELO && carta.cor == Cor.BRANCO) || 
                (this.cor == Cor.BRANCO && carta.cor == Cor.AMARELO) || 
                (this.cor == Cor.MARROM && carta.cor == Cor.ROXO) || 
                (this.cor == Cor.ROXO && carta.cor == Cor.MARROM)) {
            return 0;

        }else if (carta.cor == Cor.MENOR) {
            return 1;

        } else if (this.cor == Cor.VERDE && (carta.cor == Cor.MARROM || carta.cor == Cor.PRETO || carta.cor == Cor.CINZA || carta.cor == Cor.BRANCO)) {
            return 1;

        } else if (this.cor == Cor.LARANJA && (carta.cor == Cor.ROXO || carta.cor == Cor.AZUL || carta.cor == Cor.VERMELHO || carta.cor == Cor.AMARELO)) {
            return 1;

        } else if (this.cor == Cor.AZUL && (carta.cor == Cor.VERMELHO || carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE || carta.cor == Cor.MARROM)) {
            return 1;

        } else if (this.cor == Cor.CINZA && (carta.cor == Cor.PRETO || carta.cor == Cor.BRANCO || carta.cor == Cor.LARANJA || carta.cor == Cor.ROXO)) {
            return 1;

        } else if (this.cor == Cor.VERMELHO && (carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE || carta.cor == Cor.MARROM || carta.cor == Cor.CINZA)) {
            return 1;

        } else if (this.cor == Cor.PRETO && (carta.cor == Cor.BRANCO || carta.cor == Cor.LARANJA || carta.cor == Cor.ROXO || carta.cor == Cor.AZUL)) {
            return 1;

        } else if (this.cor == Cor.AMARELO && (carta.cor == Cor.VERDE || carta.cor == Cor.MARROM || carta.cor == Cor.CINZA || carta.cor == Cor.PRETO)) {
            return 1;

        } else if (this.cor == Cor.BRANCO && (carta.cor == Cor.LARANJA || carta.cor == Cor.ROXO || carta.cor == Cor.AMARELO || carta.cor == Cor.VERMELHO)) {
            return 1;

        } else if (this.cor == Cor.MARROM && (carta.cor == Cor.CINZA || carta.cor == Cor.PRETO || carta.cor == Cor.BRANCO || carta.cor == Cor.LARANJA)) {
            return 1;

        } else if (this.cor == Cor.ROXO && (carta.cor == Cor.AZUL || carta.cor == Cor.VERMELHO || carta.cor == Cor.AMARELO || carta.cor == Cor.VERDE)) {
            return 1;

        } else {
            return -1;
        }
    }

    //Comparar valor de decomposicao das cartas
    //Menor valor ganha
    public int compararDecomposicao(Carta carta) {    
        if (this.decomposicao == carta.decomposicao) {
            return 0;
        } else if (this.decomposicao < carta.decomposicao) {
            return 1;
        } else {
            return -1;
        }   
    }

    //Comparar se cartas sao reciclaveis
    //A carta que for reciclavel ganha, Caso as duas sejam reciclaveis ou as duas nao forem reciclaveis = empate
    public int compararReciclavel(Carta carta) {
        if ((this.ehReciclavel() && carta.ehReciclavel()) || (!this.ehReciclavel() && !carta.ehReciclavel())) { 
            return 0;
        } else if (this.ehReciclavel() && !carta.ehReciclavel()) {
            return 1;
        } else {
            return -1;
        }
    }

    //Comparar valor de ataque das cartas
    //Maior valor ganha
    public int compararAtaque(Carta carta) {
        if (this.ataque == carta.ataque) {
            return 0;
        }
        else if(this.ataque > carta.ataque) {
            return 1;
        } else {
            return -1;
        }
    }

    //Verifica carta MegaWinner
    public int compararCartaMegaWinner(Carta carta) {
        //Se a carta do jogador1 for a MegaWinner
        if (this.codigo == "H3") {
            if (carta.codigo.charAt(carta.codigo.length()-1) == '1') {
                //Se a carta do jogador2 terminar com codigo em 1
                //Retorna -1 | jogador2 ganha
                return -1;
            }
            else {
                //Retorna 1 | jogador1 ganha
                return 1;
            }
        } 

        //Se a carta do jogador2 for a MegaWinner
        if (carta.codigo == "H3") {
            if(carta.codigo.charAt(carta.codigo.length()-1) == '1') {
                //Se a carta do jogador1 terminar com codigo em 1
                //Retorna 1 | jogador1 ganha
                return 1;
            }
            else {
                //Retorna -1 | jogador2 ganha
                return -1;
            }  
        }
        
        //Se nenhuma das cartas for a MegaWinner, retorna 0
        return 0;
    }
}
