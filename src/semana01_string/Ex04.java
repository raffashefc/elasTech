import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);

        System.out.println("Digite sua frase:");
        String frase = scannear.nextLine();
        System.out.println("Digite a palavra que deseja buscar:");
        String palavra = scannear.nextLine();
        
        System.out.println("A palavra '" + palavra + "' aparece na frase '" + frase + "'? " + frase.contains(palavra));
        scannear.close();
    }
}
