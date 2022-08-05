package Agenda;
public class DataHora extends Data {
    private Hora hora;

    public DataHora(int d, int m, int a, int hor, int min, int seg){
        super(d,m,a);
        hora = new Hora(hor,min,seg);
    }

}
