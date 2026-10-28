package semana03_arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
      public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Gabriela");
        nomes.add("Marcelly");
        nomes.add("Roberta");
        nomes.add("Rosamaria");
        nomes.add("Dianna");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        if (nomes.contains(nome)) {
            int posicao = nomes.indexOf(nome);

            System.out.println("Nome encontrado!");
            System.out.println("Posição: " + posicao);
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        sc.close();
    }
}
