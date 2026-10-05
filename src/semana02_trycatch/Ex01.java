package semana02_trycatch;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("O resultado da divisão de " + num1 + " por " + num2 + " é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }

        scanner.close();
    }
}