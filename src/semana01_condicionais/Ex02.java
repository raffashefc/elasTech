package semana01_condicionais;

public class Ex02 {
        public static void main(String[] args) {
        double saldo = 500.00;
        double valorCompra = 320.00;

        if (saldo >= valorCompra) {
            System.out.println("Compra aprovada!");
            saldo = saldo - valorCompra;
            System.out.println("Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println("Quanto falta: " + saldo);
        }
    }
}
