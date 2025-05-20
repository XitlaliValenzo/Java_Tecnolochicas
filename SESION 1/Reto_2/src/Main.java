import eventos.Entrada;

public class Main {
    public static void main(String[] args) {

        Entrada eventoUno = new Entrada("Obra de Teatro", 250.63);
        Entrada eventoDos = new Entrada("Concierto Billie Eilish", 1580.36);

        eventoUno.mostrarInformacion();
        eventoDos.mostrarInformacion();
    }
}