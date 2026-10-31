package observer.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        System.out.println("--- Alteração 1 ---");
        estoque.setQuantidade(15);

        System.out.println("--- Alteração 2 ---");
        estoque.setQuantidade(42);
    }
}