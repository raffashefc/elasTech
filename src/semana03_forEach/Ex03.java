package semana03_forEach;

public class Ex03 {
    public static void main(String[] args) {
        int[] notas = {8, 6, 10, 7};
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        System.out.println("Soma: " + soma);

        double media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}
