public class App {
    public static void main(String[] args) throws Exception {

        //CONTA 1
        Banco itau = new Banco("Itau");

        Conta  maria = itau.criaConta("Maria");

        //DADOS DA CONTA
        System.out.println("CONTA 1");
        System.out.println("Banco: "+ maria.pegaBanco());
        System.out.println("Nome: "+ maria.pegaNome());
        System.out.println("Codigo: "+ maria.pegaCodigo());
        System.out.println("Saldo: "+ maria.pegaSaldo());
        System.out.println("\n");

        //CONTA 2
        Banco bb = new Banco("Banco do Brasil");

        Conta jose = bb.criaConta("Jose");

        //DADOS DA CONTA 2
        System.out.println("CONTA 2");
        System.out.println("Banco: "+ jose.pegaBanco());
        System.out.println("Nome: "+ jose.pegaNome());
        System.out.println("Codigo: "+ jose.pegaCodigo());
        System.out.println("Saldo: "+ jose.pegaSaldo());
        System.out.println("\n");

        //CONTA 3 - POUPANCA TESTE
        Conta marcio = bb.criaContaPoupanca("Marcio");

        try {
            marcio.retira(-100);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }
        

        //DADOS DA CONTA 2
        System.out.println("CONTA 3 - POUPANCA TESTE");
        System.out.println("Banco: "+ marcio.pegaBanco());
        System.out.println("Nome: "+ marcio.pegaNome());
        System.out.println("Codigo: "+ marcio.pegaCodigo());
        System.out.println("Saldo: "+ marcio.pegaSaldo());
        System.out.println("\n");
    }
}
