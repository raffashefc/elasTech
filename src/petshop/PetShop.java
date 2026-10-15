package petshop;

public class PetShop {
    
    public static void main(String[] args) {
        String nome = "Mel";
        String especie = "Cachorro";
        double peso = 8.5;
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg\n", peso);
    }
}
