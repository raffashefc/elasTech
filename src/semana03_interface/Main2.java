package semana03_interface;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

    ArrayList<Veiculo> veiculos = new ArrayList<>();
    veiculos.add(new Moto());
    veiculos.add(new Carro());
        
     for (Veiculo veiculo : veiculos) {
        veiculo.ligar();    
        veiculo.acelerar();    
     }
    }
}