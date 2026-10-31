package semana05_adapter;

public class PayPalAdapter implements Pagamento {
    private PayPalAPI payPal;

    public PayPalAdapter(PayPalAPI payPal) {
        this.payPal = payPal;
    }

    @Override
    public void pagar() {
        payPal.sendPayment();
    }
}