package semana03_hashSet;

//. Crie um HashSet de cores usando addAll. 
// Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.

import java.util.HashSet;

public class Ex02 {

    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();
        cores.addAll(cores);

        if (cores.contains("verde")) {
            System.out.println("A cor verde já está no conjunto.");
        } else {
            System.out.println("A cor verde não está no conjunto.");
        }
    }
}