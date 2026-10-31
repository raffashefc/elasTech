package semana06_lambda;

public class Main1 {

    // ---------- Interfaces ----------
    interface Saudacao {
        void executar();
    }

    interface Impressora {
        void imprimir(String texto);
    }

    interface Calculo {
        int calcular(int a, int b);
    }

    interface Acao {
        void executar();
    }

    interface Operacao {
        int aplicar(int n);
    }

    interface Condicao {
        boolean testar(int n);
    }

    // ---------- Métodos que recebem lambdas ----------
    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    static void executarSe(Condicao cond, int valor, Acao acao) {
        if (cond.testar(valor)) {
            acao.executar();
        }
    }

    public static void main(String[] args) {

        // 1 - Saudacao
        System.out.println("--- 1 ---");
        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

        // 2 - Impressora
        System.out.println("\n--- 2 ---");
        Impressora maiusculo = texto -> System.out.println(texto.toUpperCase());
        Impressora minusculo = texto -> System.out.println(texto.toLowerCase());
        maiusculo.imprimir("Java Lambda");
        minusculo.imprimir("Java Lambda");

        // 3 - Calculo
        System.out.println("\n--- 3 ---");
        Calculo soma = (a, b) -> a + b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo maior = (a, b) -> a > b ? a : b;
        System.out.println("Soma: " + soma.calcular(10, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 3));
        System.out.println("Maior: " + maior.calcular(10, 3));

        // 4 - repetir (lambda direto como argumento)
        System.out.println("\n--- 4 ---");
        repetir(() -> System.out.println("oi"));

        // 5 - mostrarResultado
        System.out.println("\n--- 5 ---");
        mostrarResultado(n -> n * 2, 5);       // dobro
        mostrarResultado(n -> n * n, 5);       // quadrado
        mostrarResultado(n -> -n, 5);          // negativo

        // 6 - executarSe
        System.out.println("\n--- 6 ---");
        executarSe(n -> n % 2 == 0, 4, () -> System.out.println("é par!"));
        executarSe(n -> n % 2 == 0, 7, () -> System.out.println("é par!")); // nada acontece
    }
}