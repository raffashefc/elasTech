package semana03_hashSet;
import java.util.HashSet;
public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Kiwi");
        frutas.add("Banana");
        frutas.add("Morango");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
    
}
