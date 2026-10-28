package semana03_ArrayDeque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        ArrayDeque<String> nomes = new ArrayDeque<>();
        nomes.addAll(Arrays.asList("Lua", "Sol", "Estrela"));
        System.out.println(nomes + ", Tamanho: " + nomes.size());
        System.out.println("Próximo elemento: " + nomes.poll());
        System.out.println(nomes + ", Tamanho: " + nomes.size());
        
        
    }
}
