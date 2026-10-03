package semana01_estruturas_de_repeticao;

public class Ex04 {
    public static void main(String[] args) {
        int numero = 3; 

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}