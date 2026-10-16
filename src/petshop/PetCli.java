package petshop;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PetCli {
    PetRepository repository = new PetRepository();
    Scanner scanner = new Scanner(System.in);
    ArrayDeque<String> filaDeBanho = new ArrayDeque<>();

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
        System.out.println("7 - Executar serviços (Banho, Tosa e Consulta)");
        System.out.println("6 - Atender o próximo pet na fila de banho");
        System.out.println("5 - Entrar na fila de banho");
        System.out.println("4 - Listar espécies cadastrados");
        System.out.println("3 - Buscar pet");
        System.out.println("2 - Listar pets cadastrados");
        System.out.println("1 - Cadastrar pet");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 7:
                executarServico();
                break;
            case 6:
                atenderProximoPet();
                break;
            case 5:
                entrarNaFilaDeBanho();
                break;
            case 4:
                listarEspecies();
                break;
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
    
    private void executarServico() {
        System.out.print("Nome do pet: ");
        String nomePet = scanner.nextLine();

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        for (Servico servico : servicos) {
            servico.executar(nomePet);
        }
    }


    private void atenderProximoPet() {
        if (filaDeBanho.isEmpty()) {
            System.out.println("A fila de banho está vazia!");
            return;
        }

        String nomePet = filaDeBanho.poll();
        System.out.println("Próximo da fila: " + nomePet);
        System.out.println("Fila de banho: " + filaDeBanho);
    }

    private void entrarNaFilaDeBanho() {
       

        System.out.print("Qual pet você deseja entrar na fila de banho?: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < repository.getTotalPets(); i++) {
            if (repository.pets[i].nome.equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            filaDeBanho.add(nome);
            System.out.println(nome + " entrou na fila.");
            System.out.println("Fila agora: " + filaDeBanho);
        } else {
            System.out.println("Pet não encontrado. Não é possível entrar na fila.");
        }
    }

    private void listarEspecies() {
        HashSet<String> especies = new HashSet<>();
        for (int i = 0; i < repository.getTotalPets(); i++) {
            especies.add(repository.pets[i].especie);
        }
        if (especies.isEmpty()) {
            System.out.println("Não há espécies cadastradas.");
        } else {
            System.out.println("Espécies cadastradas:");
            for (String especie : especies) {
                System.out.println("- " + especie);
            }
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