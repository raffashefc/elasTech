package semana06_testes.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Testes da Calculadora de Descontos")
class CalculadoraDescontoTest {

    private CalculadoraDesconto calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraDesconto();
    }

    @Test
    @DisplayName("Teste 1: Compra de R$ 50.0 para cliente comum não deve receber desconto")
    void testeCompraClienteComumSemDesconto() {
        // Arrange (Organizar)
        double valorCompra = 50.0;
        boolean clienteVip = false;

        // Act (Executar)
        double valorFinal = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // Assert (Verificar)
        assertEquals(50.0, valorFinal, 0.0001, "O valor para cliente comum com compra < 100 deve ser R$ 50.0");
    }

    @Test
    @DisplayName("Teste 2: Compra de R$ 200.0 para cliente VIP deve receber 10% de desconto")
    void testeCompraClienteVipComDesconto() {
        // Arrange (Organizar)
        double valorCompra = 200.0;
        boolean clienteVip = true;

        // Act (Executar)
        double valorFinal = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // Assert (Verificar)
        assertEquals(180.0, valorFinal, 0.0001, "O cliente VIP deve receber 10% de desconto (R$ 180.0)");
    }

    @Test
    @DisplayName("Teste 3: Valor de compra zerado ou negativo deve lançar IllegalArgumentException")
    void testeCompraValorInvalidoLancaExcecao() {
        // Arrange (Organizar)
        double valorInvalido = -10.0;

        // Act & Assert (Executar e Verificar)
        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.aplicarDesconto(valorInvalido, false),
            "Deve lançar IllegalArgumentException quando o valor da compra for menor ou igual a zero"
        );
    }
}