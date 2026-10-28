package semana03_forEach;

public class Ex05 {
    public static void main(String[] args) {
        String[] nomes = {"Lua", "Sol", "Estrela", "Planeta"};

        System.out.println("--- Usando o FOR Tradicional ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição [" + i + "]: " + nomes[i]);
        }

        System.out.println(); 

        System.out.println("--- Usando o FOR-EACH ---");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
