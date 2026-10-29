package semana03_polimorfismo.professora;

public class Professora extends Pessoa {
    String disciplina;

    @Override
    void apresentar() {
        System.out.println("Oi, sou a professora " + nome + " de " + disciplina);
    }

    void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
    }
}