package semana03_interface;


public class Moto implements Veiculo {
    @Override 
    public void ligar(){
    System.out.println("Moto ligado!");
    }

    @Override 
    public void acelerar(){
    System.out.println("Moto acelerando!");
    }
}