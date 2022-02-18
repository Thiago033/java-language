package Agenda;

public class Agenda {
    private EntradaNaAgenda[] eventos;

    public Agenda(int tamanhoDaLista){
        eventos = new EntradaNaAgenda[tamanhoDaLista];
    }

    public EntradaNaAgenda[] getEvento(){
        return eventos;
    }

    public EntradaNaAgenda buscaPorEvento(String evento){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i].getEvento().equalsIgnoreCase(evento)) {
                return eventos[i];
            }
        }
        return null;
    }
}
