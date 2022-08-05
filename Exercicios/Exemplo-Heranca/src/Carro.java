public class Carro extends Automovel{
    
    int quantidadeDePortas;
    
    public Carro(String marca, String modelo, int rodas, int velocidade, int potenciaDoMotor, int quantidadeDePortas){
        super(marca, modelo, rodas, velocidade, potenciaDoMotor);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    public void ImprimirInformacoes(){
        super.ImprimirInformacoes();
        System.out.println("QUANTIDADE DE PORTAS: " + quantidadeDePortas);
    }
}