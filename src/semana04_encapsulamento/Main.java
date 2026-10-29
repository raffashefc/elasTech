package semana04_encapsulamento;

public class Main {
    public static void main(String[] args) {
        // ContaBancaria c = new ContaBancaria();
        // System.out.println(c.titular);
        // c.saldo = -5000;

        ContaBancaria c = new ContaBancaria();

        // System.out.println("Titular: " + c.getTitular());
        // System.out.println("Saldo: " + c.getSaldo());

        // chamada dando suporte a setter q3
        c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

        //q4
        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());
        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);
        System.out.println("Saldo: " + c.getSaldo());
    }
}

/**
 * error: titular has private access in ContaBancaria
 * error: saldo has private access in ContaBancaria
 * 
 * O private faz o compilador recusar o acesso de fora da classe.
 * Como o erro impede a compilação de tudo.
 */