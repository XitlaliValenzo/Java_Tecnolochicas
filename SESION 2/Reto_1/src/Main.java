import farmacia.SimuladorFarmacia;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimuladorFarmacia medicamentoUno = new SimuladorFarmacia();

        System.out.println("Ingresa el nombre del medicamento: ");
        medicamentoUno.nombreMedicamento = scanner.nextLine();

        System.out.println("Ingresa el precio unitario: ");
        medicamentoUno.precioUnitario = scanner.nextDouble();

        System.out.println("Ingresa la cantidad de piezas: ");
        medicamentoUno.cantidadPiezas = scanner.nextInt();

        medicamentoUno.mostrarResumen();

        scanner.close();
    }
}