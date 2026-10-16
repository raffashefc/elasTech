package petshop;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PetCli {
    PetRepository repository = new PetRepository();
    Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            try{
            opcao = scanner.nextInt();
            scanner.nextLine(); 
                processarOpcao(opcao);
        }catch(InputMismatchException e){
            System.out.println("\nDigite apenas números!");
            scanner.nextLine(); 
        }
        }
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n=== MENU PETSHOP ===");
        System.out.println("3 - Buscar pet");
        System.out.println("2 - Listar pets cadastrados");
        System.out.println("1 - Cadastrar pet");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 3:
                buscarPet();
                break;
            case 2:
                listarPets();
                break;
            case 1:
                cadastrarPet();
                break;
            case 0:
                System.out.println("\nEncerrando o sistema. Até logo!");
                break;
            default:
                System.out.println("\nOpção inválida! Tente novamente.");
                break;
        }
       
    }
    

    private void listarPets() {
        for (int i = 0; i < repository.getTotalPets(); i++) {
            System.out.println(i + 1 + " - " + repository.pets[i].nome);
        }
        if (repository.getTotalPets() == 0) {
            System.out.println("Não há pets cadastrados.");
        }
    }

    private void buscarPet() {
        System.out.print("Qual pet você procura?: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < repository.getTotalPets(); i++) {
            if (repository.pets[i].nome.equalsIgnoreCase(nome)) {
                System.out.println("Encontrado! " + nome + " - peso: " + repository.pets[i].peso);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pet não encontrado.");
        }
    }

    private void cadastrarPet() {
       if (repository.isPetArrayFull()) {
            System.out.println("\n[Aviso] O limite máximo de 5 pets foi atingido!");
            return;
        }

        Pet pet = cadastraPetCli();
        
        repository.salvarPet(pet);

        System.out.println("\nPet cadastrado com sucesso!");
        System.out.println("Total de pets cadastrados: " + repository.getTotalPets());
    }

    private Pet cadastraPetCli() {
        Pet pet = new Pet();

        System.out.print("Digite o nome do pet: ");
        pet.nome = scanner.nextLine();
        
        System.out.print("Digite a espécie do pet: ");
        pet.especie = scanner.nextLine();
        
        System.out.print("Digite o peso do pet: ");
        pet.peso = scanner.nextDouble();
        scanner.nextLine(); 

        pet.porte = pet.definirPorte();

        return pet;
    }

}