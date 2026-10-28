package semana03_polimorfismo.pagamento;

class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado, vence em 3 dias.%n", valor);
    }
}