package semana05_decorator;

public class Main {
    public static void main(String[] args) {

        // Açaí só com granola
        Acai acai1 = new Granola(new AcaiSimples());
        System.out.println(acai1.getDescricao());
        System.out.printf("Preço: R$ %.2f%n%n", acai1.getPreco());

        // Açaí com granola e morango (um embrulhando o outro)
        Acai acai2 = new Morango(new Granola(new AcaiSimples()));
        System.out.println(acai2.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", acai2.getPreco());
    }
}