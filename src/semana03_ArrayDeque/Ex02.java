package semana03_ArrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.addAll(Arrays.asList("Lua", "Sol", "Estrela"));
        System.out.println(nomes + ", Tamanho: " + nomes.size());
        System.out.println("Próximo elemento: " + nomes.peek());
        System.out.println(nomes + ", Tamanho: " + nomes.size());
        
    }
}
