public class Problema_5_EstudianteBase {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String estado;

    public Problema_5_EstudianteBase(String n, double n1, double n2, double n3) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        promedio = (n1 + n2 + n3) / 3.0;
        estado = promedio >= 6.5 ? "Aprobado" : "Reprobado";
    }

    public String toString() {
        return "Estudiante: " + nombre + "\nNotas: " + nota1 + ", " + nota2 + ", " + nota3 +
               "\nPromedio: " + promedio + "\nEstado: " + estado;
    }
}
