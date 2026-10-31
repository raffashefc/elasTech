package observer.voo;

public class Passageiro implements ObservadorVoo {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro " + nome + " avisado: " + status);
    }
}