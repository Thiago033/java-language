public class Bicicleta extends Veiculo {
    int numeroDeMarchas;
    boolean bagageiro;

    public Bicicleta(String marca, String modelo, int rodas, int velocidade, int numeroDeMarchas, boolean bagageiro){
        super(marca, modelo, rodas, velocidade);
        this.numeroDeMarchas = numeroDeMarchas;
        this.bagageiro = bagageiro;
    }

    public void ImprimirInformacoes(){
        super.ImprimirInformacoes();
        System.out.println("NUMERO DE MARCHAS: " + numeroDeMarchas);
        System.out.println("BAGAGEIRO: " + bagageiro);
    }
}