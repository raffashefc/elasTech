package semana05_revisao.construtores;

import lombok.Builder;

@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    @Builder.Default
    private String observacao = "";
    @Builder.Default
    private double desconto = 0.0;

    public void mostrar() {
        System.out.println("--- Agendamento ---");
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto);
        System.out.println();
    }
}