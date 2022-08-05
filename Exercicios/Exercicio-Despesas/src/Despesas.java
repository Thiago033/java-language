public class Despesas {
    DespesaMes[] despesa;
    
    public Despesas(DespesaMes[] despesa){
        this.despesa = despesa;
    }

    public DespesaMes totalizaMes(int mes){
        int i;
        float valor = 0;

        if (mes > 0 && mes < 13) {
            for (i = 0; i < despesa.length; i++) {
                if (despesa[i].getMes() == mes) {
                    valor += despesa[i].getValor();
                }
            }

            return new DespesaMes(mes, valor);
        }
        return null;
    }
}
