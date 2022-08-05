public class App {

    public CadastroDeVeiculos cadastroDeVeiculos;

    public App(){
        cadastroDeVeiculos = new CadastroDeVeiculos();
    }

    public static void main(String[] args) throws Exception {

        App app = new App();

        Veiculo bike1 = new Bicicleta("CALOI", "BMX", 2, 0, 5, false);
        Veiculo carro1 = new Automovel("jorger", "jorger", 2, 0, 1);
        Veiculo carro2 = new Carro("null", "modelo foda", 0, 0, 0, 0);
        Veiculo moto1 = new Moto("yahamma", "moto pika", 0, 0, 0, true);

        app.cadastroDeVeiculos.IncluirVeiculo(bike1);
        app.cadastroDeVeiculos.IncluirVeiculo(carro1);
        app.cadastroDeVeiculos.IncluirVeiculo(carro2);
        app.cadastroDeVeiculos.IncluirVeiculo(moto1);

        app.cadastroDeVeiculos.BuscarVeiculo(0);

        System.out.println("TOTAL DE VEICULOS NA LISTA: " + app.cadastroDeVeiculos.TotalDeVeiculos());
        
        app.cadastroDeVeiculos.ListarVeiculos();
        
        

        







    }
}
/*
        
        Veiculo carro1 = new Automovel("jorger", "jorger", 2, 0, 1);
        Veiculo carro2 = new Carro("null", "modelo foda", 0, 0, 0, 0);
        Veiculo moto1 = new Moto("yahamma", "moto pika", 0, 0, 0, true);

        System.out.println("BICICLETA 1: ");
        bike1.ImprimirInformacoes();
        bike1.Acelerar(50);
        bike1.Frear(20);
        System.out.println("\n\n");

        System.out.println("CARRO 1 (AUTOMOVEL):");
        carro1.ImprimirInformacoes();
        carro1.Acelerar(120);
        carro1.Frear(50);
        System.out.println("\n\n");

        System.out.println("CARRO 2 (CARRO):");
        carro2.ImprimirInformacoes();
        carro2.Acelerar(100);
        carro2.Frear(100);
        System.out.println("\n\n");

        System.out.println("MOTO 1 (MOTO):");
        moto1.ImprimirInformacoes();
        moto1.Acelerar(4);
        moto1.Frear(2);
        */