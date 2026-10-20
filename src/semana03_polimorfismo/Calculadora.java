package semana03_polimorfismo;

public class Calculadora {
    Double lado;
    Integer raio;
    Double base;
    Double altura;


public Calculadora() {
}

    double calcularArea(double lado){
        return lado * lado;
    }

    double calcularArea(int raio){
        return 3.14 * raio * raio;
    }

    double calcularArea(double base, double altura){
        return base * altura;
    }
}