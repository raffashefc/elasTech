package semana03_heranca;

public class Main {
    public static void main(String[] args) {
      
        Aluna aluna = new Aluna();

        aluna.nome = "Brianna";
        aluna.idade = 28;
        aluna.curso = "Java";

        aluna.apresentar();
        aluna.estudar();

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 23;
        professora.disciplina = "Programação";

        professora.apresentar();
        professora.lancarNota(aluna.nome, 8.5);
    }
}
