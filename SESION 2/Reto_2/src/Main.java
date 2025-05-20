import cajero.CajeroAutomatico;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CajeroAutomatico cajeroUno = new CajeroAutomatico(100.00);
        int opcion = 0;
        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Tu saldo actual es: $" + cajeroUno.saldoInicial);
                }
                case 2 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cajeroUno.depositar(deposito);
                    System.out.println("Depósito realizado. Saldo actualizado: $" + cajeroUno.saldoInicial);
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cajeroUno.retirar(retiro);
                    System.out.println("Retiro realizado. Saldo actualizado: $" + cajeroUno.saldoInicial);
                }
                case 4 -> {
                    cajeroUno.salir();
                }
                default -> {
                    System.out.println("Opción inválida. Intenta nuevamente.");
                }
            }

        } while (opcion != 4);
        scanner.close();
    }
}