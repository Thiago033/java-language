package lembretesapp;

public class Lembrete {
    
    //Data data;
    private String nome;
    String descricao;

    public Lembrete(/*Data data, */String nome, String descricao){
        //this.data = data;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void ImprimirLembrete(){
        System.out.println(" | Nome: " + nome +" | Descricao: " + descricao);
    }

    public String NomeDoLembrete(){
        return nome;
    }
}