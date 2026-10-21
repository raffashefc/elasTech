package semana03_polimorfismo.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.calcularArea(10);
        calc.calcularArea(5);
        calc.calcularArea(10, 10);

        System.out.println("Area do circulo: " + calc.calcularArea(5));
    
    }

}
