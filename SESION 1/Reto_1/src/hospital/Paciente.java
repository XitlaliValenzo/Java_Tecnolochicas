package hospital;

public class Paciente {
    public String nombre;
    public int edad;
    public String numExpediente;

    public void mostrarInformacion(){
        System.out.println("\nInformación del paciente");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numExpediente);
    }
}
