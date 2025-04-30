import java.util.Random;

public class Problema_8_ChequeEjecutor {
    public static void main(String[] args) {
        Random rand = new Random();
        String nombreCliente = "Luis Perez";
        String banco = "Banco Pi";
        double valorCheque = 1000 + rand.nextDouble() * 9000; 

        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(nombreCliente, banco, valorCheque);
        System.out.println(cheque);
    }
}
