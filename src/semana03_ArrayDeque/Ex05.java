package semana03_ArrayDeque;

import java.util.ArrayDeque;
public class Ex05 {
    public static void main(String[] args) {
        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.add("Lua");
        nomes.add("Sol");
        nomes.add("Estrela");

        System.out.println(nomes.contains("Bia"));
        System.out.println(nomes.contains("Zoe"));
    }
}
