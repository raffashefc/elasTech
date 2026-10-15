package semana03_hashMap;

public class Ex02 {
    public static void main(String[] args) {
        java.util.HashMap<String, Double> produtos = new java.util.HashMap<>();
        produtos.put("Café", 5.00);
        System.out.println(produtos);
        System.out.println("Tamanho: " + produtos.size());

        produtos.put("Café", 7.50);
        System.out.println(produtos);
        System.out.println("Tamanho: " + produtos.size());

        System.out.println( produtos.get("Café"));
    }
}
