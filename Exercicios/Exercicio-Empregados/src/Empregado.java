public class Empregado {
    private String nome;
    private int salario;
    private int anoContratacao;

    public Empregado(String nome, int salario, int anoContratacao){
        this.nome = nome;
        this.salario = salario;
        this.anoContratacao = anoContratacao;
    }

    public String ObterNome(){
        return nome;
    }

    public int ObterSalario(){
        return salario;
    }
    
    public int ObterAnoContratacao(){
        return anoContratacao;
    }

    public void AumentarSalario(int quantia){
        salario += quantia;
    }

    public void DadosDoEmpregado(){
        System.out.println(nome);
        System.out.println(salario);
        System.out.println(anoContratacao);
    }
}
