package semana01_condicionais;

public class Ex01 {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;

        if (idade < 13) {
            categoria = "Criança";
        } else if (idade >= 13 && idade <= 17) {
            categoria = "Adolescente";
        } else if (idade >= 18 && idade <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        System.out.println("A pessoa pertence à categoria: " + categoria);
    }
}
