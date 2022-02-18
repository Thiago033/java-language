

public class Animais implements Animal{

    private String nome, especie;

    public Animais(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public String getNomeAnimal(){
        return this.nome;
    }

    public String getNomeEspecie(){
        return this.especie;
    }
}