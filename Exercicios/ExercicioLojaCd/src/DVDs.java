public class DVDs extends Produtos{

    float duracao;

    public DVDs(String nome, float preco, float duracao, int codigo){
        super(nome, preco, codigo);
        this.duracao = duracao;
    }

    @Override
    public void ListarProdutos(){
        System.out.println("DVD: ");
        super.ListarProdutos();
        System.out.println("DURACAO: " + duracao);
        System.out.println("==========================");
    }
}
