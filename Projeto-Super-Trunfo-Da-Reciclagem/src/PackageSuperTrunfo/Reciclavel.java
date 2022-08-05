package PackageSuperTrunfo;
/**
 *
 * @author thiag
 */
public class Reciclavel extends Carta{
    
    public Reciclavel(String codigo, String nome, String descricao, String tipo, Cor cor, double decomposicao, int ataque) {
        super(codigo, nome, descricao, tipo, cor, decomposicao, ataque);
    }
    
    @Override
    public String reciclavelToString(){
        return "Sim";
    }

    @Override
    public boolean ehReciclavel() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
