package petshop;
import java.util.Scanner;
public class PetShop {
    
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);

        Pet[] pets = new Pet[5];
        Pet pet = new Pet();

        System.out.print("Digite o nome do pet: ");
        pet.nome = scannear.nextLine();
        System.out.print("Digite a espécie do pet: ");
        pet.especie = scannear.nextLine();
        System.out.print("Digite o peso do pet: ");
        pet.peso = scannear.nextDouble();

        pet.porte = pet.definirPorte();

        pets[0] = pet;
        
        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.printf("Porte: %s\n", pet.porte);
        
        scannear.close();
    }
}
