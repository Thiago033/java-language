public class Livros extends Produtos {
    
    String autor;

    public Livros(String nome, float preco, String autor, int codigo){
        super(nome, preco, codigo);
        this.autor = autor;
    }

    @Override
    public void ListarProdutos(){
        System.out.println("LIVRO: ");
        super.ListarProdutos();
        System.out.println("AUTOR: " + autor);
        System.out.println("==========================");
    }
}
