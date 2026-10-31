package semana06_testes.testes;
public class CalculadoraDesconto {

    /**
     * Aplica regras de desconto sobre o valor de uma compra.
     *
     * @param valorCompra O valor original da compra.
     * @param clienteVip  Indica se o cliente possui categoria VIP.
     * @return O valor final da compra após aplicação de regras de desconto.
     * @throws IllegalArgumentException Se o valor da compra for menor ou igual a zero.
     */
    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }

        if (clienteVip) {
            return valorCompra * 0.90; // 10% de desconto
        }

        return valorCompra;
    }
}