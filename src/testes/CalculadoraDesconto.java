package testes;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        // Validação de entrada
        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }

        // Regra do cliente VIP (10% de desconto)
        if (clienteVip) {
            return valorCompra * 0.90;
        }

        // Regra para compra comum menor que 100
        return valorCompra;
    }
}