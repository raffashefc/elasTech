package semana03_polimorfismo;

public class Mai2n {
    public static void main(String[] args) {
        // Criando e configurando a Professora
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