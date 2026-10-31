package semana05_revisao.construtores;

public class Agendamento1 {
    private final String nomePet;
    private final String servico;
    private final String horario;
    private final boolean perfume;
    private final boolean laco;
    private final boolean hidratacao;
    private final String observacao;
    private final double desconto;

    // Construtor privado: só o Builder consegue criar um Agendamento
    private Agendamento(Builder builder) {
        this.nomePet = builder.nomePet;
        this.servico = builder.servico;
        this.horario = builder.horario;
        this.perfume = builder.perfume;
        this.laco = builder.laco;
        this.hidratacao = builder.hidratacao;
        this.observacao = builder.observacao;
        this.desconto = builder.desconto;
    }

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String nomePet;
        private String servico;
        private String horario;
        // valores padrão: o que não for informado fica assim
        private boolean perfume = false;
        private boolean laco = false;
        private boolean hidratacao = false;
        private String observacao = "";
        private double desconto = 0.0;

        public Builder nomePet(String nomePet) {
            this.nomePet = nomePet;
            return this;
        }

        public Builder servico(String servico) {
            this.servico = servico;
            return this;
        }

        public Builder horario(String horario) {
            this.horario = horario;
            return this;
        }

        public Builder perfume(boolean perfume) {
            this.perfume = perfume;
            return this;
        }

        public Builder laco(boolean laco) {
            this.laco = laco;
            return this;
        }

        public Builder hidratacao(boolean hidratacao) {
            this.hidratacao = hidratacao;
            return this;
        }

        public Builder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public Builder desconto(double desconto) {
            this.desconto = desconto;
            return this;
        }

        public Agendamento build() {
            if (nomePet == null || servico == null || horario == null) {
                throw new IllegalStateException("nomePet, servico e horario são obrigatórios");
            }
            return new Agendamento(this);
        }
    }
}