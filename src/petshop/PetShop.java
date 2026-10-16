package petshop;
public class PetShop {
    
    public static void main(String[] args) {
        PetCli cli = new PetCli();
        cli.iniciar();

        //Teste temporario sobrecarga

    // Pet petTeste = new Cachorro();
    // petTeste.nome = "Mel";
    // petTeste.especie = "Cachorro";
    // petTeste.peso = 8.5;
    // petTeste.porte = "Pequeno";

    // PetShop petShop = new PetShop();

    // petShop.exibePet(petTeste);

    // System.out.println("---");

    // petShop.exibePet(petTeste, "=== FICHA DO PET ===");
    }

    public void exibePet(Pet pet) {
        System.out.println(pet.nome + " - peso: " + pet.peso);
    }

    public void exibePet(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }
}
            
