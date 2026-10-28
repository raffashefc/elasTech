package semana03_polimorfismo.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Area do quadrado: " + calc.calcularArea(10.0));
        System.out.println("Area do retangulo: " + calc.calcularArea(10.0, 5.0));
        System.out.println("Area do circulo: " + calc.calcularArea(5));
    }
}
