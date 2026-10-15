package semana03_ArrayDeque;

import java.util.ArrayDeque;
public class Ex04 {
    public static void main(String[] args) {
        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.add("Lua");
        nomes.add("Sol");
        nomes.add("Estrela");

       while (!nomes.isEmpty()) {
           System.out.println(nomes.remove());
       }
       System.out.println("Fila vazia!");
    }
}
