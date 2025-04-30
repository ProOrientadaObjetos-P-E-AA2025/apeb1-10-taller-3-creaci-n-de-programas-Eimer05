public class Problema_3_InstitucionEducativaBase {
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoPorAlumno;
    private double presupuesto;

    public void setNombre(String n) {
        nombre = n;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setNumAlumnos(int a) {
        numAlumnos = a;
    }

    public void setNumDocentes(int d) {
        numDocentes = d;
    }

    public void setNumSedes(int s) {
        numSedes = s;
    }

    public void setGastoPorAlumno(double g) {
        gastoPorAlumno = g;
    }

    public void calcularPresupuesto() {
        presupuesto = gastoPorAlumno * numAlumnos;
    }

    public String toString() {
        return "Institución: " + nombre + "\nTipo: " + tipo + "\nAlumnos: " + numAlumnos +
               "\nDocentes: " + numDocentes + "\nSedes: " + numSedes + "\nPresupuesto: " + presupuesto;
    }
}
