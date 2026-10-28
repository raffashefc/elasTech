package semana03_heranca;

public class Main1 {
    public static void main(String[] args) {
        Diretora carla = new Diretora();
        carla.nome = "Carla";

        carla.baterPonto();

        carla.aprovarFerias("Rafaela");

        carla.notificar("Reunião de diretoria às 15h");
        carla.exportar();

        carla.definirMeta("Aumentar faturamento em 30%");
    }
}