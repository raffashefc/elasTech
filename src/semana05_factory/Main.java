package semana05_factory;

public class Main {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("cachorro");
        Animal a2 = AnimalFactory.getAnimal("gato");

        a1.emitirSom();
        a2.emitirSom();
    }
}