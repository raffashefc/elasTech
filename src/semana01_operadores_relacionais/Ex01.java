package semana01_operadores_relacionais;


public class Ex01 {
    public static void main(String[] args) {

        double nota1 = 10.0;
        double nota2 = 3.0;
        System.out.println("nota1 e nota2 são iguais: " + (nota1 == nota2));
        System.out.println("nota1 e nota2 são diferentes: " + (nota1 != nota2));
        System.out.println("nota1 é maior que nota2: " + (nota1 > nota2));
        System.out.println("nota1 é menor que nota2: " + (nota1 < nota2));

        System.out.println("------------------------------------");
        int a = 10;
        int b = 3;
        System.out.println("a e b são iguais: " + (a == b));
        System.out.println("a e b são diferentes: " + (a != b));
        System.out.println("a é maior que b: " + (a > b));
        System.out.println("a é menor que b: " + (a < b));
        System.out.println("------------------------------------");

        int c = 5;
        int d = 5;
        System.out.println("c e d são iguais: " + (c == d));
        System.out.println("c e d são diferentes: " + (c != d));
        System.out.println("c é maior que d: " + (c > d));
        System.out.println("c é menor que d: " + (c < d));
    }
}
