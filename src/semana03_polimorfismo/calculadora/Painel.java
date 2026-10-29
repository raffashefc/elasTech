package semana03_polimorfismo.calculadora;

public class Painel {

    public void exibir(String texto) {
        System.out.println("Recebi uma String: " + texto);
    }

    public void exibir(int numero) {
        System.out.println("Recebi um int: " + numero);
    }

    public void exibir(boolean valor) {
        System.out.println("Recebi um boolean: " + valor);
    }

    public void exibir(double numero) {
        System.out.println("Recebi um double: " + numero);
    }
}