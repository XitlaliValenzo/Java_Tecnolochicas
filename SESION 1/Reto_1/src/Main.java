import hospital.Paciente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa el número del expediente: ");
        paciente.numExpediente = scanner.nextLine();

        paciente.mostrarInformacion();
        scanner.close();
    }
}