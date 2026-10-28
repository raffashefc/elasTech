package semana03_arrayList;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    lista.add("Java");
    lista.add("Elas");
    lista.add("Tech");

    System.out.println(lista.get(0));
    System.out.println(lista.get(1));
    System.out.println(lista.get(2));
}
}