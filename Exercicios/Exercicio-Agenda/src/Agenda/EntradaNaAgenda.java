package Agenda;
public class EntradaNaAgenda extends DataHora {

    private String evento;

    public EntradaNaAgenda(int d, int m, int a, int hor, int min, int seg, String ev){
        super(d,m,a,hor,min,seg);
        evento = ev;
    }

    public String getEvento(){
        return evento;
    }
}
