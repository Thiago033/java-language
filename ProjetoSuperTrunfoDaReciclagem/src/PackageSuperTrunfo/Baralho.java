package PackageSuperTrunfo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author thiag
 */
public class Baralho {
    List<Carta> baralho;

    public Baralho(){
        baralho = new ArrayList<>();
        lerDoArquivo("Java\\ProjetoSuperTrunfoDaReciclagem\\src\\PackageSuperTrunfo\\Super Trunfo da Reciclagem.csv");
        
    }
    
    //Retorna uma carta aleatoria lida do baralho e a exclui do baralho.
    public Carta selecionaCarta(){
        Random aleatorio = new Random();
        
        if (!baralho.isEmpty()) {
            int numeroAleatorio = aleatorio.nextInt(baralho.size());
            return baralho.remove(numeroAleatorio);
        } else {
            return null;
        }
    }

    //Le as cartas do arquivo .csv, e as retorna para o ArrayList do baralho.
    private void lerDoArquivo(String caminho){
        try {
            BufferedReader leitura = new BufferedReader(new FileReader(caminho));

            String linha;

            do {
                linha = leitura.readLine();
                if (linha != null) {
                    baralho.add(criarCarta(linha));
                }
            } while (linha != null);
            
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: O arquivo '" + caminho + "' não foi encontrado.");
        } catch (IOException ioe) {
            System.out.println("Erro: Não foi possível ler os dados no arquivo '" + caminho + "'");
        }
    }
    
    //Recebe uma linha do arquivo .csv e retorna uma carta com os respectivos atributos
    public Carta criarCarta(String linha){
        String[] dados = linha.split(";");

        /*
        *   dados[0] = codigo, dados[1] = nome, dados[2] = descricao, dados[3] = tipo, 
        *   dados[4] = cor, dados[5] = decomposicao, dados[6] = ataque, dados[7] = reciclavel
        */    
        
        //Se a carta conter o dado: "reciclavel = sim", retorna uma carta do tipo reciclavel
        if (dados[7].equalsIgnoreCase("sim")) {
            return new Reciclavel(dados[0], dados[1], dados[2], dados[3], Cor.stringToCor(dados[4]), Double.parseDouble(dados[5]), Integer.parseInt(dados[6]));

        //Retorna uma carta do tipo nao reciclavel
        } else {
            return new NaoReciclavel(dados[0], dados[1], dados[2], dados[3], Cor.stringToCor(dados[4]), Double.parseDouble(dados[5]), Integer.parseInt(dados[6]));
        }
    }
}
