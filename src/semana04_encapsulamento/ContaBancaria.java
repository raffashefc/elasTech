package semana04_encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    //q3
    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }
    //q4
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valor;
        registrarLog("deposito de " + valor);
    }

    public void sacar(double valor) {
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        registrarLog("saque de " + valor);
    }

    private boolean temSaldo(double valor) {
        return saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + titular + ": " + acao);
    }
}