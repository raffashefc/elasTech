package petshop;

public class PetRepository {
    Pet[] pets = new Pet[5];
    int total_Pets = 0;

    public boolean isPetArrayFull() {
        return total_Pets >= pets.length;
    }

    public void salvarPet(Pet pet) {
        pets[total_Pets] = pet;
        total_Pets++;
    }

    public int getTotalPets() {
        return total_Pets;
    }
}