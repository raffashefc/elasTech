package semana02_scanner;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scannear.nextInt();
        System.out.println("Tabuada do " + numero + " é:");
        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scannear.close();
    }
}