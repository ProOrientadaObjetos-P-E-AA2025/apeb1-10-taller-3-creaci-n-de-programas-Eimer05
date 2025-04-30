// Problema-1_TerrenoBase.java
public class Problema_1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public void calcularArea() {
        area = ancho * largo;
    }

    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    public void setAncho(double a) {
        ancho = a;
    }

    public void setLargo(double l) {
        largo = l;
    }

    public void setValorMetroCuadrado(double v) {
        valorMetroCuadrado = v;
    }

    public String toString() {
        return "Ancho: " + ancho + "\nLargo: " + largo + "\nÁrea: " + area +
               "\nValor por m2: " + valorMetroCuadrado + "\nCosto: " + costoTerreno;
    }
}
