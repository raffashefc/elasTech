package semana05_builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

        System.out.println(pizza);
    }
}