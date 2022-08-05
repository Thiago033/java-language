public class Secretaria extends Empregado {
    private String[] contatos;
    private int pos_livre = 0;

    public Secretaria(String nome, int salario, int anoContratacao){
        super(nome, salario, anoContratacao);
        this.contatos = new String[5];
    }

    public void GuardaNome(String nome){
        this.contatos[pos_livre++] = nome;
        if (this.pos_livre == 5) {
           this.pos_livre = 0;
        }
    }

    public void ImprimirNomesSecret(){
        for (int i = 0; i < contatos.length; i++) {
            if (this.contatos[i] != null) {
                System.out.println(this.contatos[i]);
            }
        }
    }
}
