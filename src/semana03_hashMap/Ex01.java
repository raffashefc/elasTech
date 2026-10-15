package semana03_hashMap;

public class Ex01 {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> pessoas = new java.util.HashMap<>();
        pessoas.put("Lua", 3);
        pessoas.put("Brianna", 6);
        pessoas.put("Darth", 6);

        System.out.println(pessoas);
        System.out.println("Idade de Brianna: " + pessoas.get("Brianna"));
    }
}
