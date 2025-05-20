import reservas.Pasajero;
import reservas.Vuelo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");

        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo.obtenerItinerario());

        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Mario Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}