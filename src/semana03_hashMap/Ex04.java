package semana03_hashMap;

public class Ex04 {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> estoque = new java.util.HashMap<>();
        estoque.put("Café", 5);
        estoque.put("Torrada", 2);
        System.out.println(estoque.getOrDefault("Café", 0));
        System.out.println(estoque.getOrDefault("Torrada", 0));
        System.out.println(estoque.getOrDefault("Biscoito", 0));
        System.out.println(estoque.get("Biscoito"));
    }
}
