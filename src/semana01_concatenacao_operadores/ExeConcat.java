package semana01_concatenacao_operadores;

public class ExeConcat {
    public static void main(String[] args) {

      
        // 1- Nome, cidade e idade
        String nome = "Ana";
        String cidade = "Salvador";
        int idade = 28;
        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");

        // 2- Produto, preço e quantidade
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = preco * quantidade;
        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);

        // 3- Soma de dois números
        int num1 = 15;
        int num2 = 4;
        int somaEx3 = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + somaEx3 + ".");

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
    }
}