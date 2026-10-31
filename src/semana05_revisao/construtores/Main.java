package semana05_revisao.construtores;

public class Main {
    public static void main(String[] args){
        Agendamento ag1 = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 0.10);

        Agendamento ag2 = new Agendamento(
            "Luna", "tosa", "10h", 
            false, false, false, 
            "", 0.0
        );

        Agendamento ag3 = new Agendamento(
            "Mel", "banho", "16h", 
            false, false, true, 
            "", 0.0);

        ag1.mostrar();
        ag2.mostrar();
        ag3.mostrar();
    }
}
