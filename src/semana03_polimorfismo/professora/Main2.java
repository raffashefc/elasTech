package semana03_polimorfismo.professora;

public class Main2 {
    public static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 22;
        ana.curso = "Análise e Desenvolvimento de Sistemas";

        flora.lancarNota(ana.nome, 9.5);
    }
}