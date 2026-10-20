package semana03_polimorfismo;

public class Professora extends Pessoa {
    String disciplina;

    public void lancarNote(String aluna, double nota){
        System.out.println("Aluna: " + aluna + " Nota: " + nota);
    }
}
