package semana04_encapsulamento;

public class Main {
    public static void main(String[] args) {
        // ContaBancaria c = new ContaBancaria();
        // System.out.println(c.titular);
        // c.saldo = -5000;

        ContaBancaria c = new ContaBancaria();
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());
    }
}

/**
 * error: titular has private access in ContaBancaria
error: saldo has private access in ContaBancaria

O private faz o compilador recusar o acesso de fora da classe. 
Como o erro impede a compilação de tudo.
 */