package semana03_hashMap;

public class Ex03 {
    public static void main(String[] args) {
        java.util.HashMap<String, String> agenda = new java.util.HashMap<>();
        agenda.put("Lua", "2125273349");
        agenda.put("Brianna", "2127325944");
        agenda.put("Darth", "2138339340");
        
        if (agenda.containsKey("Shakira")) {
            System.out.println("Shakira está na agenda.");
        }
        else {
            System.out.println("Shakira não está na agenda.");
        }
        
        if (agenda.containsKey("Darth")) {
            System.out.println(
                "Telefone do Darth: " + agenda.get("Darth")
            );
        } else {
            System.out.println("Darth não está na agenda.");
        }
    }
}
