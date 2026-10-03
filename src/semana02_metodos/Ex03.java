package semana02_metodos;

public class Ex03 {
    public static void main(String[] args) {
        int resultado = dobro(7);
        System.out.println("O resultado do dobro de " + 7 + " é: " + resultado);
    }

    public static int dobro(int numero) {
        return numero * 2;
    }
}
