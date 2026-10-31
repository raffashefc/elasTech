package observer.voo;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro("João");
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(passageiro);
        voo.adicionarObservador(painel);

        System.out.println("--- Atualização 1 ---");
        voo.mudarStatus("Embarque iniciado");

        System.out.println("\n--- Atualização 2 ---");
        voo.mudarStatus("Atrasado");
    }
}