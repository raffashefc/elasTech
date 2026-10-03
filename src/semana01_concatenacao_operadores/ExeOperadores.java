package semana01_concatenacao_operadores;

public class ExeOperadores {
    public static void main(String[] args) {

      
// 1- Operações com números inteiros (a = 10, b = 3)
        int aInt = 10;
        int bInt = 3;
        System.out.println("Soma: " + (aInt + bInt));
        System.out.println("Subtração: " + (aInt - bInt));
        System.out.println("Multiplicação: " + (aInt * bInt));
        System.out.println("Divisão: " + (aInt / bInt)); // Divisão inteira resulta em 3
        System.out.println("Resto: " + (aInt % bInt));

        // 2- Operações com números decimais (a = 10.0, b = 3.0)
        double aDouble = 10.0;
        double bDouble = 3.0;
        System.out.println("Soma decimal: " + (aDouble + bDouble));
        System.out.println("Subtração decimal: " + (aDouble - bDouble));
        System.out.println("Multiplicação decimal: " + (aDouble * bDouble));
        System.out.println("Divisão decimal: " + (aDouble / bDouble));
        System.out.println("Resto decimal: " + (aDouble % bDouble));

        // 3- Soma e média de três notas (8, 6 e 10)
        double nota1 = 8.0;
        double nota2 = 6.0;
        double nota3 = 10.0;
        double somaNotas = nota1 + nota2 + nota3;
        double media = somaNotas / 3.0;
        System.out.println("A soma das notas é: " + somaNotas + " e a média é: " + media);

        // 4- Operação a + b * c (a = 3, b = 4, c = 5)
        int a = 3;
        int b = 4;
        int c = 5;
        int resultado4 = a + b * c; // A multiplicação (b * c) ocorre antes da soma
        System.out.println("Resultado de a + b * c: " + resultado4);

        // 5- Operação (a + b) * c (a = 3, b = 4, c = 5)
        int resultado5 = (a + b) * c; // A soma (a + b) ocorre primeiro por conta dos parênteses
        System.out.println("Resultado de (a + b) * c: " + resultado5);

        // Desafio: Conversão de segundos em minutos e segundos restantes
        int totalSegundos = 3785;
        int minutos = totalSegundos / 60;
        int segundosRestantes = totalSegundos % 60;
        System.out.println(totalSegundos + " segundos equivalem a " + minutos + " minutos e " + segundosRestantes + " segundos.");
    }
}