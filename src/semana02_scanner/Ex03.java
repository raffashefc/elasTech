package semana02_scanner;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite a nota da aluna:");
        double nota = scannear.nextDouble();

        if (nota >= 7) {

            System.out.println("Aprovada!");

        } else if (nota >= 5) {

            System.out.println("Recuperação!");

        } else {

            System.out.println("Reprovada!");
        }

        scannear.close();
    }
}