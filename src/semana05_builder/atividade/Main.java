package semana05_revisao.construtores;

public class Main {
    public static void main(String[] args) {
        Agendamento ag1 = Agendamento.builder()
                .nomePet("Thor")
                .servico("banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .observacao("alérgico a shampoo")
                .desconto(0.10)
                .build();

        Agendamento ag2 = Agendamento.builder()
                .nomePet("Luna")
                .servico("tosa")
                .horario("10h")
                .build();

        Agendamento ag3 = Agendamento.builder()
                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        ag1.mostrar();
        ag2.mostrar();
        ag3.mostrar();
    }
}