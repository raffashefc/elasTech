package semana02_trycatch;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número divisor para 100: ");
        int numero = scanner.nextInt();

        try {
            int resto = 100 % numero;
            System.out.println("O resto da divisão de 100 por " + numero + " é: " + resto);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível calcular o resto da divisão por 0.");
        }

        scanner.close();
    }
}
