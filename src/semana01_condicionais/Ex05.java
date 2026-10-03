package semana01_condicionais;
public class Ex05 {
    public static void main(String[] args) {
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovada!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovada!");
        }
    }
}
