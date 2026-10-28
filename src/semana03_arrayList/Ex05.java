package semana03_arrayList;
import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Gabriela");
        nomes.add("Rosamaria");
        nomes.add("Dianna");
        nomes.add("Roberta");
        nomes.add("Julia");
        nomes.add("Marcelly");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
