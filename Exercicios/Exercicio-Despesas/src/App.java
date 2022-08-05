public class App {
    public static void main(String[] args) throws Exception {

        DespesaMes[] despesas = new DespesaMes[4];
        despesas[0] = new DespesaDia(10, 10, 500);
        despesas[1] = new DespesaDia(10, 10, 1);
        despesas[2] = new DespesaDia(10, 9, 12);
        despesas[3] = new DespesaDia(10, 9, 58);

        Despesas despesasTotais = new Despesas(despesas);

        DespesaMes mes10;
        mes10 = despesasTotais.totalizaMes(10);

        System.out.println(mes10.getValor());

        





    }
}
