//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.


package semana02_arrays;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);

        int[] numero = new int[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero "  + ":");
            numero[i] = scannear.nextInt();
        }

        for(int i = numero.length - 1; i >= 0; i--) {
            System.out.println("Numero " + (i + 1) + ": " + numero[i]);
        }
        scannear.close();
    }
}
