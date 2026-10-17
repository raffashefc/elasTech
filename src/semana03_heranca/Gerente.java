package semana03_heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    public void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando dados de " + nome + " para PDF...");
    }
}