package semana03_hashMap;

public class Ex05 {
    public static void main(String[] args) {
        java.util.HashMap<String, Double> notas = new java.util.HashMap<>();
        notas.put("Camila", 6.5);
        notas.put("Renata", 7.5);
        notas.put("Ingrid", 8.0);

        System.out.println("Mapa de notas:");
        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());

        notas.remove("Camila");
        System.out.println("Mapa de notas após remover Camila:");
        System.out.println(notas);
        System.out.println("Tamanho: " + notas.size());
    }
}
