package testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    void testAplicarDescontoClienteComumCompraPequena() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 50.0;
        boolean clienteVip = false;

        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        assertEquals(50.0, resultado, "Cliente comum comprando R$ 50.0 não deve ter desconto.");
    }

    @Test
    void testAplicarDescontoClienteVip() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 200.0;
        boolean clienteVip = true;

        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        assertEquals(180.0, resultado, "Cliente VIP deve ter 10% de desconto.");
    }

    @Test
    void testAplicarDescontoValorInvalidoLancaExcecao() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorInvalido = -10.0;
        boolean clienteVip = false;

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.aplicarDesconto(valorInvalido, clienteVip);
        }, "Passar valor negativo deve lançar IllegalArgumentException.");
    }
}