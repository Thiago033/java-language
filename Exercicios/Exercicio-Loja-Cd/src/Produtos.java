abstract public class Produtos {

    String nome;
    float preco;
    int codigo;

    public Produtos(String nome, float preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    public void ListarProdutos(){
        System.out.println("CODIGO: " + codigo);
        System.out.println("NOME: " + nome);
        System.out.println("PRECO: " + preco);
    }
    
    public boolean Equals(Produtos obj) {
        if(obj.codigo != this.codigo){
            return false;
        }
        else {
            return true;
        }    
    }
}