package semana02_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        try {
            int idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade + " anos.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas um número inteiro válido.");
        }

        scanner.close();
    }
}
