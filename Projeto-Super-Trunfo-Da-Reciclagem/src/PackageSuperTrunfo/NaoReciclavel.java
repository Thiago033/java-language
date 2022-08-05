package PackageSuperTrunfo;
/**
 *
 * @author thiag
 */
public class NaoReciclavel extends Carta{
    
    public NaoReciclavel(String codigo, String nome, String descricao, String tipo, Cor cor, double decomposicao, int ataque) {
        super(codigo, nome, descricao, tipo, cor, decomposicao, ataque);
    }
    
    @Override
    public String reciclavelToString(){
        return "Nao";
    }

    @Override
    public boolean ehReciclavel() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
