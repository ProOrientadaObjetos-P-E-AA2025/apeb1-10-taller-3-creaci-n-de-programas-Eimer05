public class Problema_6_ProfesorBase {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Problema_6_ProfesorBase(String n, String a, double s, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = s;
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
        cedula = c;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nCédula: " + cedula +
               "\nSueldo Básico: " + sueldoBasico + "\nSueldo Total: " + sueldoTotal;
    }
}
