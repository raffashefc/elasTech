package semana03_heranca;

public class Professora extends Pessoa{
    
    public String disciplina;
    @Override 
    public void apresentar(){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina );
    }
    public void lancarNota(String aluna, double nota){
        System.out.println(nome + " lançou a nota " + nota + " para " + aluna);
    }
}
