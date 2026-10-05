package semana02_trycatch;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = {8.5, 7.0, 9.2, 6.5, 10.0};

        System.out.print("Digite a posição da nota que deseja ver (0 a 4): ");
        int posicao = scanner.nextInt();

        try {
            double nota = notas[posicao];
            System.out.println("A nota na posição " + posicao + " é: " + nota);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida! O array só possui índices de 0 a 4.");
        }

        scanner.close();
    }
}