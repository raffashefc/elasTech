package semana03_hashSet;



import java.util.HashSet;

public class Ex01 {

    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Lua");
        nomes.add("Lua");
        nomes.add("Sol");
        nomes.add("Estrela");

        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}