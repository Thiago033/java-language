public class Veiculo {

    String marca;
    String modelo;
    int rodas;
    int velocidade = 0;
    
    public Veiculo(String marca, String modelo, int rodas, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.rodas = rodas;
        this.velocidade = velocidade;
    }

    public void ImprimirInformacoes(){
        System.out.println("MARCA:" + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("RODAS: " + rodas);
        System.out.println("VELOCIDADE: " + velocidade);
    }

    public void Acelerar(int aceleracao){
        velocidade += aceleracao;
        System.out.println("VELOCIDADE: " + velocidade);
    }

    public void Frear(int frenagem){
        velocidade -= frenagem;
        System.out.println("VELOCIDADE: " + velocidade);
    }
}