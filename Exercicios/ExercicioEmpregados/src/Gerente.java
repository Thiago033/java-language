public class Gerente extends Empregado {
    private Secretaria secretaria;
    private Empregado[] subordinados;

    public Gerente(String nome, int salario, int anoContratacao, Secretaria secret, Empregado e1, Empregado e2){
        super(nome, salario, anoContratacao);
        this.subordinados = new Empregado[2];
        this.secretaria = secret;
        this.subordinados[0] = e1;
        this.subordinados[1] = e2;
    }

    public void Aumento(int sec, int sub){
        this.secretaria.AumentarSalario(sec);

        int i;
        for (i = 0; i < 2; i++) {
            this.subordinados[i].AumentarSalario(sub);
        }  
    }

    @Override
    public void DadosDoEmpregado(){
        System.out.println("esse aki eh do gertente");
        System.out.println(ObterNome());
        System.out.println(ObterSalario());
        System.out.println(ObterAnoContratacao());
    }

}
