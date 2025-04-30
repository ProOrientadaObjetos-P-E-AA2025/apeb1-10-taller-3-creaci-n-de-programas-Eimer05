public class Problema_4_EquipoCelularBase {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCosto;
    private double costoFinal;
    private String mac;
    private String imei;

    public Problema_4_EquipoCelularBase(String so, double tam, double costo, double iva, String m, String i) {
        sistemaOperativo = so;
        tamanoPantalla = tam;
        costoInicial = costo;
        ivaPorcentaje = iva;
        ivaCosto = costo * ivaPorcentaje / 100;
        costoFinal = costo + ivaCosto;
        mac = m;
        imei = i;
    }

    public String toString() {
        return "SO: " + sistemaOperativo + "\nPantalla: " + tamanoPantalla + "\nCosto Inicial: " + costoInicial +
               "\nIVA: " + ivaPorcentaje + "%\nCosto Final: " + costoFinal + "\nMAC: " + mac + "\nIMEI: " + imei;
    }
}
