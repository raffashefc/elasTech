package semana03_ArrayDeque;
import java.util.ArrayDeque;

public class Ex06 {
    public static void main(String[] args) {
        ArrayDeque<String> fila = new ArrayDeque<>();
        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        }
        else {
            System.out.println("Próximo: " + fila.peek());
        }
        
        fila.add("Lua");
        
        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        }
        else {
            System.out.println("Próximo: " + fila.peek());
        }
    }
}
