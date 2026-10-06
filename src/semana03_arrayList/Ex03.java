package semana03_arrayList;

import java.util.ArrayList;

public class Ex03 {
public static void main(String[] args) {
    ArrayList<String> listaNomes   = new ArrayList<>();   
    listaNomes.add("Gabriela");
    listaNomes.add("Marcelly");
    listaNomes.add("Roberta");
    listaNomes.add("Julia");

    System.out.println("Lista antes: " + listaNomes);
    listaNomes.set(2, "Adenizia");
    System.out.println("Lista depois: " + listaNomes);
}
}