//3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

package semana02_arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] notas = {8,6,10,7,9};
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
          soma += notas[i];
        }
       double media = (double) soma / notas.length;
        System.out.println("Soma: " + soma + " Média " + media);
    }
}
