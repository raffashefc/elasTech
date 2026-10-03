package semana01_condicionais;

public class Ex03 {
    public static void main(String[] args) {
        int opcao = 3;
        String opcaoCafe = "Café";
        String opcaoCappuccino = "Cappuccino";
        String opcaoChocolate = "Chocolate quente";
        String opcaoCha = "Chá";

        switch (opcao) {
            case 1:
                System.out.println(opcaoCafe);
                break;
            case 2:
                System.out.println(opcaoCappuccino);
                break;
            case 3:
                System.out.println(opcaoChocolate);
                break;
            case 4:
                System.out.println(opcaoCha);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }   
}
