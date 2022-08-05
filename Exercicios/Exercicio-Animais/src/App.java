import java.util.*;
import java.util.TreeMap;

public class App implements Ferramentas{
    public static void main(String[] args) throws Exception {

        App app = new App();

        ArrayList<Animais> animais = new ArrayList<Animais>();
        ArrayList<Animais> especieFiltrada = new ArrayList<Animais>();
        
        ArrayList<String> especiesClassificadas = new ArrayList<String>();

        Animais cachorro1 = new  Animais("Jorge", "Labrador");
        Animais cachorro2 = new  Animais("Marcio", "Labrador");
        Animais cachorro3 = new  Animais("Affonso", "Rottweiler");
        Animais cachorro4 = new  Animais("Jorge", "Labrador");
        Animais urso1 = new  Animais("Marcio", "Urso pardo");
        Animais jacare1 = new  Animais("Affonso", "Jacare loco");

        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(cachorro3);
        animais.add(cachorro4);
        animais.add(urso1);
        animais.add(jacare1);


        //FILTRA ESPECIE
        especieFiltrada = app.filtraEspecie(animais, "Jacare loco");

        System.out.println("=============================================");
        for (int i = 0; i < especieFiltrada.size(); i++) {
            System.out.println(especieFiltrada.get(i).getNomeAnimal());
            System.out.println(especieFiltrada.get(i).getNomeEspecie());
            System.out.println("=============================================");
        }
        System.out.println();
        //

        //CLASSIFICA ESPECIES
        especiesClassificadas = app.classificaEspecies(animais);
        System.out.println("ESPECIES:\n");
        for (int i = 0; i < especiesClassificadas.size(); i++) {
            System.out.println(especiesClassificadas.get(i));
        }
        //
        System.out.println("=============================================");
        //app.contabilizaAnimaisPorEspecie(animais, especiesClassificadas);
    }

    public void contabilizaAnimaisPorEspecie(Animais[] A, Ferramentas F) {
        int i;
        Animais[] animais;
        Map<String, int> animaisPorEspecie = new TreeMap<>();

        String[] especies = F.classificaEspecies(A);
            for (i = 0; i < especies.length; i++) {
                animais = F.filtraEspecie(A, especies[i]);
                animaisPorEspecie.put(especies[i], animais.length);
            }
            return animaisPorEspecie;
    }

    /*
    //CONTABILIZA ESPECIES
    public void contabilizaAnimaisPorEspecie(ArrayList<Animais> completo, ArrayList<String> especieClassificadas){
        int count;
        for (int i = 0; i < especieClassificadas.size(); i++) {
            count = 0;
            for (int j = 0; j < completo.size(); j++) {
                if (especieClassificadas.get(i).equals(completo.get(j).getNomeEspecie())) {
                    count++;
                }
            }

            System.out.println(count + " ANIMAIS DA ESPECIE: " + especieClassificadas.get(i));
        }
    }
    */

    //CLASSIFICA ESPECIES
    @Override
    public ArrayList<String> classificaEspecies(ArrayList<Animais> completo) {
        ArrayList<String> especiesClassificadas = new ArrayList<String>();

        int qtd = 0;

        for( int i = 0 ; i < completo.size() ; i++ ) {

            boolean existe = false;

            for( int j = 0 ; j < qtd ; j++ ) {
                if(especiesClassificadas.get(j).equals(completo.get(i).getNomeEspecie())) {
                    existe = true;
                    break;
                }
            }

            if( !existe ) {
                especiesClassificadas.add(completo.get(i).getNomeEspecie());
                qtd++;
            }
        }
        
        return especiesClassificadas;
    }

    //FILTRA ESPECIES
    @Override
    public ArrayList<Animais> filtraEspecie(ArrayList<Animais> completo, String especieFiltrar){
        ArrayList<Animais> especieFiltrada = new ArrayList<Animais>();
        int i;

        for (i = 0; i < completo.size(); i++) {
            if (completo.get(i).getNomeEspecie().equalsIgnoreCase(especieFiltrar)) {
                especieFiltrada.add(completo.get(i));
            }
        }
        
        return especieFiltrada;
    }
}