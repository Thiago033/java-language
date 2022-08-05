package Agenda;
public class App {
    public static void main(String[] args) throws Exception {

        Agenda agenda = new Agenda(4);

        agenda.getEvento()[0] = new EntradaNaAgenda(12, 12, 12, 12, 12, 12, "Jorge");
        agenda.getEvento()[1] = new EntradaNaAgenda(1, 1, 1, 1, 1, 1, "grggg");
        agenda.getEvento()[2] =  new EntradaNaAgenda(110, 10, 10, 10, 10, 10, "rgwef3q");
        agenda.getEvento()[3]= new EntradaNaAgenda(110, 10, 10, 10, 10, 10, "fgergrgr");

        System.out.println(agenda.buscaPorEvento("rgwef3q").getEvento());
        

    }
}
