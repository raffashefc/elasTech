package semana02_scanner;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scannear.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scannear.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        scannear.close();
    }
}