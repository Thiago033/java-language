public class Automovel extends Veiculo{
    
    int potenciaDoMotor;

    public Automovel(String marca, String modelo, int rodas, int velocidade, int potenciaDoMotor){
        super(marca, modelo, rodas, velocidade);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public void ImprimirInformacoes(){
        super.ImprimirInformacoes();
        System.out.println("POTENCIA DO MOTOR: " + potenciaDoMotor);
    }
}