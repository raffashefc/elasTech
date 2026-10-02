import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scannear.nextLine();

        System.out.println("A primeira letra do nome é: " + nome.charAt(0));
        scannear.close();
    }
}