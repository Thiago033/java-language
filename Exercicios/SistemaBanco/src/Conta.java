public class Conta {
    String nome;
    int codigo;
    String nomeBanco;
    private float saldo;

    Conta(String n, int c, String b){
        this.nome = n;
        this.codigo = c;
        this.nomeBanco = b;
        this.saldo = 0F;
    }

    float AlteraSaldo(float soma){
        return this.saldo -= soma;
    }
    String pegaBanco(){
        return this.nomeBanco;
    }

    String pegaNome(){
        return this.nome;
    }

    int pegaCodigo(){
        return this.codigo;
    }

    float pegaSaldo(){
        return this.saldo;
    }

    void aplica(float soma){
        this.saldo += soma;
    }

    void retira(float soma){
        this.saldo -= soma;
    }
}