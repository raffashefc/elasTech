package semana03_forEach;

public class Ex04 {
    public static void main(String[] args) {
        String[] nomes = {"Lua", "Sol", "Estrela", "Planeta"};
        int contador = 0;
        for (String nome : nomes) {
            if (nome.length() > 5) {
                contador++;
            }
        }
        System.out.println("Total: " + contador);
    }
}
