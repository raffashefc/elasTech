package petshop;
import java.util.Scanner;
public class PetShop {
    
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        System.out.print("Digite o nome do pet: ");
        String nomePet = scannear.nextLine();
        System.out.print("Digite a espécie do pet: ");
        String especie = scannear.nextLine();
        System.out.print("Digite o peso do pet: ");
        double peso = scannear.nextDouble();

        String porte = "";
        if( peso < 10 ){
            porte = "Pequeno";
        } else if( peso >= 10 && peso <= 25 ){
            porte = "Médio";
        } else if( peso > 25 ){
            porte = "Grande";
        }

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nomePet);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg\n", peso);
        System.out.printf("Porte: %s\n", porte);

        scannear.close();
    }
}
