
import java.util.ArrayList;

public interface Ferramentas {
    public ArrayList<Animais> filtraEspecie(ArrayList<Animais> completo, String especieFiltrar);
    public ArrayList<String> classificaEspecies(ArrayList<Animais> completo);
}
