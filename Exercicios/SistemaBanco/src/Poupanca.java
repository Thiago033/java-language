public class Poupanca extends Conta {

    Poupanca(String n, int c, String b){
        super(n, c, b);
    }

    @Override
    void retira(float soma){
        
        if (soma <= 0) {
            throw new InvalidValueException("VALOR INVALIDO PARA SAQUE!\nTente novamente.");
        }

        if (this.pegaSaldo() < soma){
        System.out.println("Saldo insuficiente!");
        }
        else{
            this.AlteraSaldo(soma); 
        }   
        
    }
    
}