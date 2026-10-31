package semana05_adapter;

public class Main {
    public static void main(String[] args) {
        // Não compila: PayPalAPI não implementa Pagamento
        // Pagamento p = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter(new PayPalAPI());
        pagamento.pagar();
    }
}