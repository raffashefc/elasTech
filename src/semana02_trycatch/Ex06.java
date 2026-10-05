package semana02_trycatch;

public class Ex06 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz"};

        try {
            System.out.println("Nome na posição 5: " + nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");
    }
}
