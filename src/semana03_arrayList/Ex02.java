package semana03_arrayList;

import java.util.ArrayList;

public class Ex02 {
public static void main(String[] args) {
    ArrayList<String> listaFrutas   = new ArrayList<>();    // Criação de uma lista para armazenar as frutas
    listaFrutas.add("Maçã");
    listaFrutas.add("Banana");
    listaFrutas.add("Laranja");
    listaFrutas.add("Uva");

    System.out.println("A primeira fruta: " + listaFrutas.get(0));
    System.out.println("A última fruta: " + listaFrutas.get(listaFrutas.size() - 1));
    System.out.println("A quantidade de frutas: " + listaFrutas.size());
}
}