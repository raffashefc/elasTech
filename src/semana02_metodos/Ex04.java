package semana02_metodos;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scannear.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scannear.nextDouble();
        double media = calcularMedia(nota1, nota2);
        System.out.println("Média: " + media);
        scannear.close();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
}