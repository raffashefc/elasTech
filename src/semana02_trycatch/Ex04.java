package semana02_trycatch;

public class Ex04 {
    public static void main(String[] args) {
        String nome = null;

        try {
            int tamanho = nome.length();
            System.out.println("Tamanho do nome: " + tamanho);
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido.");
        }
    }
}
