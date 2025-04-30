import java.util.Random;

public class Problema_1_TerrenoEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();
        Problema_1_TerrenoBase terreno = new Problema_1_TerrenoBase();

        double ancho = 5 + rand.nextDouble() * 15; // entre 5 y 20
        double largo = 5 + rand.nextDouble() * 20; // entre 5 y 25
        double valorMetro = 10 + rand.nextDouble() * 40; // entre 10 y 50

        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setValorMetroCuadrado(valorMetro);
        terreno.calcularArea();
        terreno.calcularCostoTerreno();
        System.out.println(terreno);
    }
}
