public class Moto extends Automovel{
    
    boolean partidaEletrica;

    Moto(String marca, String modelo, int rodas, int velocidade, int potenciaDoMotor, boolean partidaEletrica){
        super(marca, modelo, rodas, velocidade, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public void ImprimirInformacoes(){
        super.ImprimirInformacoes();
        System.out.println("PARTIDA ELETRICA: " + partidaEletrica);
    }
}