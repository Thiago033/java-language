public class CadastroDeVeiculos {

    Veiculo[] listaDeVeiculos;
    private int numeroDeVeiculos;
    private int i;

    public CadastroDeVeiculos(){
        listaDeVeiculos = new Veiculo[10];
        numeroDeVeiculos = 0;
    }

    public void IncluirVeiculo(Veiculo veiculo){
        listaDeVeiculos[numeroDeVeiculos++] = veiculo;
    }

    public Veiculo BuscarVeiculo(int indiceDoVeiculo){
        if (indiceDoVeiculo<numeroDeVeiculos || indiceDoVeiculo>numeroDeVeiculos) {
            return null;
        } else {
            return listaDeVeiculos[indiceDoVeiculo];
        }
    }

    public void ListarVeiculos(){
        System.out.println("------------------------- \n");
        for (i = 0; i < numeroDeVeiculos; i++) {
            System.out.print("VEICULO: " + (i+1)+ "\n");
            listaDeVeiculos[i].ImprimirInformacoes();
            System.out.println("------------------------- \n");
        }
        
    }

    public int TotalDeVeiculos(){
        return numeroDeVeiculos;
    }
}
