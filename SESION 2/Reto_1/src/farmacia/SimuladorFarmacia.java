package farmacia;

public class SimuladorFarmacia {
    public String nombreMedicamento;
    public double precioUnitario;
    public int cantidadPiezas;

    public double totalSinDescuento(){
        return precioUnitario * cantidadPiezas;
    }

    public boolean aplicaDescuento(double totalSinDescuento){
        return totalSinDescuento > 500;
    }

    public double calcularDescuento(boolean aplicaDescuento, double totalSinDescuento){
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.00;
        return descuento;
    }

    public double totalConDescuento(double totalSinDescuento, double descuento){
        return totalSinDescuento - descuento;
    }

    public void mostrarResumen(){
        double totalSinDescuento = totalSinDescuento();
        boolean aplicaDescuento = aplicaDescuento(totalSinDescuento);
        double descuento = calcularDescuento(aplicaDescuento, totalSinDescuento);
        double totalPagar = totalConDescuento(totalSinDescuento, descuento);

        System.out.println("Medicamento: "+ nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total sin descuento: " + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
