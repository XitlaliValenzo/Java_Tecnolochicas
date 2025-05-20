package cajero;

import java.util.Scanner;

public class CajeroAutomatico {
    public double saldoInicial;

    public CajeroAutomatico(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double consultarSaldo() {
        return saldoInicial;
    }

    public double depositar(double cantDepositar){
        saldoInicial = saldoInicial + cantDepositar;
        return saldoInicial;
    }

    public double retirar(double cantRetirar){
        if (cantRetirar>saldoInicial){
            System.out.println("No puedes retirar esa cantidad");

        } else {
            saldoInicial = saldoInicial - cantRetirar;

        }
        return saldoInicial;
    }

    public void salir(){
        System.out.println("Gracias por usar este cajero automático :)");
    }
}
