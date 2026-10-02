import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scannear.nextLine();

        System.out.println("Quantidade de caracteres: " + nome.length());

        scannear.close();
    }
}