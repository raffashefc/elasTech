package semana01_condicionais;
//4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a 
// pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização Faça o mesmo para Faça o mesmo para precisa ter 18 anos e ter autorização.

public class Ex04 {
    public static void main(String[] args) {
        int idade = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Você pode entrar na festa");
        } else {
            System.out.println("Você não pode entrar na festa");
        }   
       
    }
}
