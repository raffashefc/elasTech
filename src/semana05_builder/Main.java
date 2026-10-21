package semana05_builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

    }
}