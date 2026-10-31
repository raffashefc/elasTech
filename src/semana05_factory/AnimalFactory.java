package semana05_factory;

public class AnimalFactory {

    public static Animal getAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        } else if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }
        throw new IllegalArgumentException("Tipo de animal desconhecido: " + tipo);
    }
}