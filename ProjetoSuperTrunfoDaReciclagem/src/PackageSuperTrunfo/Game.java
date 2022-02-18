package PackageSuperTrunfo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Game {
    
    //Cria vetor com os jogadores
    private static Jogador[] jogadores = new Jogador[2];

    //Aleatoriza qual jogador comeca a rodada
    Random aleatorio = new Random();
    int jogadorAtual = aleatorio.nextInt(2);

    //Cria o objeto para o baralho
    Baralho baralhoJogo = new Baralho();

    //Cria scanner para ler a entrada do jogador
    Scanner entrada;

    public static void main(String[] args) throws Exception { 
        Game superTrunfo = new Game();
        
        //Metodo de um menu para criacao dos jogadores
        superTrunfo.menuJogadores();
        
        //Metodo principal do jogo
        superTrunfo.jogar();
    }
    
    //Limpa o console
    public void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void menuJogadores() {
        String nome;

        limparConsole();
        
        System.out.println("Digite o nome do primeiro jogador:");
        entrada = new Scanner(System.in);
        nome = entrada.nextLine();
        jogadores[0] = new Jogador(nome);

        System.out.println("Digite o nome do segundo jogador:");
        nome = entrada.nextLine();
        jogadores[1] = new Jogador(nome);

        limparConsole();
    }
    
    //Distribui as cartas lidas do arquivo para os jogadores
    public void distribuirBaralho(){
        Carta distribuirCarta;

        do {
            distribuirCarta = baralhoJogo.selecionaCarta();
            if (distribuirCarta != null) {
                jogadores[0].incluir(distribuirCarta);
            }

            distribuirCarta = baralhoJogo.selecionaCarta();
            if (distribuirCarta != null) {
                jogadores[1].incluir(distribuirCarta);
            }
        } while (distribuirCarta != null);
    }
    
        public void jogar(){
        //Cria uma ArrayList para adicionar as cartas em caso de empate
        List<Carta> cartasNaMesa = new ArrayList<>();

        int ganhador = 0, turnos = 0;
        Carta jogador1, jogador2;
        boolean game = true;

        //Jogo simulado
        boolean jogoSimulado = false;

        //mudei as variaveis de lugar
        int opcao = 0;
        boolean erro;

        //Distribui as cartas do baralhoJogo para os 2 jogadores
        distribuirBaralho();
        System.out.println("Cartas distribuidas aos jogadores! \n\n");

        //Pergunta se o jogo vai ser jogado manualmente ou vai ser simulado aleatoriamente
        do {
            erro = false;
            try {
                System.out.println("(1) Jogar normalmente\n(2) Simular jogo aleatoriamente");
                entrada = new Scanner(System.in);
                opcao = entrada.nextInt();

                if (opcao != 1 && opcao != 2) {
                    limparConsole();
                    System.out.println("Voce digitou um valor invalido!\ntente novamente!\n");
                    erro = true;
                }
            } catch (InputMismatchException e) {
                limparConsole();
                System.out.println("Voce digitou um valor invalido!\ntente novamente!\n");
                erro = true;
            }
        } while (erro == true);

        limparConsole();

        //Se opcao for igual a 2, seta a variavel jogoSimulado para verdadeira
        if (opcao == 2) {
            jogoSimulado = true;
        }
                    
        while(game == true){

            //jogador1 e jogador2 recebem a primeira carta do baralho de cada um
            //as 2 cartas sao excluidas dos baralhos dos 2 jogadores
            jogador1 = jogadores[0].excluir();
            jogador2 = jogadores[1].excluir();
            
            //Se o jogo nao for simulado entra no IF
            if(!jogoSimulado){
                //Menu para escolha do atributo a ser comparado
                do {
                    erro = false;
                    try {
                        System.out.println("O jogador "+ jogadores[jogadorAtual].nome() + " escolhe o atributo a ser comparado. \n");

                        //Printa a carta do jogador que comeca a rodada
                        if (jogadorAtual == 0) {
                            System.out.println(jogador1.toString());
                        } else {
                            System.out.println(jogador2.toString());
                        }
                        
                        System.out.println("Escolha um atributo para comparar: \n");
                        System.out.println("(1) Tipo");
                        System.out.println("(2) Decomposicao");
                        System.out.println("(3) Reciclavel");
                        System.out.println("(4) Ataque");

                        entrada = new Scanner(System.in);
                        opcao = entrada.nextInt();

                        if (opcao < 1 || opcao > 4) {
                            limparConsole();
                            System.out.println("Voce digitou um valor invalido!\ntente novamente!\n");
                            erro = true;
                        }
                    } catch (InputMismatchException e) {
                        limparConsole();
                        erro = true;
                        System.out.println("Voce digitou um valor invalido!\ntente novamente!\n");
                    }
                } while(erro == true);
            }
            //Caso o jogo esteja sendo simulado
            //Variavel opcao recebe um valor aleatorio entre 1 e 4
            else{
                Random aleatorio = new Random();
                opcao = aleatorio.nextInt(4)+1;    
            }


            limparConsole();

            switch (opcao) {
                //Compara a carta do jogador1 com a do jogador2
                case 1:
                    ganhador = jogador1.compararCor(jogador2);
                    System.out.println("Atributo sendo comparado: TIPO\n");
                    break;
                case 2:
                    ganhador = jogador1.compararDecomposicao(jogador2);
                    System.out.println("Atributo sendo comparado: DECOMPOSICAO\n");
                    break;
                case 3:
                    ganhador = jogador1.compararReciclavel(jogador2);
                    System.out.println("Atributo sendo comparado: RECICLAVEL\n");
                    break;
                case 4:
                    ganhador = jogador1.compararAtaque(jogador2);
                    System.out.println("Atributo sendo comparado: ATAQUE\n");
                    break;
            }

            
            //Testar carta MegaWinner
            //Caso nenhum dos jogadores possuir a carta MegaWinner, retorna 0
            if (jogador1.compararCartaMegaWinner(jogador2) != 0) {
                //Caso o metodo nao tiver retornado 0
                //Variavel ganhador recebe 1 ou -1 dependendo do ganhador
                ganhador = jogador1.compararCartaMegaWinner(jogador2);
            }

            //Imprime a carta dos dois jogadores
            System.out.println("\nCarta do jogador " +jogadores[0].nome()+ ":");
            System.out.println(jogador1.toString());
            System.out.println("\nCarta do jogador " +jogadores[1].nome()+ ":");
            System.out.println(jogador2.toString());
            
            //se "ganhador" == 1    / jogador1(jogadores[0]) ganhou a rodada
            //se "ganhador" == < 0  / jogador2(jogadores[1]) ganhou a rodada
            //se "ganhador" == 0    / empate

            //caso "ganhador" == 1, jogadores[0] ganhou, muda a variavel "jogadorAtual" para 0 (numero do seu indice no vetor)
            if (ganhador == 1) {
                jogadorAtual = 0;
            }

            //caso "ganhador" < 0, jogadores[1] ganhou, muda a variavel "jogadorAtual" para 1 (numero do seu indice no vetor)
            if (ganhador < 0) {
                jogadorAtual = 1;
            }

            //caso ganhador seja 0, empate
            if (ganhador == 0) {
                //Adiciona as cartas dos dois jogadores no baralho da "mesa"
                System.out.println("Empate, cartas dos dois jogadores foram adicionadas ao baralho da mesa!\n");
                cartasNaMesa.add(jogador1);
                cartasNaMesa.add(jogador2);

            } else {
                System.out.println("\nO jogador " + jogadores[jogadorAtual].nome() + " venceu a rodada e ganhou " + (cartasNaMesa.size()+1) + " cartas!\n");

                //Incluir as cartas ao baralho do jogador que venceu da rodada
                jogadores[jogadorAtual].incluir(jogador1); 
                jogadores[jogadorAtual].incluir(jogador2);

                //Caso tenha cartas no baralho da mesa, sao incluidas tambem ao bararlho do vencedor
                if (cartasNaMesa.size() > 0) {
                    for (Carta carta : cartasNaMesa) {
                        jogadores[jogadorAtual].incluir(carta);
                    }

                    //Limpa o ArrayList depois das cartas terem sido incluidas no baralho do jogador
                    cartasNaMesa.clear();
                }    
            }

            System.out.println("Numero de cartas de "+ jogadores[0].nome()+": " + jogadores[0].numeroDeCartas() + "\n");
            System.out.println("Numero de cartas de "+ jogadores[1].nome()+": " + jogadores[1].numeroDeCartas() + "\n");

            //Verifica se algum dos jogadores esta sem cartas
            if (jogadores[0].temCartas() == false) {
                System.out.println(jogadores[1].nome() + " venceu a partida!\n");
                
                //seta a variavel "game" para false e termina o jogo
                game = false;
            }

            if (jogadores[1].temCartas() == false) {
                System.out.println(jogadores[0].nome() + " venceu a partida!\n");

                //seta a variavel"game" para false e termina o jogo
                game = false;
            }

            if (!jogoSimulado) {
                System.out.println("Precione Enter para continuar.");
                entrada = new Scanner(System.in);
                entrada.nextLine();
                limparConsole();
            }
               
            turnos++;
        }
        System.out.println("O jogo durou " + turnos + " turnos!");
        System.out.println("Fim de jogo!");
    }
}