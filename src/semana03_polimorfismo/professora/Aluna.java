package semana03_polimorfismo.professora;

public class Aluna extends Pessoa {
    String curso;

    @Override
    void apresentar() {
        System.out.println("Oi, sou " + nome + ", aluna de " + curso);
    }
}