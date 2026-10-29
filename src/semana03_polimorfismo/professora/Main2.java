package semana03_polimorfismo.professora;

public class Main2 {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 22;
        ana.curso = "Análise e Desenvolvimento de Sistemas";

        ana.apresentar();
        flora.apresentar();
        flora.lancarNota(ana.nome, 9.5);

        Pessoa estagiaria = new Estagiaria();
        estagiaria.nome = "Bia";
        estagiaria.idade = 22;
        estagiaria.apresentar();

        mostrarFicha(ana);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);
    }
}