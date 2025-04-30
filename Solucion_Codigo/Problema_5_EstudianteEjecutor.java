import java.util.Random;

public class Problema_5_EstudianteEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();
        String nombre = "Carlos";
        double nota1 = 5 + rand.nextDouble() * 5;
        double nota2 = 5 + rand.nextDouble() * 5;
        double nota3 = 5 + rand.nextDouble() * 5;

        Problema_5_EstudianteBase estudiante = new Problema_5_EstudianteBase(nombre, nota1, nota2, nota3);
        System.out.println(estudiante);
    }
}
