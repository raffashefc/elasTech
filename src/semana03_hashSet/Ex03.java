package semana03_hashSet;

public class Ex03 {
    
    public static void main(String[] args) {
        String[] nomes = {"Lua", "Lua", "Estrela", "Estrela","Sol"};
        
        System.out.println(java.util.Arrays.toString(nomes));
        System.out.println(new java.util.HashSet<>(java.util.Arrays.asList(nomes)));
    }
}
