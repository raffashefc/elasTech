package semana05_revisao.construtores;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;


    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar(){
        System.out.println("--- Agendamento ---");
        System.out.println("Pet: " + this.nomePet);
        System.out.println("Serviço: " + this.servico);
        System.out.println("Horário: " + this.horario);
        System.out.println("Perfume: " + this.perfume);
        System.out.println("Laço: " + this.laco);
        System.out.println("Hidratação: " + this.hidratacao);
        System.out.println("Observação: " + this.observacao);
        System.out.println("Desconto: " + this.desconto);
        System.out.println();
    }
}
