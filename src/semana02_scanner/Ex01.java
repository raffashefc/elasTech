package semana02_scanner;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scannear.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scannear.nextInt();

        int proximaIdade = idade + 1;

        System.out.println(
            "Oi " + nome +
            ", você tem " + idade +
            " anos e vai fazer " +
            proximaIdade +
            " no próximo aniversário."
        );

        scannear.close();
    }
}