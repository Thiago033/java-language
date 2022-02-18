public class CDs extends Produtos{
    int faixas;

    public CDs(String nome, float preco, int faixas, int codigo){
        super(nome, preco, codigo);
        this.faixas = faixas;
    }

    @Override
    public void ListarProdutos(){
        System.out.println("CD: ");
        super.ListarProdutos();
        System.out.println("FAIXAS: " + faixas);
        System.out.println("==========================");
    }
}
