package semana03_polimorfismo.pagamento;

public class Main {

    public static void main(String[] args) {
        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);
    }
}
