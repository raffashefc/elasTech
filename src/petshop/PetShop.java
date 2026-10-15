package petshop;
import java.util.Scanner;
public class PetShop {
    
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);

        Pet[] pets = new Pet[5];

        int total_Pets = 0;
        int opcao = -1; 

        while(opcao != 0){
            System.out.println("\n=== MENU PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scannear.nextInt();
            scannear.nextLine();
        
        
        
      switch (opcao) {
                case 1:
                    if (total_Pets < pets.length) {
                        Pet novo_Pet = new Pet();

                        System.out.print("Digite o nome do pet: ");
                        novo_Pet.nome = scannear.nextLine();
                        
                        System.out.print("Digite a espécie do pet: ");
                        novo_Pet.especie = scannear.nextLine();
                        
                        System.out.print("Digite o peso do pet: ");
                        novo_Pet.peso = scannear.nextDouble();
                        scannear.nextLine();

                        novo_Pet.porte = novo_Pet.definirPorte();

                        pets[total_Pets] = novo_Pet;

                        total_Pets++;

                        System.out.println("\nPet cadastrado com sucesso!");
                        System.out.println("Total de pets cadastrados até agora: " + total_Pets);
                    } else {
                        System.out.println("\n[Aviso] O limite máximo de 5 pets foi atingido!");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema. Até logo!");
                    scannear.close();
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        
        }
            

    }
}
            
