public class Problema_7_AutomotorBase {
    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema_7_AutomotorBase(String c, String m, int anio, double valor) {
        cedula = c;
        marca = m;
        anioFabricacion = anio;
        valorVehiculo = valor;
        int antiguedad = 2025 - anioFabricacion;
        valorMatricula = valorVehiculo * 0.002 * antiguedad;
    }

    public String toString() {
        return "Dueño (cédula): " + cedula + "\nMarca: " + marca + "\nAño: " + anioFabricacion +
               "\nValor Vehículo: " + valorVehiculo + "\nValor Matrícula: " + valorMatricula;
    }
}
