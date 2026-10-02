import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
         Scanner scannear = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome1 = scannear.nextLine();
        System.out.println("Digite outro nome:");
        String nome2 = scannear.nextLine();
        
        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));
        scannear.close();
    }
}