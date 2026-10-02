import java.util.Scanner;


public class Ex02 {
    public static void main(String[] args) {
         Scanner scannear = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nome = scannear.nextLine();

        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
        System.out.println("Nome em minúsculo: " + nome.toLowerCase());
        
        scannear.close();
    }

}