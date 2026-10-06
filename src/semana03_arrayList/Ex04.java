package semana03_arrayList;
import java.util.ArrayList;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Rio de Janeiro");
        cidades.add("Brasília");
        cidades.add("Salvador");
        cidades.add("Recife");

        System.out.println("Cidades antes: " + cidades);
        cidades.remove(1);
        System.out.println("Cidades depois: " + cidades);
        System.out.println("Quantidade de cidades restantes: " + cidades.size());
    }
}