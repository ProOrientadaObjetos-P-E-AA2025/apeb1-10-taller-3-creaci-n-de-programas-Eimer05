public class Problema_2_EquivalenteHoraBase {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public Problema_2_EquivalenteHoraBase(int h) {
        horas = h;
        minutos = h * 60;
        segundos = h * 3600;
        dias = h / 24.0;
    }

    public String toString() {
        return "Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos + "\nDías: " + dias;
    }
}
