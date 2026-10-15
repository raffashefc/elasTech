package semana03_hashSet;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.isEmpty();
        System.out.println(nomes.isEmpty());
        nomes.add("Rafaela");
        System.out.println(nomes.isEmpty());
    }
}
