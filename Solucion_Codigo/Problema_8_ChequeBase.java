public class Problema_8_ChequeBase {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Problema_8_ChequeBase(String cliente, String banco, double valor) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = valor;
        comision = valorCheque * 0.003;
    }

    public String toString() {
        return "Cliente: " + nombreCliente + "\nBanco: " + nombreBanco +
               "\nValor Cheque: " + valorCheque + "\nComisión: " + comision;
    }
}
