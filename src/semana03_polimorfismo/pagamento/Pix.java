package semana03_polimorfismo.pagamento;

class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f feito via Pix, na hora!%n", valor);
    }
}