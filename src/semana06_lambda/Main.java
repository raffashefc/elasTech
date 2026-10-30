package semana06_lambda;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // 1 - Runnable
        System.out.println("--- 1 - Runnable ---");
        Runnable tarefa1 = () -> System.out.println("executando tarefa");
        Runnable tarefa2 = () -> System.out.println("executando segunda tarefa");

        tarefa1.run();
        tarefa2.run();

        // 2 - Consumer
        System.out.println("\n--- 2 - Consumer ---");
        Consumer<String> saudacao = nome -> System.out.println("Olá, " + nome);
        Consumer<String> maiusculo = nome -> System.out.println(nome.toUpperCase());

        saudacao.accept("Flora");
        maiusculo.accept("Flora");

        // 3 - Supplier
        System.out.println("\n--- 3 - Supplier ---");
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());

        Supplier<Integer> aleatorio = () -> new Random().nextInt(100);
        System.out.println("Primeiro número: " + aleatorio.get());
        System.out.println("Segundo número: " + aleatorio.get());

        // 4 - Predicate
        System.out.println("\n--- 4 - Predicate ---");
        Predicate<Integer> maiorQueDez = numero -> numero > 10;
        System.out.println("5 é maior que 10? " + maiorQueDez.test(5));
        System.out.println("15 é maior que 10? " + maiorQueDez.test(15));

        Predicate<String> estaVazio = texto -> texto.isEmpty();
        System.out.println("\"\" está vazio? " + estaVazio.test(""));
        System.out.println("\"Java\" está vazio? " + estaVazio.test("Java"));

        // 5 - Function
        System.out.println("\n--- 5 - Function ---");
        Function<Integer, String> notaFiscal = numero -> "Nota fiscal nº: " + numero;
        System.out.println(notaFiscal.apply(1542));

        Function<String, Integer> contaLetras = palavra -> palavra.length();
        System.out.println("Letras em \"Professor\": " + contaLetras.apply("Professor"));
    }
}