public class App {
    public static void main(String[] args) throws Exception {
        int i;
        
        Empregado[] lista = new Empregado[4];

        lista[0] = new Secretaria("Maria", 1000, 2000);
        lista[1] = new Empregado("Jose", 500, 1998);
        lista[2] = new Empregado("Joao", 700, 2001);
        lista[3] = new Gerente("Vitor", 5000, 1999, (Secretaria) lista[0], lista[1], lista[2]);

        
        for (i = 0; i < 4; i++) {
            lista[i].DadosDoEmpregado();
        }
        System.out.println("\n\n ===================================================== \n \n");

        ((Gerente) lista[3]).Aumento(100, 10);

        for (i = 0; i < 4; i++) {
            lista[i].DadosDoEmpregado();
        }

        System.out.println("\n\n ===================================================== \n \n");

        ((Secretaria) lista[0]).GuardaNome("Jorge");
        ((Secretaria) lista[0]).ImprimirNomesSecret();
    }
}